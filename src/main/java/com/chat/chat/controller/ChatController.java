package com.chat.chat.controller;

import com.chat.chat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;


@Controller
public class ChatController {

    @MessageMapping("/envio")
    @SendTo("/tema/mensajes")
    public ChatMessage sendMessage(ChatMessage chatMessage){

        return new ChatMessage(chatMessage.nombre(), chatMessage.contenido(), chatMessage.color());
    }
}
