import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlCabor, jmlAtlit = 5, jmlInstansi;
        String namaCabor, namaAtlet, namaInstansi;
        System.out.println("---------------------------------------------------------------");
        System.out.println("--- Selamat Datang Di Porseni Politeknik Negeri Malang 2024 ---");
        System.out.println("---------------------------------------------------------------");
        System.out.print("silahkan Masukkan Jumlah Politeknik yang mendaftar : ");
        jmlInstansi = sc.nextInt();
        System.out.print("Masukkan Jumlah Cabor : ");
        jmlCabor = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= jmlInstansi; i++) {

            System.out.print("Masukkan Nama Instansi Politeknik ke " + i + ": ");
            namaInstansi = sc.nextLine();

            for (int j = 1; j <= jmlCabor; j++) {
                System.out.print("Masukkan Nama Cabor ke " + j + ": ");
                namaCabor = sc.nextLine();
                System.out.println("-------------------------------------");
                for (int k = 1; k <= jmlAtlit; k++) {
                    System.out.print("Masukkan Nama Atlet ke " + k + ": ");
                    namaAtlet = sc.nextLine();
                }
                System.out.println();
            }
        }
    }
}