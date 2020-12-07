package htlanl.recursion;

public class Recursion {
    public static void main(String[] args) {
        fibonacci();
    }

    private static int getNextNumberInSequence(int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        return getNextNumberInSequence(i - 2) + getNextNumberInSequence(i - 1);
    }

    private static void fibonacci() {
        int num = 10;

        for (int i = 0; i < num; i++) {
            System.out.println(getNextNumberInSequence(i));
        }
    }
}
