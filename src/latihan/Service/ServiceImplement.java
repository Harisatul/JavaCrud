package latihan.Service;

import latihan.Entitity.Library;
import latihan.Repository.LibraryRepository;
import latihan.utill.CommandLineTable;

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
        System.out.println(tittle + " Successfully Added");

    }

    private void displayPropertyMahasiswa(List<Library> models) {
        CommandLineTable st = new CommandLineTable();
        st.setShowVerticalLines(true);
        st.setHeaders("title", "publisher", "author", "year");
        for(var model : models) {
            String year = String.valueOf(model.getYear());
            st.addRow(model.getTitleName(), model.getPublsiher(), model.getAuthor(), year);
        }
        st.print();
    }

    @Override
    public void removeLibrary(String name) {
        boolean isSuccess = libraryRepository.remove(name);
        if (isSuccess)
            System.out.println(name + " successfully deleted");
        else
            System.out.println("Opps..." + name + " can't deleted");
    }

    @Override
    public void isExist(String name) {
        Library isNull = libraryRepository.isExist(name);
        CommandLineTable st1 = new CommandLineTable();
        if (isNull != null){
            System.out.println("Yeaaay !!! Here you go ");
            st1.setHeaders("title", "publisher", "author", "year");
            String year = String.valueOf(isNull.getYear());
            st1.addRow(isNull.getTitleName(), isNull.getPublsiher(), isNull.getAuthor(), year);
            st1.print();
        }else {
            System.out.println("Ooops ... couldn't find " + name + " book");
        }
    }

    @Override
    public void update(String name, String tittle, String publisher, String author, int year) {
        Library isNull = libraryRepository.isExist(name);
        if (isNull != null){
            boolean isSuccess = libraryRepository.update(name, tittle, publisher, author, year);
            if (isSuccess)
                System.out.println("Successfully update data");
            else
                System.out.println("couldn't update data");
        }
        else {
            System.out.println("couldn't found the book");
        }
    }


}
