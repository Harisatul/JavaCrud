package latihan.View;

import io.bretty.console.view.ActionView;
import latihan.Service.Service;

public class AddView extends ActionView {

    private Service service;

    public AddView(Service service) {
        super("Add Book", "Add Book");
        this.service = service;
    }

    @Override
    public void executeCustomAction() {
        String title = this.prompt("Enter the book title : ", String.class);
        String publisher = this.prompt("Enter the book publisher : ", String.class);
        String author = this.prompt("Enter the book author : ", String.class);
        int year = this.prompt("Enter the book year : ", Integer.class);
        service.addLibrary(title, publisher, author, year);
    }
}
