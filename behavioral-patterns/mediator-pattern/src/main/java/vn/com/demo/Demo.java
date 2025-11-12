package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 12/11/2025
 */
public class Demo {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatServer();

        User userA = new User("alice", mediator);
        User userB = new User("bob", mediator);

        mediator.registerUser(userA);
        mediator.registerUser(userB);

        userA.sendMessage("Hi bob");
        userB.sendMessage("Hi alice");
    }
}
