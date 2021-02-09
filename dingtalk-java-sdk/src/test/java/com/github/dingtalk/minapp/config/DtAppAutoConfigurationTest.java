package com.github.dingtalk.minapp.config;

import com.github.dingtalk.minapp.api.DtAppService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author young
 * @Date 2021/2/8 13:50
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringTestApplication.class)
public class DtAppAutoConfigurationTest {

    @Autowired
    DtAppConfig dtAppConfig;
    @Autowired
    DtAppService dtAppService;

    @Test
    public void contextLoads(){
        System.out.println(dtAppConfig);
        System.out.println(dtAppService);
    }
}
