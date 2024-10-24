import java.util.Scanner;
public class rataNilai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        float nilaiMhs,totalNilai;
        float rataNilai;
i=1;
while(i<=5){
        totalNilai=0;
        System.out.println("masukkan nilai mahasiswa ke -" + i );
        for (j = 1; j <= 5; j++) {
            System.out.print("NILAI KE - "+ j + " =");
        nilaiMhs = sc.nextInt();
        totalNilai+=nilaiMhs;
        }

        rataNilai=totalNilai/5;
        System.out.println("Rata rata nlai mahasiswa ke - " + i + " = " + rataNilai);

        i++;
        
    }
}
}
