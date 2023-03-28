package simplechat.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import simplechat.client.model.ChatManager;
import simplechat.client.network.SocketClient;
import simplechat.client.views.ClientViewController;
import simplechat.client.views.ClientViewModel;

import java.io.IOException;

public class SimpleChatApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        SocketClient socketClient = new SocketClient();
        ChatManager chatManager = new ChatManager(socketClient);

        FXMLLoader fxmlLoader = new FXMLLoader(SimpleChatApp.class.getResource("views/ClientView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        ClientViewController clientViewController = fxmlLoader.getController();
        ClientViewModel clientViewModel = new ClientViewModel(chatManager);
        clientViewController.init(socketClient, clientViewModel);

    }

}
