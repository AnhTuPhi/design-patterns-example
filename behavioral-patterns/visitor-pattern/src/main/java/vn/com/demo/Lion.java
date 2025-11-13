package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class Lion implements Animal {

    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
