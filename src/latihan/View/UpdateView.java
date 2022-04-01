package latihan.View;

import io.bretty.console.view.ActionView;
import latihan.Service.Service;

public class UpdateView extends ActionView {

    private Service service;

    public UpdateView(Service service) {
        super("Update Book", "Update Book");
        this.service = service;
    }

    @Override
    public void executeCustomAction() {

        String name = this.prompt("Enter book name : ", String.class);
        String title = this.prompt("Enter new title : ", String.class);
        String publisher = this.prompt("Enter new publisher : ", String.class);
        String author = this.prompt("Enter new author : ", String.class);
        int year = this.prompt("Enter new year : ", Integer.class);
        service.update(name, title, publisher, author, year);
    }
}
