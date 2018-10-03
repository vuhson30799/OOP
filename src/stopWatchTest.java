import javafx.scene.paint.Stop;

public class stopWatchTest {
    public static void main(String[] args) {
        stopWatch Stopwatch = new stopWatch();
Stopwatch.start();
        Stopwatch.stop();
        System.out.println(Stopwatch.getElapseTime());
    }


}
