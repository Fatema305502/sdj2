package view.text;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import viewmodel.text.TextViewModel;

public class TextController {

    @FXML
    private Button updateButton;

    @FXML
    private Label eventLabel;

    @FXML
    private TextField xText;

    @FXML
    private TextField yText;

    @FXML
    private TextField zText;

    @FXML
    private Button saveButton;

    private TextViewModel viewModel;

    public void init(TextViewModel viewModel) {
        this.viewModel = viewModel;
        eventLabel.textProperty().bind(viewModel.updateTimeStampProperty());
        xText.textProperty().bindBidirectional(viewModel.xProperty());
        yText.textProperty().bindBidirectional(viewModel.yProperty());
        zText.textProperty().bindBidirectional(viewModel.zProperty());
    }

    @FXML
    void onSaveClick(ActionEvent event) {
        viewModel.saveChanges();
    }

    @FXML
    void onUpdateClick(ActionEvent event) {
        viewModel.updateTextFields();
    }
}