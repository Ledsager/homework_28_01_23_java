package personal.model;

import java.util.List;

public interface Repository {
    List<User> getAllUsers();
    String CreateUser(User user);
    void DeleteUserId(String user);
    void UpdateUser(User user, Fields field, String param);
}
