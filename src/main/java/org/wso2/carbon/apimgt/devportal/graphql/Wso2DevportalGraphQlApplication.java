package org.wso2.carbon.apimgt.devportal.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication(scanBasePackages = { "org.wso2.carbon.apimgt.devportal.graphql", "com.graphql_java_generator" ,
		"org.wso2.carbon.apimgt.graphql.api.devportal.gql" })
@EntityScan(basePackages = { "org.wso2.carbon.apimgt.devportal.graphql", "com.graphql_java_generator" ,"org.wso2.carbon.apimgt.graphql.api.devportal.gql" })
@EnableConfigurationProperties
public class Wso2DevportalGraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(Wso2DevportalGraphQlApplication.class, args);
	}

}
