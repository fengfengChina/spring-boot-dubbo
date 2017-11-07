package com.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.domain.Action;
import com.respository.ActionRepo;
import org.springframework.beans.factory.annotation.Autowired;


@Service(timeout = 5000)
public class ActionService {
    @Autowired
    ActionRepo actionRepo;

    public Iterable<Action> selectAction(){
        return actionRepo.findAll();
    }
}
