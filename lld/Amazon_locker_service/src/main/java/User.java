public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void receiveNotification(String message){
        System.out.println(message);
    }
}
