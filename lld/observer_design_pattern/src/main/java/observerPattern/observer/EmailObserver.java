package observerPattern.observer;

import observerPattern.observable.StocksObservable;

public class EmailObserver implements NotificationAlertObserver{
    String emailId;
    StocksObservable observable;

    public EmailObserver(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Product is in stock!");
    }

    private void sendMail(String emailId, String msg){
        System.out.println("Mail sent to: "+emailId);
    }
}
