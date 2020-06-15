package Encapsulation;

public class ShoppingCart {


    public static void main(String[] args) {


        Walmart walmart = new Walmart();

        walmart.setCars("coolant");
        walmart.setTv("samsung");

        System.out.println(walmart.getCars() +  walmart.getTv());


    }




}
