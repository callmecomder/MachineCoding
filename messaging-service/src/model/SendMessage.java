package model;

import java.time.LocalDateTime;

public class SendMessage {
    private Integer id;
    private String context;
    private String senderPhoneNo;
    private String receiverPhoneNo;
    private LocalDateTime time;

    public SendMessage(Integer i, String c, String s, String r, LocalDateTime t){
        this.id = i;
        this.context = c;
        this.senderPhoneNo = s;
        this.receiverPhoneNo = r;
        this.time = t;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
