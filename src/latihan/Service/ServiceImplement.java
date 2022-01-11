package latihan.Service;

import latihan.Entitity.Library;
import latihan.Repository.LibraryRepository;

import java.util.List;

public class ServiceImplement implements Service {


    private LibraryRepository libraryRepository ;

    public ServiceImplement(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    public LibraryRepository getLibraryRepository() {
        return libraryRepository;
    }

    public void setLibraryRepository(LibraryRepository libraryRepository) {
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

    @Override
    public void removeLibrary(String name) {
        boolean isSuccess = libraryRepository.remove(name);
        if (isSuccess)
            System.out.println("[Berhasil menghapus judul buku dengan nama : " + name + " ]");
        else
            System.out.println("[Gagal menghapus judul buku dengan nama : " + name + " ]");
    }

    @Override
    public void isExist(String name) {

        Library isNull = libraryRepository.isExist(name);
        if (isNull != null){
            System.out.println(isNull);
            System.out.println("Berhasil Ditemukan ");
        }else {
            System.out.println("maaf tdak ditemukan");
        }
    }

    @Override
    public void update(String name, String tittle, String publisher, String author, int year) {
        Library isNull = libraryRepository.isExist(name);
        if (isNull != null){
            boolean isSuccess = libraryRepository.update(name, tittle, publisher, author, year);
            if (isSuccess)
                System.out.println("[Berhasil mengubah data buku dengan nama : " + name + " ]");
            else
                System.out.println("[Gagal mengubah data buku dengan nama : " + name + " ]");
        }
        else {
            System.out.println("data buku tidak ditemukan");
        }
    }


}
