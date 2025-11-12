package vn.com.demo;

/**
 * @author: tu.phianh
 * @mail: tu.phianh@ivnd.com.vn
 * @created: 12/11/2025
 */
public interface ChatMediator {
    void sendMessage(String message, User user);

    void registerUser(User user);
}
