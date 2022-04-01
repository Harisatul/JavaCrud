package latihan;

import io.bretty.console.view.MenuView;
import latihan.Entitity.Library;
import latihan.Repository.LibaryRepositoryImplementation;
import latihan.Repository.LibraryRepository;
import latihan.Service.Service;
import latihan.Service.ServiceImplement;
import latihan.View.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Library> data = new ArrayList<>();

        LibraryRepository libraryRepository = new LibaryRepositoryImplementation(data);
        Service service = new ServiceImplement(libraryRepository);

        MenuView rootMenu = new MenuView("Welcome to Book Library", "");
        // register menu items
        rootMenu.addMenuItem(new AddView(service));
        rootMenu.addMenuItem(new FindAllView(service));
        rootMenu.addMenuItem(new SearchView(service));
        rootMenu.addMenuItem(new RemoveView(service));
        rootMenu.addMenuItem(new UpdateView(service));

        rootMenu.display();

    }
}
