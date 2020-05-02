package com.github.akshatdev0.swapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

class GraphQLRequest {

  @JsonProperty("query")
  private String query;

  @JsonProperty("variables")
  private Map<String, Object> variables;

  @JsonProperty("operationName")
  private String operationName;

  GraphQLRequest() {
    query = "";
    variables = ImmutableMap.of();
    operationName = "";
  }

  public String query() {
    return query;
  }

  public Map<String, Object> variables() {
    return variables;
  }

  public String operationName() {
    return operationName;
  }
}
