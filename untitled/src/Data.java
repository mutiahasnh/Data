import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        int pilihan = 0;
        String[] data = new String[0];
        String jumlah_data;
        Scanner keyboard = new Scanner(System.in);
        while (pilihan == 0) {
            System.out.println("==========Menu===========");
            System.out.println("1. Input Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Urutkan Data");
            System.out.println("5. Keluar");
            System.out.println("=========================");
            System.out.println("Pilihan 1 / 2 / 3 / 4 / 5: ");
            pilihan = Integer.parseInt(keyboard.nextLine());
            switch (pilihan) {
                case 1:
                    System.out.println("Berapa data : ");
                    jumlah_data = keyboard.nextLine();
                    data = new String[Integer.parseInt(jumlah_data)];
                    for (int i = 0; i < Integer.parseInt(jumlah_data); i++) {
                        System.out.println("Masukan Anggota Ke :" + i);
                        data[i] = keyboard.nextLine();
                    }
                    pilihan = 0;
                    break;
                case 2:
                    for (int i = 0; i < data.length; i++) {
                        System.out.println("Anggota Ke :" + i);
                        System.out.println(data[i]);
                    }
                    pilihan = 0;
                    break;
                case 3:
                    System.out.println("Nama anggota yang dicari : ");
                    jumlah_data = keyboard.nextLine();
                    int trap = 0;
                    for (int i = 0; i < data.length; i++) {
                        if (data[i].equals(jumlah_data)) {
                            trap = 1;
                            System.out.println("ada di index ke : " + i);
                        }
                    }
                    if (trap == 0) {
                        System.out.println("Tidak ada data");
                    }
                    pilihan = 0;
                    break;
                case 4:
                    for (int a = 0; a < data.length - 1; a++) {
                        for (int b = a + 1; b < data.length; b++) {
                            if (data[a].compareTo(data[b]) > 0) {
                                String temp = data[a];
                                data[a] = data[b];
                                data[b] = temp;
                            }
                        }
                    }
                    for (int i = 0; i < data.length; i++) {
                        System.out.println(data[i] + " ");
                    }
                    pilihan = 0;
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    pilihan = 0;
                    break;
            }
        }
    }
}
