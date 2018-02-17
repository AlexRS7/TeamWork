import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] anArray = new int[n];
        for (int i = 0; i < n; ++i) {
            anArray[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean z = Search(n, anArray,x);
        Search(n, anArray,y);
    }

    public static boolean Search(int n, int[] anArray, int x) {
        for (int s : anArray) {
            if (s == x)
                return true;
        
    }
}
