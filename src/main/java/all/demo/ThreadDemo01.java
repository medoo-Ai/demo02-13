package all.demo;

/**
 * @auther SyntacticSugar
 * @data 2019/2/16 0016下午 4:20
 */
public class ThreadDemo01 extends Thread {
    @Override
    public void run() {
        System.out.println("extends Thread 实现多线程");
    }
}
class RunIt{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new ThreadDemo01().start();
        }
    }
}
