package dto;

import java.time.LocalDateTime;

public class SendMessageDto {
    private String context;
    private String senderPhoneNo;
    private String receiverPhoneNo;

    public SendMessageDto(String c, String s, String r){
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

    public String getReceiverPhoneNo() {
        return receiverPhoneNo;
    }

    public void setReceiverPhoneNo(String receiverPhoneNo) {
        this.receiverPhoneNo = receiverPhoneNo;
    }

    public String getSenderPhoneNo() {
        return senderPhoneNo;
    }

    public void setSenderPhoneNo(String senderPhoneNo) {
        this.senderPhoneNo = senderPhoneNo;
    }
}
