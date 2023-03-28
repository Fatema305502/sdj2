package simplechat.client.model;

import simplechat.client.network.SocketClient;
import simplechat.shared.transferobjects.Message;
import simplechat.shared.util.Subject;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class ChatManager implements Subject {

    private SocketClient client;
    private PropertyChangeSupport support;

    public ChatManager(SocketClient client)
    {
        support = new PropertyChangeSupport(this);
        this.client = client;
        client.addListener("MessageReceived", this::messageReceived);
    }

    public void sendMessage(String message)
    {
        client.sendMessage(message);
    }

    public void messageReceived(PropertyChangeEvent evt)
    {
        Message message = (Message) evt.getNewValue();
        support.firePropertyChange("MessageReceived", null, message);
    }

    @Override
    public void addListener(String eventName, PropertyChangeListener listener) {
        support.addPropertyChangeListener(eventName, listener);
    }

    @Override
    public void removeListener(String eventName, PropertyChangeListener listener) {
        support.removePropertyChangeListener(eventName, listener);
    }
}
