package all.demo;

/**
 * @auther SyntacticSugar
 * @data 2019/2/16 0016下午 4:20
 */
public class ThreadDemo02 implements  Runnable{
    @Override
    public void run() {
        System.out.println("implements Runnable 实现多线程");
    }
}
class RunIt2{
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new ThreadDemo02()).start();
        }
    }
}