import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class tugas5 {
    public static void main (String[] args) {
        ArrayList data = new ArrayList();
        System.out.println("Masukan Jumlah Data :");

        int jumlah = new Scanner(System.in).nextInt();

        for (int a=0; a<jumlah; a++){
            System.out.println("Masukan Data ke- "+(a+1)+":");
            data.add(new Scanner(System.in).nextLine());
        }
        System.out.println("Hasil Data Yang Dimasukan :");
        for(Object o : data) {
            System.out.println(o);
        }
        System.out.println("Masukan Data Yang Akan Dihapus :");
        String hapus = new Scanner(System.in).nextLine();
        data.remove(hapus);

        System.out.println("Hasil Kembali Data Yang Ada Di dalam ArrayList :");
        for (Object o : data);
        System.out.println(jumlah);

    }
}
