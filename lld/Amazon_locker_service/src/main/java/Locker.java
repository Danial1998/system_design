public class Locker {
    private int lockerId;
    private boolean isBooked;
    private Package storedPackage;
    private String password;

    public Locker(int lockerId){
        this.lockerId = lockerId;
        this.isBooked = false;
    }

    public boolean isAvailable(){
        return isBooked == false ? true : false;
    }

    public void storePackage(Package pkg,String password){
        this.storedPackage = pkg;
        this.password = password;
        this.isBooked = true;
    }

    public int getLockerId() {
        return lockerId;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public Package getStoredPackage() {
        return storedPackage;
    }

    public String getPassword() {
        return password;
    }

    public Package retrievePackage(String password) {
        if(!isAvailable() && this.getPassword().equals(password)){
            Package pkg = this.storedPackage;
            this.isBooked = false;
            this.password = null;
            this.storedPackage = null;
            return pkg;
        }
        else {
            System.out.println("Invalid password or locker is empty");
            return null;
        }
    }
}
