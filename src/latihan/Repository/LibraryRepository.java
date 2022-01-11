package latihan.Repository;

import latihan.Entitity.Library;

import java.util.List;

public interface LibraryRepository {

    void add(Library library);

    boolean remove(String name);

    List <Library> find();

    Library isExist(String name);

    boolean update(String name, String newName,  String newPublisher, String newAuthor, int newYear);


}
