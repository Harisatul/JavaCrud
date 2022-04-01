package latihan.View;

import io.bretty.console.view.ActionView;
import latihan.Service.Service;

public class SearchView extends ActionView {

    private Service service;

    public SearchView(Service service) {
        super("Search Book", "Search book");
        this.service = service;
    }

    @Override
    public void executeCustomAction() {
        String title = this.prompt("Enter the book title : ", String.class);
        service.isExist(title);
    }
}
