package com.domain;

import com.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.Iterator;

/**
 * ActionController
 *
 * @author zf
 * @date 2017/10/31
 */
@RestController("action")
public class ActionController {

    @Autowired
    ActionService actionService;

    @RequestMapping("findAction")
    public Iterable<Action> findAction(){
        return actionService.selectAction();
    }

}
