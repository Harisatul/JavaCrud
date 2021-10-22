package latihan;

import latihan.Entitity.Library;
import latihan.Repository.LibaryRepositoryImplementation;
import latihan.Repository.LibraryRepository;
import latihan.Service.Service;
import latihan.Service.ServiceImplement;
import latihan.View.View;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Library> data = new ArrayList<>();

        LibraryRepository libraryRepository = new LibaryRepositoryImplementation(data);
        Service service = new ServiceImplement(libraryRepository);
        View view = new View(service);

        view.showLibary();

    }
}
