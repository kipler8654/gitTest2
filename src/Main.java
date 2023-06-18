import java.util.Arrays;

public class Main {
    static char[] globalArr = {'w', 'o', 'r', 'd'};
    static int globalNum = 5;

    public static void main(String[] args) {
        int[] localArr = {1, 4, 6, 7, 2};
        char localChar = 'a';
        System.out.println(Arrays.toString(globalArr));
        System.out.println(globalNum);
        System.out.println(Arrays.toString(localArr));
        System.out.println(localChar);
    }
}