package vn.com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class Game {
    private String position;
    private int score;
    private List<String> items;

    public Game() {
        items = new ArrayList<>();
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addItem(String item) {
        items.add(item);
    }

    public GameMemento save() {
        return new GameMemento(position, score, items);
    }

    public void restore(GameMemento memento) {
        position = memento.getPosition();
        score = memento.getScore();
        items = memento.getItems();
    }
}
