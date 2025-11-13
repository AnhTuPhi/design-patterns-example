package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class ExcersiseService implements AnimalVisitor{

    @Override
    public void visit(Lion lion) {
        System.out.println("Taking the lion for a run.");
    }

    @Override
    public void visit(Tiger tiger) {
        System.out.println("Making the tiger jump through hoops.");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Walking the elephant around the zoo.");
    }
}
