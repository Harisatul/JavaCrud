package latihan.Repository;

import latihan.Entitity.Library;

import java.util.List;

public interface LibraryRepository {

    void add(Library library);

    void remove();

    List <Library> find();

}
