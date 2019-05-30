package io.falcon.assignment.service;

import io.falcon.assignment.model.Payload;
import io.falcon.assignment.repository.PayloadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PayloadService {

    @Autowired
    private PayloadRepository payloadRepository;


    public void save(Payload payload){
       payloadRepository.save(payload);
    }

    public Iterable<Payload> list(){
        return payloadRepository.findAll();
    }
}
