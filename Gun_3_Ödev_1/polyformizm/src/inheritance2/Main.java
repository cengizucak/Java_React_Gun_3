package inheritance2;

public class Main {

    public static void main(String[] args) {

      /* BaseLogger[] baseLoggers={new DatabaseLogger(),new EmailLogger(),new FileLogger(),new ConsoleLogger()};

       for (BaseLogger logger:baseLoggers){
           logger.Log("Log messagi ");
       }*/

        CostumerManager manager = new CostumerManager(new FileLogger());
        manager.Add();

    }
}
