package all.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @auther SyntacticSugar
 * @data 2019/2/16 0016下午 4:20
 */
public class ThreadDemo04 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executors newFixedThreadPool 的方式创建");
                }
            });
        }
        executorService.shutdown();
    }
}
//缓存线程池
class ThreadDemo042 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Executors newCachedThreadPool 的方式创建");
                }
            });
        }
        executorService.shutdown();
    }
}
