public class StaticModifierDemo {
    static int count = 0;
    
    StaticModifierDemo() {
        count++;
        System.out.println("Object created, count: " + count);
    }
    
    static void showCount() {
        System.out.println("Total objects: " + count);
    }
    
    public static void main(String[] args) {
        new StaticModifierDemo();
        new StaticModifierDemo();
        new StaticModifierDemo();
        showCount();
    }
}
