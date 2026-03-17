class NotificationService {
    public void notifyUser(Notification notification, String message) {
        notification.notify(message);
    }
}

interface Notification {
    void notify(String message);
}

class EmailNotification implements Notification {
    public void notify(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}

class SMSNotification implements Notification {
    public void notify(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotification implements Notification {
    public void notify(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}