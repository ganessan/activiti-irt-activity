package org.activiti.cloud.runtime.bundle;

import java.util.Arrays;

import org.activiti.engine.impl.rules.RulesDeployer;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RuntimeBundleApplicationConfigurer implements ProcessEngineConfigurationConfigurer {
	
	@Override
	public void configure(SpringProcessEngineConfiguration configuration) {
		configuration.setCustomPostDeployers(Arrays.asList(new RulesDeployer()));
	}
	
}