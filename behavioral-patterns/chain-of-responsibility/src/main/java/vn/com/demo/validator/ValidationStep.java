package vn.com.demo.validator;

import jakarta.annotation.PostConstruct;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/11/2025
 */
public abstract class ValidationStep<T> {

    @PostConstruct
    public void setup() {
        this.buildChain();
    }

    private ValidationStep<T> next;

    public ValidationStep<T> next(ValidationStep<T> next) {
        this.next = next;
        return next;
    }

    public abstract void validate(T command);

    public void buildChain() {

    }

    protected void validateNext(T command) {
        if (next == null) {
            return;
        }
        next.validateNext(command);
    }
}
