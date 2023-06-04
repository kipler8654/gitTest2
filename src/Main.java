public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int i = 0;
        while (i < arr.length) {
            int num = arr[i];
            System.out.print(num + " ");
            i++;
        }
        System.out.println();
        int a = 0;
        do{
            int num = arr[a];
            System.out.print(num + " ");
            a++;
        }while(a < arr.length);
    }
}