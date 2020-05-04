package com.github.akshatdev0.swapi.starwars.planet;

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

  float population();

  List<String> climates();

  List<String> terrains();

  float surfaceWater();

  String created();

  String edited();
}
