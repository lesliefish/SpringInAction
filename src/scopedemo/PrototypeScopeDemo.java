package scopedemo;

public class PrototypeScopeDemo {
    private String message;

    public void  getMessage() {
        System.out.println("Message is : " + message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
