package simplechat.client.views;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import simplechat.client.model.ChatManager;
import simplechat.shared.transferobjects.Message;

import java.beans.PropertyChangeEvent;

public class ClientViewModel {

    private ChatManager chatManager;
    private StringProperty reply;

    public ClientViewModel(ChatManager chatManager)
    {
        this.chatManager = chatManager;
        chatManager.addListener("MessageReceived", this::receieveMessage);
        reply = new SimpleStringProperty();
    }

    public void sendMessage(String message)
    {
        chatManager.sendMessage(message);
    }

    public void receieveMessage(PropertyChangeEvent evt)
    {
        Message message = (Message) evt.getNewValue();
        reply.set(message.getMessage());
    }

    public StringProperty replyProperty()
    {
        return reply;
    }

}
