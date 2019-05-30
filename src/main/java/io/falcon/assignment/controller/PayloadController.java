package io.falcon.assignment.controller;

import io.falcon.assignment.model.Payload;
import io.falcon.assignment.service.PayloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class PayloadController {

    @Autowired
    private PayloadService payloadService;
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addPayload(@RequestBody Payload payload) {
        payloadService.save(payload);
    }

    @RequestMapping("/list")
    public Iterable<Payload> show(){
        return payloadService.list();
    }

    @MessageMapping("/payloads")
    public void broadcastNews(Payload payload) {
        this.simpMessagingTemplate.convertAndSend("/topic/payloads", payload);
    }


}
