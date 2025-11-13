package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 13/11/2025
 */
public class Demo {

    public static void main(String[] args) {
        Game game = new Game();
        GameCaretaker caretaker = new GameCaretaker();

        game.setPosition("New game");
        game.setScore(0);
        game.addItem("Sword");
        caretaker.add(game.save());

        game.setPosition("Chapter 1");
        game.setScore(10);
        game.addItem("Shield");
        game.restore(caretaker.get(0));
        System.out.println("Current Position: " + game.save().getPosition());
        System.out.println("Current Score: " + game.save().getScore());
    }
}
