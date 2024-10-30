import dto.SendMessageDto;
import dto.SendMessageInGroup;
import model.ReceiveMessage;
import service.MessagingService;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        SendMessageDto sendMessageDto1 = new SendMessageDto("Hi I am Raghav", "9794996126", "8707292585");
        SendMessageDto sendMessageDto2 = new SendMessageDto("Hi I am Varu", "9794996126", "8707292585");

        MessagingService messagingService = new MessagingService();
        //sending message with sendMessageDto1
        try{
            messagingService.sendMessage(sendMessageDto1);
            System.out.println("message sent to phoneNo " + "8707292585");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        //sending message with sendMessageDto2
        try{
            messagingService.sendMessage(sendMessageDto2);
            System.out.println("message sent to phoneNo " + "8707292585");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        List<String> phoneNosOfReceiver = new ArrayList<>();
        phoneNosOfReceiver.add("8707292585");
        phoneNosOfReceiver.add("9898299999");

        SendMessageInGroup sendMessageInGroup = new SendMessageInGroup("Hi I am Don", "9794996124", phoneNosOfReceiver);
        //sending message in group
        try{
            messagingService.sendMessageInGroup(sendMessageInGroup);
            System.out.println("message sent to phoneNo " + phoneNosOfReceiver);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


        //Receiver's end messageDto1
        try{
            List<ReceiveMessage> receiverMessages = messagingService.getReceiverMessages("8707292585");
            System.out.println(receiverMessages);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}