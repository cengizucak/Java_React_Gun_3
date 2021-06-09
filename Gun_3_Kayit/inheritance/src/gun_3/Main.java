package gun_3;

public class Main {

    public static void main(String[] args) {

        IndividualCostumer cengiz = new IndividualCostumer();
        cengiz.costumerNumber = "12345";


        CorporateCostumer hepsiBurada = new CorporateCostumer();
        hepsiBurada.costumerNumber = "78940";

        SendikaCostumer abc = new SendikaCostumer();
        abc.costumerNumber="9999999";

        CostumerManager costumerManager = new CostumerManager();

        Costumer[] costumers={abc,cengiz,hepsiBurada};

        costumerManager.addMultible(costumers);
    }
}
