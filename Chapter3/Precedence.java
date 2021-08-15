package Chapter3;

public class Precedence {
        public static void main(String[] args) {
            int x = 1, y = 2, z = 3;
            int a = x + y - 2 / 2 + z;//1 + 2 - 1 + 3 = 5
            int b = x + (y - 2) / (2 + z); // 1 + 0 / 5 = 1
            System.out.println("a = " + a + " b = " + b);
        }
}
