package latihan.View;

import latihan.Service.Service;

import java.util.Scanner;

public class View {

    Scanner s =  new Scanner(System.in);

    private Service service;

    public View(Service service) {
        this.service = service;
    }

    public void showLibary(){
        label:
        while (true) {
            System.out.println("\nDAFTAR MAHASISWA");
            service.show();

            System.out.println("== MENU");
            System.out.println("1. Tambah\n2. Hapus\n3. Cari\n4. Ubah\nx. Keluar");
            String input = s.nextLine();

            switch (input) {
                case "1":
                    addLibary();
                    break;
                case "2":
//                    removeMahasiswa();
                    break;
                case "3":
//                    searchMahasiswa();
                    break;
                case "4":
//                    updateMahasiswa();
                    break;
                case "x":
                    break label;
                default:
                    System.out.println("Pilihan tidak dimengerti");
                    break;
            }
        }
        System.out.println("\nTerima kasih ~");

    }

    public  void addLibary(){
        System.out.print("Masukkan judul buku : ");
        String name = s.nextLine();

        System.out.print("Masukkan publisher : ");
        String publisher = s.nextLine();

        System.out.print("Masukkan author : ");
        String author = s.nextLine();

        System.out.print("Masukkan tahun rilis : " );
        int year = s.nextInt();
        service.addLibrary(name,publisher,author,year);



    }
}
