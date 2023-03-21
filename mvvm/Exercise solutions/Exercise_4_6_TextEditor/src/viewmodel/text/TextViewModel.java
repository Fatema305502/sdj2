package viewmodel.text;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import model.DataModel;

public class TextViewModel {
    private StringProperty x;
    private StringProperty y;
    private StringProperty z;
    private StringProperty updateTimeStamp;

    private DataModel model;

    public TextViewModel(DataModel model) {
        this.model = model;
        x = new SimpleStringProperty();
        y = new SimpleStringProperty();
        z = new SimpleStringProperty();
        updateTimeStamp = new SimpleStringProperty("Last update: ");
    }
    public void updateTextFields() {
        double[] data = model.getDataValues();
        x.setValue("" + data[0]);
        y.setValue("" + data[1]);
        z.setValue("" + data[2]);
        updateTimeStamp.setValue(model.getLastUpdateTimeStamp());
    }
    public void saveChanges() {
        model.saveData(Double.parseDouble(x.getValue()),Double.parseDouble(y.getValue()),Double.parseDouble(z.getValue()));
    }

    public StringProperty xProperty() {
        return x;
    }

    public StringProperty yProperty() {
        return y;
    }

    public StringProperty zProperty() {
        return z;
    }

    public StringProperty updateTimeStampProperty() {
        return updateTimeStamp;
    }
}
