package com.github.akshatdev0.swapi;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import org.immutables.value.Value;

@Value.Immutable
@JsonSerialize(as = ImmutablePerson.class)
@JsonDeserialize(as = ImmutablePerson.class)
public interface Starship {

  String id();

  String name();

  String model();

  List<String> manufacturers();

  float costInCredits();

  float length();

  int maxAtmospheringSpeed();

  String crew();

  String passengers();

  float cargoCapacity();

  String consumables();

  float hyperdriveRating();

  int MGLT();

  String starshipClass();

  String created();

  String edited();
}
