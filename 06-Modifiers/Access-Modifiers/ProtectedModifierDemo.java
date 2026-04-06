class Parent {
    protected String name = "Protected Data";
}

class Child extends Parent {
    void show() {
        System.out.println("Accessing protected: " + name);
    }
}

public class ProtectedModifierDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
