package com.github.akshatdev0.swapi;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutableGraphQLRequest.class)
@JsonDeserialize(as = ImmutableGraphQLRequest.class)
public interface GraphQLRequest {

  String query();

  @Value.Default
  default Map<String, Object> variables() {
    return ImmutableMap.of();
  }

  @Value.Default
  default String operationName() {
    return "";
  }
}
