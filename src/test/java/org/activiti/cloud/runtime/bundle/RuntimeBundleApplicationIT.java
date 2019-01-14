package org.activiti.cloud.runtime.bundle;

import org.activiti.cloud.runtime.bundle.RuntimeBundleApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RuntimeBundleApplication.class)
@DirtiesContext
public class RuntimeBundleApplicationIT {

    @Test
    public void contextLoads() throws Exception {

    }
}