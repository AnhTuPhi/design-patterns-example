package vn.com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class GameMemento {
    private final String position;
    private final int score;
    private final List<String> items;

    public GameMemento(String position, int score, List<String> items) {
        this.position = position;
        this.score = score;
        this.items = items;
    }

    // Getters
    public String getPosition() {
        return position;
    }

    public int getScore() {
        return score;
    }

    public List<String> getItems() {
        return new ArrayList<>(items);
    }
}
