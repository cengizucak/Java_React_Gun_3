package gun_3;

public class CostumerManager {

    public void add(Costumer costumer) {

        System.out.println(costumer.costumerNumber + " : kaydedildi");
        System.out.println(costumer);


    }

    //* bulk insert
    public void addMultible(Costumer[] costumers) {
        for (Costumer costumer : costumers) {
            add(costumer);
        }
    }
}
