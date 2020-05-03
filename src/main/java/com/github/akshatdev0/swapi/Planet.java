package com.github.akshatdev0.swapi;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePlanet.class)
@JsonDeserialize(as = ImmutablePlanet.class)
public interface Planet {

  String id();

  String name();

  int diameter();

  int rotationPeriod();

  int orbitalPeriod();

  String gravity();

  Float population();

  List<String> climates();

  List<String> terrains();

  Float surfaceWater();

  String created();

  String edited();
}
