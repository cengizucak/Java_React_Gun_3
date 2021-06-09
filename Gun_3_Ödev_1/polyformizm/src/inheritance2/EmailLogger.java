package inheritance2;

public class EmailLogger extends BaseLogger{
    @Override
    public void Log(String message) {
        System.out.println("EmailLogger : "+message);
    }
}
