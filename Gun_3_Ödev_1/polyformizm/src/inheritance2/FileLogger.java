package inheritance2;

public class FileLogger extends BaseLogger{
    @Override
    public void Log(String message) {
        System.out.println("FileLogger : "+message);
    }
}
