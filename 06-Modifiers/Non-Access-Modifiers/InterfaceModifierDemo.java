interface Drawable {
    void draw();
}

class Line implements Drawable {
    public void draw() {
        System.out.println("Drawing Line");
    }
}

public class InterfaceModifierDemo {
    public static void main(String[] args) {
        Drawable d = new Line();
        d.draw();
    }
}
