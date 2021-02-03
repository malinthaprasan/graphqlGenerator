/** Generated by the default template from graphql-java-generator */
package org.wso2.carbon.apimgt.graphql.api.devportal.gql;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLObjectType("URL")
public class URL  {

	public URL(){
		// No action
	}

	@GraphQLScalar(fieldName = "http", graphQLTypeSimpleName = "String", javaClass = String.class)
	String http;


	@GraphQLScalar(fieldName = "https", graphQLTypeSimpleName = "String", javaClass = String.class)
	String https;


	@GraphQLScalar(fieldName = "ws", graphQLTypeSimpleName = "String", javaClass = String.class)
	String ws;


	@GraphQLScalar(fieldName = "wss", graphQLTypeSimpleName = "String", javaClass = String.class)
	String wss;



	public void setHttp(String http) {
		this.http = http;
	}

	public String getHttp() {
		return http;
	}

	public void setHttps(String https) {
		this.https = https;
	}

	public String getHttps() {
		return https;
	}

	public void setWs(String ws) {
		this.ws = ws;
	}

	public String getWs() {
		return ws;
	}

	public void setWss(String wss) {
		this.wss = wss;
	}

	public String getWss() {
		return wss;
	}

    public String toString() {
        return "URL {"
				+ "http: " + http
				+ ", "
				+ "https: " + https
				+ ", "
				+ "ws: " + ws
				+ ", "
				+ "wss: " + wss
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Http("http"),
		Https("https"),
		Ws("ws"),
		Wss("wss");

		private String fieldName;

		Field(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getFieldName() {
			return fieldName;
		}

		public Class<?> getGraphQLType() {
			return this.getClass().getDeclaringClass();
		}

	}

	public static Builder builder() {
			return new Builder();
		}



	/**
	 * Builder
	 */
	public static class Builder {
		private String http;
		private String https;
		private String ws;
		private String wss;


		public Builder withHttp(String http) {
			this.http = http;
			return this;
		}
		public Builder withHttps(String https) {
			this.https = https;
			return this;
		}
		public Builder withWs(String ws) {
			this.ws = ws;
			return this;
		}
		public Builder withWss(String wss) {
			this.wss = wss;
			return this;
		}

		public URL build() {
			URL _object = new URL();
			_object.setHttp(http);
			_object.setHttps(https);
			_object.setWs(ws);
			_object.setWss(wss);
			return _object;
		}
	}
}