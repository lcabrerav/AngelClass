package Teaching;

public class Models {


    public static void main(String[] args) {


        String car = null;
        String car2 = "ferrari";
        String car3 = "mercedes";

        Cars cars = new Cars(car,car2,car3);

        cars.getItalian();
        cars.getMuscle();
        cars.getGerman();



    }







}
