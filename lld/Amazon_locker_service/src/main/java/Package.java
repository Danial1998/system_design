public class Package {
    private String packageId;
    private User user;

    public Package(String packageId, User user) {
        this.packageId = packageId;
        this.user = user;
    }

    public String getPackageId() {
        return packageId;
    }

    public User getUser() {
        return user;
    }
}
