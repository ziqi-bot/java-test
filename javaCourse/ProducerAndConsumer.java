package javaCourse;


class Manager {                    //notify producer and consumer
    private int productNum = 0;


    public synchronized void addProduct() {

        if (productNum >= 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        productNum++;
        System.out.println(Thread.currentThread().getName() + "Produced" + productNum);
    }

    public synchronized void minusProduct() {

        if (productNum <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "Consumed" + productNum);
        productNum--;

    }
}

class Producer extends Thread {
    private Manager manager;

    public Producer(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void run() {

        while (true) {
            System.out.println("Producing...");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            manager.addProduct();
        }

    }
}

class Consumer extends Thread {

    private Manager manager;

    public Consumer(Manager manager) {
        this.manager = manager;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Consuming...");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            manager.minusProduct();
        }

    }
}

public class ProducerAndConsumer {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Producer producer = new Producer(manager);
        Consumer consumer = new Consumer(manager);
        producer.setName("Producer1");
        consumer.setName("Consumer1");
        producer.start();
        consumer.start();

    }

}