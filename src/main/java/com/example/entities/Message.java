package com.example.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class Message {
    @Id
    @GeneratedValue
    @GenericGenerator(name = "uuid",strategy = "uuid2")
    private  String messageId;
    @Column(name = "txt_message")
    private String txtMessage;

    public Message(String messageId, String txtMessage) {
        this.messageId = messageId;
        this.txtMessage = txtMessage;
    }
}