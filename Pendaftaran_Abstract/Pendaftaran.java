package Pendaftaran_Abstract;

//Import module
import java.util.Scanner;
import java.io.Console;

public class Pendaftaran extends Abstrak {

    //Deklarasi scanenr
    Scanner sc = new Scanner(System.in);

    //Deklarasi console
    Console con = System.console();
    
    //Deklarasi input variabel
    @Override
    public void pendaftaran() {
        System.out.println("MASUKKAN DATA PENDAFTARAN ANDA");
        System.out.println("");
        System.out.println("Masukkan Nama Lengkap: ");
        String nama = con.readLine();
        System.out.println("Masukkan SMP asal: ");
        String smp = con.readLine();
        System.out.println("Masukkan nomor handphone: ");;
        int nomor = sc.nextInt();
        System.out.println("Masukkan Tempat Tanggal Lahir: ");
        String ttl = con.readLine();
        System.out.println("Masukkan Alamat: ");
        String alamat = con.readLine();
        System.out.println("Masukkan jenis kelamin: ");
        String kelamin = sc.next();
        System.out.println("Masukkan Agama: ");
        String agama = con.readLine();
        System.out.println("Masukkan Nama Ayah: ");
        String ayah = con.readLine();
        System.out.println("Masukkan Nama Ibu: ");
        String ibu = con.readLine();
        System.out.println("Masukkan Pekerjaan Ayah: ");
        String pekerjaan1 = con.readLine();
        System.out.println("Masukkan Pekerjaan Ibu: ");
        String pekerjaan2 = con.readLine();
        System.out.println("Masukkan Penghasilan OrangTua");
        int penghasilan = sc.nextInt();
        int SPP = 0;

        //Percabangan untuk menentukan SPP
        if (penghasilan <= 5000000) {
            SPP = 200000;        
        }
        else if (penghasilan <= 10000000) {
            SPP = 300000;
        }
        else if (penghasilan <= 15000000) {
            SPP = 400000;
        }
        else if (penghasilan <= 20000000) {
            SPP = 500000;
        }else{
            System.out.println("Maaf, Anda tidak dapat mendaftar");
        }

        //Deklarasi output variabel
        System.out.println("DATA ANDA");
        System.out.println("");
        System.out.println("Nama Lengkap: " +nama);
        System.out.println("SMP Asal: "+smp);
        System.out.println("Nomor Handphone: "+nomor);
        System.out.println("Tempat Tanggal Lahir: "+ttl);
        System.out.println("Alamat: "+alamat);
        System.out.println("Jenis kelamin: "+kelamin);
        System.out.println("Agama: "+agama);
        System.out.println("Nama Ayah: "+ayah);
        System.out.println("Nama Ibu: "+ibu);
        System.out.println("Pekerjaan Ayah: "+pekerjaan1);
        System.out.println("Pekerjaan Ibu: "+pekerjaan2);
        System.out.println("Penghasilan OrangTua: "+penghasilan);
        System.out.println("SPP yang harus anda bayarkan nanti: "+SPP);
    }
    
}
