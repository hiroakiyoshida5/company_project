import java.util.List;
import java.util.ArrayList;


class User {
    String name;
    int point;
    int age;
    User (String name, int point, int age) {
        this.name = name;
        this.point = point;
        this.age = age;
    }
}


class UserService {
    List<User> users;

    UserService(List<User> users) {
        this.users = users;
    }

    public double getAverageAge() {
        double sum = 0;
        for (User user : users) {
            sum += user.age;
        }
        return sum / users.size();
    }

    public int getTotalPoint() {
        int sum = 0;
        for (User user : users) {
            sum += user.point;
        }
        return sum;
    }

    public boolean findByName(String name) {
        System.out.println(name + "の検索の結果・・・");
        boolean flag = false;
        for (User user : users) {
            if (user.name.equals(name)) {
                return flag = true;
            }
        }
        return flag;
    }
}

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
