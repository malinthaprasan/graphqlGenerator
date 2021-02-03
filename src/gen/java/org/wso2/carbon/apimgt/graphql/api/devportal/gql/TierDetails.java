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
@GraphQLObjectType("TierDetails")
public class TierDetails  {

	public TierDetails(){
		// No action
	}

	@GraphQLScalar(fieldName = "displayName", graphQLTypeSimpleName = "String", javaClass = String.class)
	String displayName;


	@GraphQLScalar(fieldName = "description", graphQLTypeSimpleName = "String", javaClass = String.class)
	String description;


	@GraphQLScalar(fieldName = "policyContent", graphQLTypeSimpleName = "String", javaClass = String.class)
	String policyContent;


	@GraphQLScalar(fieldName = "tierAttributes", graphQLTypeSimpleName = "String", javaClass = String.class)
	String tierAttributes;


	@GraphQLScalar(fieldName = "requestsPerMin", graphQLTypeSimpleName = "Int", javaClass = Integer.class)
	Integer requestsPerMin;


	@GraphQLScalar(fieldName = "requestCount", graphQLTypeSimpleName = "Int", javaClass = Integer.class)
	Integer requestCount;


	@GraphQLScalar(fieldName = "unitTime", graphQLTypeSimpleName = "Int", javaClass = Integer.class)
	Integer unitTime;


	@GraphQLScalar(fieldName = "timeUnit", graphQLTypeSimpleName = "String", javaClass = String.class)
	String timeUnit;


	@GraphQLScalar(fieldName = "tierPlan", graphQLTypeSimpleName = "String", javaClass = String.class)
	String tierPlan;


	@GraphQLScalar(fieldName = "stopOnQuotaReached", graphQLTypeSimpleName = "Boolean", javaClass = Boolean.class)
	Boolean stopOnQuotaReached;


	@GraphQLScalar(fieldName = "monetizationAttributes", graphQLTypeSimpleName = "String", javaClass = String.class)
	String monetizationAttributes;



	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setPolicyContent(String policyContent) {
		this.policyContent = policyContent;
	}

	public String getPolicyContent() {
		return policyContent;
	}

	public void setTierAttributes(String tierAttributes) {
		this.tierAttributes = tierAttributes;
	}

	public String getTierAttributes() {
		return tierAttributes;
	}

	public void setRequestsPerMin(Integer requestsPerMin) {
		this.requestsPerMin = requestsPerMin;
	}

	public Integer getRequestsPerMin() {
		return requestsPerMin;
	}

	public void setRequestCount(Integer requestCount) {
		this.requestCount = requestCount;
	}

	public Integer getRequestCount() {
		return requestCount;
	}

	public void setUnitTime(Integer unitTime) {
		this.unitTime = unitTime;
	}

	public Integer getUnitTime() {
		return unitTime;
	}

	public void setTimeUnit(String timeUnit) {
		this.timeUnit = timeUnit;
	}

	public String getTimeUnit() {
		return timeUnit;
	}

	public void setTierPlan(String tierPlan) {
		this.tierPlan = tierPlan;
	}

	public String getTierPlan() {
		return tierPlan;
	}

	public void setStopOnQuotaReached(Boolean stopOnQuotaReached) {
		this.stopOnQuotaReached = stopOnQuotaReached;
	}

	public Boolean getStopOnQuotaReached() {
		return stopOnQuotaReached;
	}

	public void setMonetizationAttributes(String monetizationAttributes) {
		this.monetizationAttributes = monetizationAttributes;
	}

	public String getMonetizationAttributes() {
		return monetizationAttributes;
	}

    public String toString() {
        return "TierDetails {"
				+ "displayName: " + displayName
				+ ", "
				+ "description: " + description
				+ ", "
				+ "policyContent: " + policyContent
				+ ", "
				+ "tierAttributes: " + tierAttributes
				+ ", "
				+ "requestsPerMin: " + requestsPerMin
				+ ", "
				+ "requestCount: " + requestCount
				+ ", "
				+ "unitTime: " + unitTime
				+ ", "
				+ "timeUnit: " + timeUnit
				+ ", "
				+ "tierPlan: " + tierPlan
				+ ", "
				+ "stopOnQuotaReached: " + stopOnQuotaReached
				+ ", "
				+ "monetizationAttributes: " + monetizationAttributes
        		+ "}";
    }

    /**
	 * Enum of field names
	 */
	 public static enum Field implements GraphQLField {
		DisplayName("displayName"),
		Description("description"),
		PolicyContent("policyContent"),
		TierAttributes("tierAttributes"),
		RequestsPerMin("requestsPerMin"),
		RequestCount("requestCount"),
		UnitTime("unitTime"),
		TimeUnit("timeUnit"),
		TierPlan("tierPlan"),
		StopOnQuotaReached("stopOnQuotaReached"),
		MonetizationAttributes("monetizationAttributes");

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
		private String displayName;
		private String description;
		private String policyContent;
		private String tierAttributes;
		private Integer requestsPerMin;
		private Integer requestCount;
		private Integer unitTime;
		private String timeUnit;
		private String tierPlan;
		private Boolean stopOnQuotaReached;
		private String monetizationAttributes;


		public Builder withDisplayName(String displayName) {
			this.displayName = displayName;
			return this;
		}
		public Builder withDescription(String description) {
			this.description = description;
			return this;
		}
		public Builder withPolicyContent(String policyContent) {
			this.policyContent = policyContent;
			return this;
		}
		public Builder withTierAttributes(String tierAttributes) {
			this.tierAttributes = tierAttributes;
			return this;
		}
		public Builder withRequestsPerMin(Integer requestsPerMin) {
			this.requestsPerMin = requestsPerMin;
			return this;
		}
		public Builder withRequestCount(Integer requestCount) {
			this.requestCount = requestCount;
			return this;
		}
		public Builder withUnitTime(Integer unitTime) {
			this.unitTime = unitTime;
			return this;
		}
		public Builder withTimeUnit(String timeUnit) {
			this.timeUnit = timeUnit;
			return this;
		}
		public Builder withTierPlan(String tierPlan) {
			this.tierPlan = tierPlan;
			return this;
		}
		public Builder withStopOnQuotaReached(Boolean stopOnQuotaReached) {
			this.stopOnQuotaReached = stopOnQuotaReached;
			return this;
		}
		public Builder withMonetizationAttributes(String monetizationAttributes) {
			this.monetizationAttributes = monetizationAttributes;
			return this;
		}

		public TierDetails build() {
			TierDetails _object = new TierDetails();
			_object.setDisplayName(displayName);
			_object.setDescription(description);
			_object.setPolicyContent(policyContent);
			_object.setTierAttributes(tierAttributes);
			_object.setRequestsPerMin(requestsPerMin);
			_object.setRequestCount(requestCount);
			_object.setUnitTime(unitTime);
			_object.setTimeUnit(timeUnit);
			_object.setTierPlan(tierPlan);
			_object.setStopOnQuotaReached(stopOnQuotaReached);
			_object.setMonetizationAttributes(monetizationAttributes);
			return _object;
		}
	}
}