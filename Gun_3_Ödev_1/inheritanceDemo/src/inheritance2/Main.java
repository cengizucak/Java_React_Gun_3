package inheritance2;

public class Main {

    public static void main(String[] args) {


        OgretmenManager ogretmenManager = new OgretmenManager();
       // ogretmenManager.hesapla();

        KrediUI krediUI = new KrediUI();
        krediUI.krediHesapla(new OgretmenManager());



    }
}
