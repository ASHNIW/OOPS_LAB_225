public class LabeledBreak {
    public static void main(String[] args) {
        outerloop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerloop;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("Broke out of outer loop");
    }
}
