package com.github.akshatdev0.swapi.util;

public class StringUtils {

  private static final String[] EMPTY_STRING_ARRAY = new String[] {};

  public static String[] splitByComma(String s) {
    if (isBlank(s)) {
      return EMPTY_STRING_ARRAY;
    }
    return s.split("\\s*,\\s*");
  }

  public static Integer asInt(String s, Integer defaultValue) {
    if (isBlank(s)) {
      return defaultValue;
    }
    try {
      return Integer.parseInt(s);
    } catch (NumberFormatException ex) {
      return defaultValue;
    }
  }

  public static Long asLong(String s, Long defaultValue) {
    if (isBlank(s)) {
      return defaultValue;
    }
    try {
      return Long.parseLong(s);
    } catch (NumberFormatException ex) {
      return defaultValue;
    }
  }

  public static Float asFloat(String s, Float defaultValue) {
    if (isBlank(s)) {
      return defaultValue;
    }
    try {
      return Float.parseFloat(s);
    } catch (NumberFormatException ex) {
      return defaultValue;
    }
  }

  public static Double asDouble(String s, Double defaultValue) {
    if (isBlank(s)) {
      return defaultValue;
    }
    try {
      return Double.parseDouble(s);
    } catch (NumberFormatException ex) {
      return defaultValue;
    }
  }

  public static boolean isBlank(String s) {
    return s == null || s.trim().isEmpty();
  }
}
