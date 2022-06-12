package ArrayLists;

import java.util.ArrayList;

public class MainArray {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Tesla");
        cars.add("Toyota");
        cars.add("Honda");
        cars.add("BMW");
        cars.add("Kia");
        cars.add("Buick");
        cars.add("Audi");

        cars.set(1,"Lamborghini");


        System.out.println(cars);

        System.out.println(cars.size());


    }

}
