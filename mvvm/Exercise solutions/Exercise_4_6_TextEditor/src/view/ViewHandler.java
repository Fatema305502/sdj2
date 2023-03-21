package view;

import org.w3c.dom.Text;
import view.piechart.PieChartController;
import view.text.TextController;
import viewmodel.ViewModelFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewHandler {

    private Stage stage;
    private Stage stage2 = new Stage();
    private ViewModelFactory viewModelFactory;

    public ViewHandler(Stage stage, ViewModelFactory viewModelFactory) {
        this.stage = stage;
        this.viewModelFactory = viewModelFactory;
    }

    public void start() throws Exception{
        openView("PieChart");
        openView("Text");
    }

    public void openView(String viewToOpen) throws IOException {
        Scene scene = null;
        FXMLLoader loader = new FXMLLoader();
        Parent root = null;

        loader.setLocation(getClass().getResource(viewToOpen.toLowerCase()+"/"+ viewToOpen +"View.fxml"));
        root = loader.load();
        if("PieChart".equals(viewToOpen)) {
            PieChartController view = loader.getController();
            view.init(viewModelFactory.getPieChartViewModel());
            stage.setTitle("Pie Chart");
            scene = new Scene(root);
            stage.setTitle("Text Chart");
            stage.setScene(scene);
            stage.show();
        } else if("Text".equals(viewToOpen)) {
            Scene scene2 = new Scene(root);
            stage2.setScene(scene2);
            stage2.show();
            TextController view = loader.getController();
            view.init(viewModelFactory.getTextViewModel());
        }
    }
}
