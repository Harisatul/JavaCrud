package latihan.Repository;

import latihan.Entitity.Library;

import java.util.Iterator;
import java.util.List;

public class LibaryRepositoryImplementation implements LibraryRepository {


    private List <Library> store;

    public LibaryRepositoryImplementation(List<Library> store) {
        this.store = store;
    }

    public List<Library> getStore() {
        return store;
    }

    public void setStore(List<Library> store) {
        this.store = store;
    }

    @Override
    public void add(Library library) {
        store.add(library);
    }

    @Override
    public boolean remove(String name) {
        for(Iterator<Library> iterator = store.iterator(); iterator.hasNext(); ) {
            if(iterator.next().getTitleName().equals(name)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public List<Library> find(){
        return this.store;
    }


    public Library isExist (String name) {
        for (var i = 0 ; i < store.size(); i++){
            if (store.get(i).getTitleName().equals(name)){
                return store.get(i);
            }
        }
        return null;
    }

    @Override
    public boolean update(String name, String newName,  String newPublisher, String newAuthor, int newYear) {
        for (var i = 0 ; i < store.size(); i++){
            if (store.get(i).getTitleName().equals(name)){
              store.get(i).setTitleName(newName);
              store.get(i).setPublsiher(newPublisher);
              store.get(i).setAuthor(newAuthor);
              store.get(i).setYear(newYear);
              return true;
            }
        }
        return false;
    }
}
