package latihan.Repository;

import latihan.Entitity.Library;

import java.util.List;

public class LibaryRepositoryImplementation implements LibraryRepository {


    private List <Library> store;

    public LibaryRepositoryImplementation(List<Library> store) {
        this.store = store;
    }


    @Override
    public void add(Library library) {
        store.add(library);
    }

    @Override
    public void remove() {

    }

    public List<Library> find(){
        return this.store;
    }

}
