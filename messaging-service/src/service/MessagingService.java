package service;

import dto.SendMessageDto;
import model.ReceiveMessage;
import model.SendMessage;
import dto.SendMessageInGroup;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MessagingService {

    final Map<Integer, SendMessage> messageDetails = new ConcurrentHashMap<>();
    Integer id = 1;

    public void sendMessage(SendMessageDto sendMessageDto) throws Exception {
        int newId = id;
        id++;
        if(sendMessageDto.getSenderPhoneNo().length() != 10){
            throw new Exception("The sender phone No is not correct");
        }
        if(sendMessageDto.getReceiverPhoneNo().length() != 10){
            throw new Exception("The receiver phone No is not correct");
        }
        messageDetails.put(newId, new SendMessage(id, sendMessageDto.getContext(), sendMessageDto.getSenderPhoneNo()
                                            ,sendMessageDto.getReceiverPhoneNo(), LocalDateTime.now()));
    }

    public void sendMessageInGroup(SendMessageInGroup sendMessageInGroup) throws Exception {
        int newId = id;
        id++;
        if(sendMessageInGroup.getSenderPhoneNo().length() != 10){
            throw new Exception("The sender phone No is not correct");
        }
        for(String receiverPhoneNo : sendMessageInGroup.getReceiverPhoneNo()){
            if(receiverPhoneNo.length() != 10){
                throw new Exception("The receiver phone No is not correct" + receiverPhoneNo);
            }
        }
        for(String receiverPhoneNo : sendMessageInGroup.getReceiverPhoneNo()){
            messageDetails.put(newId, new SendMessage(newId, sendMessageInGroup.getContext(), sendMessageInGroup.getSenderPhoneNo()
                    , receiverPhoneNo, LocalDateTime.now()));
            newId++;
        }
        messageDetails.get(newId);
    }

    public List<ReceiveMessage> getReceiverMessages(String receiverPhoneNo){
        List<ReceiveMessage> messagesFoReceiver = new ArrayList<>();
        for(SendMessage message : messageDetails.values()){
            if(message.getReceiverPhoneNo().equalsIgnoreCase(receiverPhoneNo)){
                messagesFoReceiver.add(new ReceiveMessage(message.getSenderPhoneNo(), message.getContext(), message.getTime()));
            }
        }
        return messagesFoReceiver;
    }

}
