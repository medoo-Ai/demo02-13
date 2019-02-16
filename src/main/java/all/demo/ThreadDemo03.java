package all.demo;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @auther SyntacticSugar
 * @data 2019/2/16 0016下午 4:20
 */
public class ThreadDemo03 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("implements Callable<String> 实现多线程");
        return null;
    }
}
class Runit3{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ThreadDemo03 threadDemo03 = new ThreadDemo03();
            FutureTask<String> stringFutureTask = new FutureTask<>(threadDemo03);
            //
            new Thread(stringFutureTask).start();
        }
    }
}
