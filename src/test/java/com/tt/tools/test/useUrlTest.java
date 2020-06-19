package com.tt.tools.test;

import com.tt.tools.service.UseUrlService;
import com.tt.tools.untilmethod.encrypto.JasyptUntil;
import groovy.util.logging.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;


@Slf4j
@SpringBootTest
public class useUrlTest {
    @Autowired
    private UseUrlService useUrlService;
    @Autowired
    private JasyptUntil jasyptUntil;
    @Test
    public void getUrlTest(){
        List<String> list = new ArrayList<>();
        list.add("gggg");
        list.add("dddd");
        list.add("bbbb");

        jasyptUntil.encrypto("asdd",list);
    }

}
