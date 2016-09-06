import java.io.Console;
import java.util.List;

public class App{
  public static void main (String[] args) {
    Console c = System.console();
    int userNumber = Integer.parseInt(c.readLine("Enter a number "));
    PingPong pingPong = new PingPong();
    List<Object> pingPongResult = pingPong.runPingPong(userNumber);
    System.out.println(pingPongResult);
  }
}
