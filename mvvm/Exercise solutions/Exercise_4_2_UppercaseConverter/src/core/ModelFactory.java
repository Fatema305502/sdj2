package Core;

import Model.TextConverter;
import Model.TextConverterModel;

public class ModelFactory {

    private TextConverter model;

    public TextConverter getModel() {
        if(model == null) {
            model = new TextConverterModel();
        }
        return model;
    }


}
