import java.util.Scanner;

public class MainDosen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Seluruh Data");
            System.out.println("3. Sorting ASC (Bubble Sort - Usia)");
            System.out.println("4. Sorting DSC (Selection Sort - Usia)");
            System.out.println("5. Sorting DSC (Insertion Sort - Usia)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.next();
                    System.out.print("Nama: ");
                    String nm = sc.next();
                    System.out.print("Jenis Kelamin (L=true / P=false): ");
                    boolean jk = sc.nextBoolean();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    data.tambah(new Dosen(kd, nm, jk, usia));
                    break;
                case 2:
                    System.out.println("\nData Dosen:");
                    data.tampil();
                    break;
                case 3:
                    data.SortingASC();
                    System.out.println("Data telah diurutkan ASC (Bubble Sort).");
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("Data telah diurutkan DSC (Selection Sort).");
                    break;
                case 5:
                    data.insertionSort();
                    System.out.println("Data telah diurutkan DSC (Insertion Sort).");
                    break;
            }
        } while (pilih != 0);
    }
}