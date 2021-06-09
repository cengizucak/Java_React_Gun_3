package inheritance2;

public class CostumerManager {

    private BaseLogger logger;

    public CostumerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void Add(){
        System.out.println("Musteri eklendi");
        this.logger.Log("Log Mesaji");

    }
}
