package inheritance2;

public class DatabaseLogger extends BaseLogger{

    @Override
    public void Log(String message) {

        System.out.println("DataBaseLogger : "+message);
    }
}
