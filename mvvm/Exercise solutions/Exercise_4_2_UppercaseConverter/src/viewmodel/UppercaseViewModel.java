package viewmodel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.TextConverter;

public class UppercaseViewModel {
    private StringProperty request;
    private StringProperty reply;
    private StringProperty error;
    private TextConverter model;

    public UppercaseViewModel(TextConverter model) {
        this.model = model;
        this.request = new SimpleStringProperty();
        this.reply = new SimpleStringProperty();
        this.error = new SimpleStringProperty();
    }

    public void convert() {
        if (request.getValue() == null || request.getValue().isEmpty()) {
            error.setValue("Fejl");
            reply.setValue("");
        } else {
            reply.setValue(model.toUpperCase(request.getValue()));
            error.setValue("");
        }
    }

    public StringProperty requestProperty() {
        return request;
    }

    public StringProperty replyProperty() {
        return reply;
    }

    public StringProperty errorProperty() {
        return error;
    }
}
