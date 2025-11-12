package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 12/11/2025
 */
public class Item {
    private String name;
    private int age;

    public Item(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
