package model;

import java.time.LocalDateTime;

public class ReceiveMessage {
    private String senderPhoneNo;
    private String context;
    private LocalDateTime time;

    public ReceiveMessage(String s, String c, LocalDateTime t){
        this.senderPhoneNo = s;
        this.context = c;
        this.time = t;
    }

    public String getSenderPhoneNo() {
        return senderPhoneNo;
    }

    public void setSenderPhoneNo(String senderPhoneNo) {
        this.senderPhoneNo = senderPhoneNo;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ReceiveMessage{" +
                "senderPhoneNo='" + senderPhoneNo + '\'' +
                ", context='" + context + '\'' +
                ", time='" + time + '\'' +
                '}';
    }


}
