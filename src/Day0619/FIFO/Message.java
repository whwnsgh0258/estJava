package Day0619.FIFO;

import java.util.LinkedList;
import java.util.Queue;

public class Message {
    private String command;
    private String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public String getTo() {
        return to;
    }

    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();
        messageQueue.offer(new Message("Send Mail", "홍길동"));
        messageQueue.offer(new Message("Send Sms", "제니"));
        messageQueue.offer(new Message("Send KakaoTalk", "리사"));
        messageQueue.offer(new Message("Send WeeklyQuiz", "김승조"));

        while (!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "Send Mail":
                    System.out.println(message.getTo() + "에게 메일을 보냅니다");
                    break;
                case "Send Sms":
                    System.out.println(message.getTo() + "에게 SMS를 보냅니다.");
                    break;
                case "send KakaoTalk":
                    System.out.println(message.getTo() + "에게 카톡을 보냅니다");
                    break;
                default:
                    System.out.println(message.getTo() + "에게 아무거나 보냅니다.");
            }
        }
    }
}
