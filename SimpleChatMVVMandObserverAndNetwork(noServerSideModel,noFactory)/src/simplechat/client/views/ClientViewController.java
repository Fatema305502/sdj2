package simplechat.client.views;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import simplechat.client.network.SocketClient;

public class ClientViewController {

    @FXML
    private TextField messageInput;
    @FXML
    private TextField response;
    @FXML
    private SocketClient client;

    private ClientViewModel clientViewModel;

    public void init(SocketClient client, ClientViewModel clientViewModel)
    {
        this.clientViewModel = clientViewModel;
        this.client = client;
        response.textProperty().bind(clientViewModel.replyProperty());
    }

    @FXML
    public void sendMessage()
    {
        String message = messageInput.getText();
        clientViewModel.sendMessage(message);
    }



}
