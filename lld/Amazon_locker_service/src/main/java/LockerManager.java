import java.util.HashMap;
import java.util.UUID;

public class LockerManager {
    private HashMap<Integer,Locker> lockerManager;

    public LockerManager(int lockerSize) {
        this.lockerManager = new HashMap<>();
        for(int i=1;i<=lockerSize;i++){
            lockerManager.put(i,new Locker(i));
        }
    }

    public void assignLockerToPackage(Package pkg){
        Locker locker = getAvailableLocker();
        if(locker!=null){
            String password = "12345";
            locker.storePackage(pkg,password);
            pkg.getUser().receiveNotification("Package " + pkg.getPackageId() + " is stored in locker " + locker.getLockerId() + " for user " + pkg.getUser().getName() + ". Keep this password to access the package: "+ password);
        } else {
            System.out.println("All the lockers are occupied");
        }
    }

    private String generatePassword() {
        return UUID.randomUUID().toString().substring(0,6);
    }

    private Locker getAvailableLocker() {
        for(Locker locker : lockerManager.values()){
            if(locker.isAvailable()){
                return locker;
            }
        }
        return null;
    }

    public void retrievePackage(int lockerId, User user, String password) {
        Locker locker = lockerManager.get(lockerId);
        if(locker != null){
            Package pkg = locker.retrievePackage(password);
            if(pkg!=null){
                if(pkg.getUser().getName().equals(user.getName())){
                    user.receiveNotification("Package retrieved from lockerId: "+locker.getLockerId());
                }
            }
        } else {
            System.out.println("Invalid lockerId, please check the id again!");
        }
    }
}
