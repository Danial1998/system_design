import java.time.Instant;

public class KeyValueEntry {
    String key;
    double value;
    Instant creationTime;

    public KeyValueEntry(String key, double value, Instant creationTime){
        this.key = key;
        this.value = value;
        this.creationTime = creationTime;
    }
}
