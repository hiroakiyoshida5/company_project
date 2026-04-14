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



public class App {

    public static void main(String[] args) throws Exception {
        User user = new User("hiroaki", 90, 24);
        System.out.println(user);
        System.out.println(user.name);
        System.out.println(user.age);
        System.out.println(user.point);


    }
}
