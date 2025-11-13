package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public interface AnimalVisitor {
    void visit(Lion animal);
    void visit(Tiger animal);
    void visit(Elephant animal);
}
