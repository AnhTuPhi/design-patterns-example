package vn.com.demo.validator;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 11/11/2025
 */
public abstract class Validation<T> extends ValidationStep<T> {

    @PostConstruct
    @Override
    public void setup() {
        this.buildSubChain();
    }

    private final List<ValidationStep<T>> subChains = new ArrayList<>();

    @Override
    public void validate(T command) {
        subChains.forEach(step -> step.validate(command));
    }

    public Validation<T> addSubChain(ValidationStep<T> step) {
        subChains.add(step);
        return this;
    }

    public abstract void buildSubChain();
}
