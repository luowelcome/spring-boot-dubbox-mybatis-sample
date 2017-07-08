package com.lowell.gitlib.sbdms.client.consumer;

import com.lowell.gitlib.sbdms.facade.stub.test.TestInterface;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;


/**
 * Created by Lowell on 17-7-5.
 */
@RestController
public class Client {
	
	private static final Logger log = LoggerFactory.getLogger(Client.class);

	/**
	 * dubbo注解，远程调用分布
	 */
    @Reference
    private TestInterface xmlService;
    
    /**
     * http://localhost:8082/test
     * mainInterfaceTest2
     * @return 
     * Integer
     * @exception 
     * @since  1.0.0
     */
    @RequestMapping("/test")
    @ResponseBody
    public Integer  mainInterfaceTest2(){
        Integer a = xmlService.test();
        log.info("客户端调用返回结果" + a);
        return a;
    }
    
}
