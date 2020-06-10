package Teaching;

public class Cars {



    private String german = "BMw M3";
    private String muscle = "Chevrolet Camaro";
    private String italian= "Ferrari Enzo";


    public Cars(){}

    public Cars(String car){
        this.german=car;

    }

    public Cars(String car1, String car2,String car3)
    {
        this.italian=car2;
        this.muscle = car1;
        this.german=car3;


    }

    public void getGerman ()
    {

        System.out.println(german);
    }

    public void getMuscle()
    {
        System.out.println(muscle);
    }

    public void getItalian()
    {

        System.out.println(italian);

    }











}
