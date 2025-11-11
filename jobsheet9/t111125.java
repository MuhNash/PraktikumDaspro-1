package jobsheet9;
import java.util.Scanner;
public class t111125 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] rspndn = new int[10][6];
        double tot = 0, rata = 0, rataprntyn=0; 

        for (int i = 0; i < rspndn.length; i++) {
            System.out.println("rspndn "+(i+1));
            for (int j = 0; j < rspndn[i].length; j++) {
                System.out.print("skor prtnyn "+(j+1)+" : ");
                rspndn[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int i = 0; i < rspndn.length; i++) {
            rata = 0;
            for (int j = 0; j < rspndn[i].length; j++) {
                rata += rspndn[i][j];
            }
            rata = rata / rspndn[i].length;
            tot += rata;
            System.out.println("rt2 rspnd "+(i+1)+" : "+rata);
        }

        System.out.println();
       for (int j = 0; j < rspndn[0].length; j++) {
            rataprntyn = 0;
            for (int i = 0; i < rspndn.length; i++) {
                rataprntyn += rspndn[i][j];
            }
            rataprntyn /= rspndn.length;
            System.out.println("rata prtnyn " + (j+1) + " : " + rataprntyn);
        }

        tot = tot / rspndn.length;
        System.out.println();
        System.out.println("rata tot : "+tot);
    }
}




// Kerjaan Nashru
    
// import java.util.Scanner;

// public class test {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
        
//         int surve[][] = new int[10][6];
//         double total_res = 0;
//         double total_per = 0;
//         double rata_per;
//         double rata_res;
        
//         for (int i = 0; i < surve.length; i++) {
//             System.out.println("Responden ke-" + (i + 1));
//             total_per = 0;
//             for (int j = 0; j < surve[i].length; j++) {
//                 System.out.print("  Masukkan Nilai:");
//                 surve[i][j] = input.nextInt();
//                 total_per += surve[i][j];
//             }
//             rata_per = total_per / 6;
//             System.out.println("    Rata pertanyaan : " + rata_per);

//             total_res += rata_per;
//         }

//         rata_res = total_res / 10;

//         System.out.printf("\n\nRata rata Responden: %.2f\n", rata_res);
//         System.out.printf("Rata rata semua responden: %.2f", total_res);
//     }
// }
