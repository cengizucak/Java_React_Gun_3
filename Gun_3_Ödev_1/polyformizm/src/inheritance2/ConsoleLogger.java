package inheritance2;

public class ConsoleLogger extends BaseLogger {

    @Override
    public void Log(String message) {
        System.out.println("CosoleLogger : " + message);
    }
}
