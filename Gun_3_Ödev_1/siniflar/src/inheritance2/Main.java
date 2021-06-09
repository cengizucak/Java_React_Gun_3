package inheritance2;

public class Main {

    public static void main(String[] args) {


        CostumerManager costumerManager = new CostumerManager(45, 88);
        CostumerManager costumerManager2 = new CostumerManager(22, 33);
        costumerManager = costumerManager2;


        System.out.println(costumerManager.aa + "  : " + costumerManager.id);
        System.out.println(costumerManager2.aa + " : " + costumerManager2.id);


        int s1 = 10;
        int s2 = 20;

        s2 = s1;
        s1 = 30;

        System.out.println(s2);

        int[] sayilar1 = {1, 2, 3};
        int[] sayilar2 = {4, 5, 6};
        System.out.println("");
        sayilar2 = sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);


    }
}
