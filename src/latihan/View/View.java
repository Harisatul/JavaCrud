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
        System.out.println("\nDAFTAR BUKU");
        service.show();

        System.out.println("Masukkan Data");

        System.out.println("Masukkan judul");
        String name = s.nextLine();

        System.out.println("Masukkan publisher");
        String publisher = s.nextLine();

        System.out.println("Masukkan author");
        String author = s.nextLine();

        System.out.println("Masukkan tahun rilis");
        int year = s.nextInt();

        service.addLibrary(name,publisher,author,year);


        service.show();




    }
}
