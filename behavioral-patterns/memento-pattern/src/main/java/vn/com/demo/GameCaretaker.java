package vn.com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class GameCaretaker {
    private List<GameMemento> history = new ArrayList<>();

    public void add(GameMemento memento) {
        history.add(memento);
    }

    public GameMemento get(int index) {
        return history.get(index);
    }
}
