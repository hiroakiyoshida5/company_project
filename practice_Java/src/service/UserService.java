package service;
import java.util.List;

import model.User;

public class UserService {
    private List<User> users;

    public UserService(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers (){
        return users;
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
