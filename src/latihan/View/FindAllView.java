package latihan.View;

import io.bretty.console.view.ActionView;
import latihan.Service.Service;

public class FindAllView extends ActionView {

    private Service service;

    public FindAllView(Service service) {
        super("Book List", "View Book");
        this.service = service;
    }

    @Override
    public void executeCustomAction() {
        service.show();
    }
}
