public class Main {
    public static void main(String[] args) throws InterruptedException {
        TimeWindowStore store = new TimeWindowStore();

        store.put("key1",10.5);
        store.put("key2",20);
        store.put("key3",25.1);

        Thread.sleep(10000);

        store.put("key4",29.0);
        System.out.println(store.get("key1"));
    }
}
