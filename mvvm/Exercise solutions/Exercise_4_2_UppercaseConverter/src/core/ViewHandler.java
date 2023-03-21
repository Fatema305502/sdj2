package Core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import view.UppercaseViewController;

import java.io.IOException;

//import viewmodel.ViewModelFactory;

public class ViewHandler {

    private Stage stage;
    private ViewModelFactory viewModelFactory;

    public ViewHandler(Stage stage, ViewModelFactory viewModelFactory) {
        this.stage = stage;
        this.viewModelFactory = viewModelFactory;
    }

    public void start() throws Exception {
        openView("Uppercase");
    }

    public void openView(String viewToOpen) throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;

        loader.setLocation(getClass().getResource("../view/" + viewToOpen + "View.fxml"));
        root = loader.load();
        if ("Uppercase".equals(viewToOpen)) {
            UppercaseViewController view = loader.getController();
            view.init(this, viewModelFactory.getUppercaseViewModel());
            stage.setTitle("Text converter");
        }

        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
