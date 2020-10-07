package References;

import java.util.ArrayList;

public class ArrayListExamples {

    public static void main(String[] args) {

        //ArrayList are Dynamic
        ArrayList fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Strawberry");

        fruits.remove("Apple");
        fruits.clear();

        fruits.add("Pear");
        fruits.add("Watermelon");
        System.out.println(fruits);

    }
}
