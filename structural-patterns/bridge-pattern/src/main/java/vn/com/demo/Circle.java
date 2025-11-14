package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 14/11/2025
 */
public class Circle extends Shape{

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle in");
        color.applyColor();
    }
}
