# Jobsheet-6
## Jawaban 5.1
1. - if (data[j-1] > data[j]): Berfungsi untuk mengecek apakah nilai elemen di sebelah kiri lebih besar dibandingkan elemen di sebelah kanannya.
- temp = data[j]: Berfungsi untuk menyimpan nilai elemen kanan sementara waktu ke dalam variabel temp agar nilainya tidak tertimpa atau hilang saat proses pertukaran.
- data[j] = data[j-1]: Berfungsi untuk menimpa nilai elemen kanan dengan nilai dari elemen kiri (proses pergeseran posisi).
- data[j-1] = temp: Berfungsi untuk memindahkan nilai asli elemen kanan (yang sebelumnya disimpan di temp) ke posisi elemen kiri.
- ujuan Utama: Rangkaian instruksi ini merupakan proses swap (tukar posisi) yang bertujuan untuk memindahkan elemen bernilai lebih besar ke arah kanan. Ini merupakan inti dari proses pengurutan menggunakan Bubble Sort secara ascending.
2. 
``` java
for (int j = i + 1; j < jumData; j++) {
    if (data[j] < data[min]) {
        min = j;
    }
}
```
3. - j >= 0: Berfungsi sebagai batas perulangan untuk memastikan pengecekan indeks tidak keluar dari jangkauan array. Hal ini mencegah terjadinya error saat perulangan berjalan mundur hingga mencapai elemen paling awal (indeks ke-0).
- data[j] > temp: Berfungsi untuk membandingkan nilai elemen array saat ini dengan elemen yang sedang dievaluasi (temp). Jika kondisi ini terpenuhi (elemen saat ini masih lebih besar dari temp).
4. Perintah tersebut bertujuan untuk menggeser elemen yang nilainya lebih besar satu slot ke arah kanan (ke indeks j+1). Penggeseran ini dilakukan guna menyediakan ruang kosong yang tepat untuk menyisipkan nilai temp. Proses ini akan terus berjalan secara beruntun sampai program menemukan posisi yang pas

## Jawaban 5.3
1. Kondisi tersebut digunakan karena proses pengurutan seluruh data hanya membutuhkan maksimal n-1 tahapan. Setelah tahapan tersebut selesai, sisa satu elemen terakhir akan secara otomatis berada di urutan yang paling tepat.
- Kondisi ini diterapkan untuk meningkatkan efisiensi algoritma. Dengan mengurangi panjang iterasi sebanyak i, program tidak perlu lagi melakukan pengecekan ulang pada elemen-elemen di posisi paling belakang yang sudah pasti terurut dengan benar pada tahapan sebelumnya.
- Jika terdapat 50 data, maka perulangan i akan dieksekusi sebanyak 49 kali. Ini berarti terdapat 49 tahapan (pass) yang dilalui dalam keseluruhan proses bubble sort tersebut.
2. 
``` java
public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();

        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM: "); String nim = sc.next();
            System.out.print("Nama: "); String nama = sc.next();
            System.out.print("Kelas: "); String kelas = sc.next();
            System.out.print("IPK: "); double ipk = sc.nextDouble();

            Mahasiswa17 m = new Mahasiswa17(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println("-------------------------");
        }

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting IPK (Bubble Sort - DESC): ");
        list.bubbleSort();
        list.tampil();

    }
}
```
## Jawaban 5.4
1. - int idxMin = i;: Menginisialisasi variabel idxMin dengan indeks iterasi saat ini (i). Posisi ini dijadikan sebagai asumsi awal letak elemen dengan nilai (IPK) terkecil.
- for (int j = i + 1; j < listMhs.length; j++): Melakukan perulangan untuk menelusuri dan membandingkan sisa elemen di sebelah kanan dari indeks i hingga akhir array.
- if (listMhs[j].ipk < listMhs[idxMin].ipk): Berfungsi untuk mengevaluasi apakah nilai IPK pada indeks yang sedang ditelusuri (j) lebih kecil dibandingkan dengan IPK pada indeks minimum sementara (idxMin).
- idxMin = j;: Jika kondisi di atas benar (ditemukan IPK yang lebih kecil), maka posisi indeks minimum (idxMin) akan diperbarui dengan posisi j yang baru tersebut.