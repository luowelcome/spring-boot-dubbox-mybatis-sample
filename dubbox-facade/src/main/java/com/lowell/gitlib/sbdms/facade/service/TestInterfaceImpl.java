package com.lowell.gitlib.sbdms.facade.service;

import com.lowell.gitlib.sbdms.facade.stub.test.TestInterface;
import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * 使用dubbo协议方式通信
 * Created by Lowell on 17-7-5.
 */
@Service(protocol = "dubbo")
public class TestInterfaceImpl implements TestInterface {
	
	private static final Logger log = LoggerFactory.getLogger(TestInterfaceImpl.class);
    @Override
    public Integer test() {
       log.info("boot---服务实现");
       return 1;
    }
}
