package view;

import core.ViewHandler;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import viewmodel.UppercaseViewModel;

public class UppercaseViewController {

    UppercaseViewModel viewModel;

    ViewHandler viewHandler;  //Never used, but is included in the exercise,
                            // so I kept it here
    @FXML
    private TextField RequestField;

    @FXML
    private TextField ReplyField;

    @FXML
    private Button SubmitButton;

    @FXML
    private Label ErrorLabel;


    public void init(ViewHandler viewHandler, UppercaseViewModel viewModel) {
        this.viewHandler = viewHandler;
        this.viewModel = viewModel;
        RequestField.textProperty().bindBidirectional(viewModel.requestProperty());
        ReplyField.textProperty().bind(viewModel.replyProperty());
        ErrorLabel.textProperty().bind(viewModel.errorProperty());
    }
    @FXML
    void onSubmit(ActionEvent event) {
        viewModel.convert();
    }
}
