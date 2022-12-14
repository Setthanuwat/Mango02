public class Main {
    public static void main(String[] args) {
//        User john = new User("John", 1954, 2, 18);
//        john.doSomething();

        Admin nick = new Admin();
        nick.setName("Nick");
        nick.doSomething();
        nick.doSomething(4);
        nick.doExtra();

    }
}