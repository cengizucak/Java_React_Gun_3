package gun_3;

public class Main {  //* birbirini altarnetifi olan kodbloklari icin if yazilmaz

    public static void main(String[] args) {


        CostumerManager costumerManager = new CostumerManager();
        costumerManager.add(new EmailLogger());

    }
}
