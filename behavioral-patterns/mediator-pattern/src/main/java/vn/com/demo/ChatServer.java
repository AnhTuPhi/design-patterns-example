package vn.com.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 12/11/2025
 */
public class ChatServer implements ChatMediator{

    private List<User> users;

    public ChatServer() {
        this.users = new ArrayList<>();
    }

    @Override
    public void registerUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : users) {
            // message should not be received by the user sending it
            if (u != user) {
                u.receiveMessage(msg);
            }
        }
    }
}
