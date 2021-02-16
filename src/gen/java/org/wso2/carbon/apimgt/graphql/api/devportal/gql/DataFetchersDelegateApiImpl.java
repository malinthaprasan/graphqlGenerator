package org.wso2.carbon.apimgt.graphql.api.devportal.gql;

import graphql.schema.DataFetchingEnvironment;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class DataFetchersDelegateApiImpl implements DataFetchersDelegateApi {
    @Override
    public BusinessInformation businessInformation(DataFetchingEnvironment dataFetchingEnvironment, Api origin) {
        return null;
    }

    @Override
    public List<Label> label(DataFetchingEnvironment dataFetchingEnvironment, Api origin) {
        return null;
    }

    @Override
    public List<Scope> scope(DataFetchingEnvironment dataFetchingEnvironment, Api origin) {
        return null;
    }

    @Override
    public List<APIEndpointURLsDTO> apiEndPointInformation(DataFetchingEnvironment dataFetchingEnvironment, Api origin) {
        return null;
    }

    @Override
    public List<Tier> tierInformation(DataFetchingEnvironment dataFetchingEnvironment, Api origin) {
        return null;
    }

    @Override
    public List<Operation> operationInformation(DataFetchingEnvironment dataFetchingEnvironment, Api origin) {
        return null;
    }

    @Override
    public List<IngressUrl> ingressUrl(DataFetchingEnvironment dataFetchingEnvironment, Api origin) {
        return null;
    }

    @Override
    public Advertise advertiseInfo(DataFetchingEnvironment dataFetchingEnvironment, Api origin) {
        return null;
    }
}
