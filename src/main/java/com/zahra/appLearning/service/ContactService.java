package com.zahra.appLearning.service;

import com.zahra.appLearning.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ContactService {

    public Boolean saveMessageDetail(Contact contact){
        boolean isSaved=true;
        log.info(contact.toString());
        return isSaved;
    }
}
