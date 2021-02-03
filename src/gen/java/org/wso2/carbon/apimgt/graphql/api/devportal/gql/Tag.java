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
@GraphQLObjectType("Tag")
public class Tag  {

	public Tag(){
		// No action
	}

	@GraphQLScalar(fieldName = "value", graphQLTypeSimpleName = "String", javaClass = String.class)
	String value;


	@GraphQLScalar(fieldName = "count", graphQLTypeSimpleName = "Int", javaClass = Integer.class)
	Integer count;



	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getCount() {
		return count;
	}

    public String toString() {
        return "Tag {"
				+ "value: " + value
				+ ", "
				+ "count: " + count
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Value("value"),
		Count("count");

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
		private String value;
		private Integer count;


		public Builder withValue(String value) {
			this.value = value;
			return this;
		}
		public Builder withCount(Integer count) {
			this.count = count;
			return this;
		}

		public Tag build() {
			Tag _object = new Tag();
			_object.setValue(value);
			_object.setCount(count);
			return _object;
		}
	}
}
