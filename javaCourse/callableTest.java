package javaCourse;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class callableTest {


    public static void main(String[] args) {



    FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
    Thread thread = new Thread(futureTask);
    thread.start();

// 获取任务执行结果

        Integer result;

    {
        try {
            result = futureTask.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
        System.out.println("Callable task result: " + result);



}

    static Callable<Integer> myCallable = () -> {
        // 任务执行的代码，返回一个结果
        return 42;
    };

}
