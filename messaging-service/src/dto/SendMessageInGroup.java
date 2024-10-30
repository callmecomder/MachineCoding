package dto;

import java.time.LocalDateTime;
import java.util.List;

public class SendMessageInGroup {
    private String context;
    private String senderPhoneNo;
    private List<String> receiverPhoneNo;

    public SendMessageInGroup(String c, String s, List<String> r){
        this.context = c;
        this.senderPhoneNo = s;
        this.receiverPhoneNo = r;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public List<String> getReceiverPhoneNo() {
        return receiverPhoneNo;
    }

    public void setReceiverPhoneNo(List<String> receiverPhoneNo) {
        this.receiverPhoneNo = receiverPhoneNo;
    }

    public String getSenderPhoneNo() {
        return senderPhoneNo;
    }

    public void setSenderPhoneNo(String senderPhoneNo) {
        this.senderPhoneNo = senderPhoneNo;
    }

}

