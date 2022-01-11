package latihan.Service;

import latihan.Entitity.Library;

import java.util.List;

public interface Service {

    void show();

    void addLibrary(String tittle, String publisher, String author, int year);

    void removeLibrary(String name);

    void isExist(String name);

    void update(String name, String tittle, String publisher, String author, int year);
}
