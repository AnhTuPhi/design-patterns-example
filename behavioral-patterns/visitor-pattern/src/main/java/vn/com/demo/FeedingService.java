package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class FeedingService implements AnimalVisitor {

    @Override
    public void visit(Lion lion) {
        System.out.println("Feeding the lion with some meat.");
    }

    @Override
    public void visit(Tiger tiger) {
        System.out.println("Feeding the tiger with chicken.");
    }

    @Override
    public void visit(Elephant elephant) {
        System.out.println("Feeding the elephant with fruits and vegetables.");
    }
}
