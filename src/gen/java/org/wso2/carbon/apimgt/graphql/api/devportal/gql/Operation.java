/** Generated by the default template from graphql-java-generator */
package org.wso2.carbon.apimgt.graphql.api.devportal.gql;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import javax.persistence.Entity;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@Entity
@GraphQLObjectType("Operation")
public class Operation  {

	public Operation(){
		// No action
	}

	@GraphQLScalar(fieldName = "target", graphQLTypeSimpleName = "String", javaClass = String.class)
	String target;


	@GraphQLScalar(fieldName = "verb", graphQLTypeSimpleName = "String", javaClass = String.class)
	String verb;



	public void setTarget(String target) {
		this.target = target;
	}

	public String getTarget() {
		return target;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}

	public String getVerb() {
		return verb;
	}

    public String toString() {
        return "Operation {"
				+ "target: " + target
				+ ", "
				+ "verb: " + verb
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Target("target"),
		Verb("verb");

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
		private String target;
		private String verb;


		public Builder withTarget(String target) {
			this.target = target;
			return this;
		}
		public Builder withVerb(String verb) {
			this.verb = verb;
			return this;
		}

		public Operation build() {
			Operation _object = new Operation();
			_object.setTarget(target);
			_object.setVerb(verb);
			return _object;
		}
	}
}
