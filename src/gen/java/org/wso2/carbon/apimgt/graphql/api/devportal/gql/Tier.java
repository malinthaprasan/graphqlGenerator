/** Generated by the default template from graphql-java-generator */
package org.wso2.carbon.apimgt.graphql.api.devportal.gql;

import com.graphql_java_generator.GraphQLField;
import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLObjectType;
import com.graphql_java_generator.annotation.GraphQLScalar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@Entity
@GraphQLObjectType("Tier")
public class Tier  {

	public Tier(){
		// No action
	}

	@GraphQLScalar(fieldName = "name", graphQLTypeSimpleName = "String", javaClass = String.class)
	String name;


	@Transient
	@GraphQLNonScalar(fieldName = "tierDetails", graphQLTypeSimpleName = "TierDetails", javaClass = TierDetails.class)
	List<TierDetails> tierDetails;



	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setTierDetails(List<TierDetails> tierDetails) {
		this.tierDetails = tierDetails;
	}

	public List<TierDetails> getTierDetails() {
		return tierDetails;
	}

    public String toString() {
        return "Tier {"
				+ "name: " + name
				+ ", "
				+ "tierDetails: " + tierDetails
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		Name("name"),
		TierDetails("tierDetails");

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
		private String name;
		private List<TierDetails> tierDetails;


		public Builder withName(String name) {
			this.name = name;
			return this;
		}
		public Builder withTierDetails(List<TierDetails> tierDetails) {
			this.tierDetails = tierDetails;
			return this;
		}

		public Tier build() {
			Tier _object = new Tier();
			_object.setName(name);
			_object.setTierDetails(tierDetails);
			return _object;
		}
	}
}
