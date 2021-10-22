package latihan.Service;

import latihan.Entitity.Library;
import latihan.Repository.LibraryRepository;

import java.util.List;

public class ServiceImplement implements Service {


     private LibraryRepository libraryRepository ;

    public ServiceImplement(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public void show() {
        List<Library> models = libraryRepository.find();
        displayPropertyMahasiswa(models);
    }

    @Override
    public void addLibrary(String tittle, String publisher, String author, int year) {
        libraryRepository.add(new Library(tittle, publisher, author, year));
        System.out.println(tittle + " Berhasil Ditambahkan");

    }

    private void displayPropertyMahasiswa(List<Library> models) {
        for(var model : models) {
            System.out.println(model);
        }
    }



}
