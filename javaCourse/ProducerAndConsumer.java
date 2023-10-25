package javaCourse;


class Manager {                    //notify producer and consumer
    private int productNum = 0;


    public synchronized void addProduct() {

        if (productNum >= 20) {
            try {
                wait(); //wait() has to be inside synchronized block
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else

            productNum++;
        System.out.println(Thread.currentThread().getName() + "\tmade\t" + productNum + "th\tproduct");
        notifyAll();
    }

    public synchronized void minusProduct() {

        if (productNum <= 0) {
            try {
                this.wait(); //wait() has to be inside synchronized block, current object or instance can use this wait() and notify() methods
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(Thread.currentThread().getName() + "\tused\t" + productNum + "th\tproduct");
            productNum--;
            notifyAll();
        }
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

/**
 *
 */
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
                Thread.sleep(200);
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
        Consumer consumer2 = new Consumer(manager);

        producer.setName("Producer1");
        consumer.setName("Consumer1");
        consumer2.setName("Consumer2");

        producer.start();
        consumer.start();
        consumer2.start();

    }

}
