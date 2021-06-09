package reCampDemo;

public class Main {

    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int topla =dortIslem.topla(3,7);

        System.out.println(topla);
        System.out.println(dortIslem.cikar(7,5));
        System.out.println(dortIslem.böl(7,5));
        System.out.println(dortIslem.carp(3,7));
        System.out.println(dortIslem.mod(23,3));



        System.out.println("mod : "+(45%8));
        System.out.println("mod : "+(7%3));



    }
}
