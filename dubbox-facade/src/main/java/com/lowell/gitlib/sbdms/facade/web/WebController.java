package com.lowell.gitlib.sbdms.facade.web;


import com.lowell.gitlib.sbdms.facade.service.MsgReceiver;
import com.lowell.gitlib.sbdms.model.UserInfoResponse;
import com.lowell.gitlib.sbdms.facade.mapper.UserMapper;
import com.lowell.gitlib.sbdms.facade.service.MsgSender;
import com.lowell.gitlib.sbdms.model.UserInfoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by xiabin on 2017/6/17.
 */
@RestController
public class WebController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private MsgSender sender;

    @Autowired
    private MsgReceiver msgReceiver;


    @RequestMapping(value = "/test", method = RequestMethod.POST,
            consumes = "application/json", produces = "application/json;charset=UTF-8")
    public UserInfoResponse login(@RequestBody UserInfoRequest request){
        UserInfoResponse userInfoResponse = new UserInfoResponse();
        userInfoResponse = userMapper.getUserInfo(request);
        return userInfoResponse;
    }


    @RequestMapping(value = { "/sendMsg" }, method = RequestMethod.GET)
    @ResponseBody
    public void sendMsg() {
        sender.send();
    }

}
