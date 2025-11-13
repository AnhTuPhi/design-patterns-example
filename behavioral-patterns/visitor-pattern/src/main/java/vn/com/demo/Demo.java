package vn.com.demo;

import java.util.Arrays;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class Demo {

    public static void main(String[] args) {
        Animal[] animals = new Animal[] {new Lion(), new Tiger(), new Elephant()};

        AnimalVisitor feedingVisitor = new FeedingService();
        AnimalVisitor excersiseVisitor = new ExcersiseService();

        System.out.println("Feeding time:");
        Arrays.stream(animals).forEach(animal -> animal.accept(feedingVisitor));

        System.out.println("Exercise time:");
        Arrays.stream(animals).forEach(animal -> animal.accept(excersiseVisitor));
    }
}
