package inheritance2;

public class Main {

    public static void main(String[] args) {

  BaseKrediManager[] krediManagers={new OgretmenKrediManager(),
          new TarimKrediManager(),new OgrenciKrediManager()};

  for (BaseKrediManager krediYönetimi:krediManagers){
      System.out.println(krediYönetimi.hesapla(1000));

  }


    }
}
