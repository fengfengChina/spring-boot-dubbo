package com.service;

import com.domain.Action;
import com.respository.ActionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ActionService {
    @Autowired
    ActionRepo actionRepo;

    public Iterable<Action> selectAction(){
        return actionRepo.findAll();
    }
}
