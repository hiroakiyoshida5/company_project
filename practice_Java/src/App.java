import java.util.List;
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
        System.out.println("service " + service);
        System.out.println(service.getAverageAge());
        System.out.println(service.getTotalPoint());
        System.out.println(service.findByName("hiroaki"));
    }
}
