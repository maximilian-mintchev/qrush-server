package com.app.qrush.model.messages;

import com.app.qrush.model.enums.MatchStatus;
import com.app.qrush.model.enums.Status;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Message {
    private String senderName;
    private String receiverName;
    private MatchStatus message;
    private String date;
    private Status status;
}