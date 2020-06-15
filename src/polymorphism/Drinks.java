package polymorphism;

public class Drinks {


    public void shot(String alcoholType)
    {
        System.out.println(alcoholType);

    }
    public void shot (String alcoholType, String softDrink){

        System.out.println(alcoholType + softDrink);
    }

    public void shot(String alcoholType, int number)
    {

        System.out.println(number);



    }







}
