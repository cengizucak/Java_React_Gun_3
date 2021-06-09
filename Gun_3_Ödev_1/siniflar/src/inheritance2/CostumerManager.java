package inheritance2;

public class CostumerManager {

    public void add(String cc,String bb){
        System.out.println("Musteri eklendi" +cc);
    }public void update(){
        System.out.println("Musteri guncellendi");
    }

    int aa;
    int id;

    public CostumerManager(int aa, int id) {
        this.aa = aa;
        this.id = id;
    }
}
