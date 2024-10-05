public class Main {
    public static void main(String[] args) throws InterruptedException {
        TimeWindowStore store = new TimeWindowStore();

        store.put("key1",10.5);
        store.put("key2",20);
        store.put("key3",25.1);

        Thread.sleep(10000);

        store.put("key4",29.0);
        System.out.println(store.get("key1"));

        //Follow-up question : How will you handle concurrency when multiple clients/threads try to access your key value store ?
        //1. synchronised locking
        //2. concurrentHashMap instead of normal Map
        //3. Re-entrant lock (granular-control)
        //4. read-write lock (if read-write operations are high)
    }
}
