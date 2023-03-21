package SimpleChatPrettified.transferobjects;

import java.io.Serializable;

public class Message implements Serializable

{
  private String msg;

  public Message(String msg)
  {
    this.msg = msg;
  }

  public String getMessage()
  {
    return msg;
  }
}
