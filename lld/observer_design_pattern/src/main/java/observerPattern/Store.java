package observerPattern;

import observerPattern.observable.IphoneObservable;
import observerPattern.observable.StocksObservable;
import observerPattern.observer.EmailObserver;
import observerPattern.observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable = new IphoneObservable();

        NotificationAlertObserver emailObserver1 = new EmailObserver("xyz@gmail.com", iphoneStockObservable);
        NotificationAlertObserver emailObserver2 = new EmailObserver("abc@gmail.com", iphoneStockObservable);

        iphoneStockObservable.add(emailObserver1);
        iphoneStockObservable.add(emailObserver2);

        iphoneStockObservable.setStockCount(10);

    }
}
