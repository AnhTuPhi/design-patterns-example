package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 12/11/2025
 */
public class User {
    private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator med) {
        this.name = name;
        this.mediator = med;
    }

    public void sendMessage(String msg) {
        System.out.println(this.name + ": Sending Message = " + msg);
        mediator.sendMessage(msg, this);
    }

    public void receiveMessage(String msg) {
        System.out.println(this.name + ": Received Message = " + msg);
    }
}
