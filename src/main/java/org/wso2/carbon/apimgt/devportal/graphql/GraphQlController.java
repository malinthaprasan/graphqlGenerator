package org.wso2.carbon.apimgt.devportal.graphql;


import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import org.dataloader.DataLoader;
import org.dataloader.DataLoaderRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Mono;


@RestController
public class GraphQlController {

        @Autowired
        private GraphQL graphql;


        @PostMapping(value="graphql2", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
        public ExecutionResult execute(@RequestBody GraphQlRequestBody body) {
//                return graphql.execute(ExecutionInput.newExecutionInput().query(body.getQuery())
//                        .operationName(body.getOperationName()).build()).toSpecification();

                ExecutionInput.Builder executionInputBuilder = ExecutionInput.newExecutionInput()
                        .query(body.getQuery())
                        .operationName(body.getOperationName());

                DataLoaderRegistry dataLoaderRegistry = new DataLoaderRegistry();
                executionInputBuilder.dataLoaderRegistry(dataLoaderRegistry);
                executionInputBuilder.context(dataLoaderRegistry);
                ExecutionInput executionInput = executionInputBuilder.build();

                return graphql.execute(executionInput);

        }
}