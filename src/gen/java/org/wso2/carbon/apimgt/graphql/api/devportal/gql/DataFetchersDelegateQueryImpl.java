package org.wso2.carbon.apimgt.graphql.api.devportal.gql;

import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataFetchersDelegateQueryImpl implements DataFetchersDelegateQuery {
    @Override
    public ApiListing getApiListing(DataFetchingEnvironment dataFetchingEnvironment, Integer start, Integer offset) {
        return null;
    }

    @Override
    public Api getApi(DataFetchingEnvironment dataFetchingEnvironment, String id) {
        return null;
    }

    @Override
    public List<Tag> getTags(DataFetchingEnvironment dataFetchingEnvironment) {
        return null;
    }
}
