class PublicDemo {
    public String name = "Public Access";
    
    public void show() {
        System.out.println("Name: " + name);
    }
}

public class PublicModifierDemo {
    public static void main(String[] args) {
        PublicDemo obj = new PublicDemo();
        obj.show();
    }
}
