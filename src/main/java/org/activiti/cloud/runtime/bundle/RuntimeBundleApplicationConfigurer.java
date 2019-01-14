package org.activiti.cloud.runtime.bundle;

import java.util.Arrays;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.impl.rules.RulesDeployer;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

@Configuration
public class RuntimeBundleApplicationConfigurer implements ProcessEngineConfigurationConfigurer {
	
	@Value("classpath:workflows/*.*")
	private Resource[] deploymentResources;
	
	
	@Override
	public void configure(SpringProcessEngineConfiguration configuration) {
		configuration.setCustomPostDeployers(Arrays.asList(new RulesDeployer()));
	}
	
	@Bean
	public CommandLineRunner deployMortgageQAResources(RepositoryService repositoryService) {
		return (args) -> {
	        DeploymentBuilder deployment = repositoryService.createDeployment()
        	.name("IRT Process Workflow")
            .enableDuplicateFiltering();
	        
	        for(Resource resource: deploymentResources)
	        	deployment.addInputStream(resource.getFilename(), resource.getInputStream());
	        
            deployment.deploy();			
		};
	}
	
	
}