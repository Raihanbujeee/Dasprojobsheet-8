import java.util.Scanner;
public class square24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();
        for (int iOuter = 1; iOuter <= N; iOuter++) {
            System.out.print("*");

            for (int i = 1; i <=N ; i++) {
                System.out.print("*");
                
            }
            System.out.println();
        }
        
    }
}
