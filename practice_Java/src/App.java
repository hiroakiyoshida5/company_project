import java.util.List;

import model.User;
import service.UserService;

import java.util.ArrayList;



public class App {

    public static List<User> createUser() {
        List<User> users = new ArrayList<>();

        users.add(new User("hiroaki", 80, 24));
        users.add(new User("yoshida", 60, 22));
        users.add(new User("hoge", 70, 36));

        return users;
    }
    public static void main(String[] args) throws Exception {
        List<User> users = createUser();
        UserService service = new UserService(users);
        System.out.println(service.getUsers());
        System.out.println("addします。");
        service.getUsers().add(new User("hogetaro", 50, 90));
        System.out.println(service.getUsers());
        System.out.println("service.usersの要素数"+service.getUsers().size());

    }
}
