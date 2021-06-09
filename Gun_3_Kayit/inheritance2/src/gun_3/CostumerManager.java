package gun_3;

public class CostumerManager extends Logger{
    //? musteri ekleme kodlari

    public void add(Logger logger){

        System.out.println("Musteri Eklendi");

        logger.log();

        //DatabaseLogger logger = new DatabaseLogger(); bu kod new lenemez
    }
}
