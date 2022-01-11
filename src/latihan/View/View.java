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
            System.out.println("\nDAFTAR BUKU");
            service.show();

            System.out.println("== MENU");
            System.out.println("1. Tambah\n2. Hapus\n3. Cari\n4. Ubah\nx. Keluar");
            String input = s.nextLine();

            switch (input) {
                case "1":
                    addLibary();
                    break;
                case "2":
                    removeLibrary();
                    break;
                case "3":
                    searchLibrary();
                    break;
                case "4":
                    updateLibrary();
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

    public void removeLibrary(){
        System.out.print("Masukkan judul buku yang dihapus : ");
        String name = s.nextLine();
        service.removeLibrary(name);

    }

    public void searchLibrary(){
        System.out.print("Masukkan judul buku yang di ingin dicari : ");
        String name = s.nextLine();
        service.isExist(name);

    }

    public  void updateLibrary(){
        System.out.print("Masukkan judul buku yang ingin di ubah : ");
        String name = s.nextLine();

        System.out.print("Masukkan judul buku baru : ");
        String newName = s.nextLine();

        System.out.print("Masukkan publisher baru : ");
        String newPublisher = s.nextLine();

        System.out.print("Masukkan author baru : ");
        String newAuthor = s.nextLine();

        System.out.print("Masukkan tahun rilis baru : " );
        int newYear = s.nextInt();
        service.update(name, newName, newPublisher,newAuthor, newYear );

    }
}
