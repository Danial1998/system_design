public class Main {

    public static void main(String[] args) {
        LockerManager lockerManager = new LockerManager(5);

        User user1 = new User("user1");
        User user2 = new User("user2");

        Package pkg1 = new Package("pkg1",user1);

        lockerManager.assignLockerToPackage(pkg1);

        lockerManager.retrievePackage(1,user1,"12346");
    }
}
