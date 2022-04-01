package latihan.View;

import io.bretty.console.view.ActionView;
import latihan.Service.Service;

public class RemoveView extends ActionView {

    private Service service;

    public RemoveView(Service service) {
        super("Remove Book", "Remove Book");
        this.service = service;
    }

    @Override
    public void executeCustomAction() {
        String name = this.prompt("Enter book title : ", String.class);
        service.removeLibrary(name);
    }
}
