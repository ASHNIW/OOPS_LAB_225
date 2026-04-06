class PrivateDemo {
    private String secret = "This is private data";
    
    private void showSecret() {
        System.out.println(secret);
    }
    
    public void accessPrivate() {
        showSecret();
    }
}

public class PrivateModifierDemo {
    public static void main(String[] args) {
        PrivateDemo obj = new PrivateDemo();
        obj.accessPrivate();
    }
}
