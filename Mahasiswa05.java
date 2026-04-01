public class Mahasiswa05 {
    static class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa() {
    }

    Mahasiswa(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
}

static class MahasiswaBerprestasi {
    Mahasiswa[] listMhs = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampilInformasi();
            System.out.println("-----------------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }
}

public static class MahasiswaDemo {
    public static void main(String[] args) {
        MahasiswaBerprestasi list = new MahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("123", "Zidan", "2A", 3.2);
        Mahasiswa m2 = new Mahasiswa("124", "Ayu", "2A", 3.5);
        Mahasiswa m3 = new Mahasiswa("125", "Sofi", "2A", 3.1);
        Mahasiswa m4 = new Mahasiswa("126", "Sita", "2A", 3.9);
        Mahasiswa m5 = new Mahasiswa("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) :");
        list.bubbleSort();
        list.tampil();
    }
}
}
