package com.example.middle_earth.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class PhysicalAttributesInput {
  private String culture;

  private Gender gender;

  private String eyeColor;

  private String hairColor;

  private String height;

  public PhysicalAttributesInput() {
  }

  public PhysicalAttributesInput(String culture, Gender gender, String eyeColor, String hairColor,
      String height) {
    this.culture = culture;
    this.gender = gender;
    this.eyeColor = eyeColor;
    this.hairColor = hairColor;
    this.height = height;
  }

  public String getCulture() {
    return culture;
  }

  public void setCulture(String culture) {
    this.culture = culture;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  public String getEyeColor() {
    return eyeColor;
  }

  public void setEyeColor(String eyeColor) {
    this.eyeColor = eyeColor;
  }

  public String getHairColor() {
    return hairColor;
  }

  public void setHairColor(String hairColor) {
    this.hairColor = hairColor;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  @Override
  public String toString() {
    return "PhysicalAttributesInput{" + "culture='" + culture + "'," +"gender='" + gender + "'," +"eyeColor='" + eyeColor + "'," +"hairColor='" + hairColor + "'," +"height='" + height + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhysicalAttributesInput that = (PhysicalAttributesInput) o;
        return java.util.Objects.equals(culture, that.culture) &&
                            java.util.Objects.equals(gender, that.gender) &&
                            java.util.Objects.equals(eyeColor, that.eyeColor) &&
                            java.util.Objects.equals(hairColor, that.hairColor) &&
                            java.util.Objects.equals(height, that.height);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(culture, gender, eyeColor, hairColor, height);
  }

  public static com.example.middle_earth.generated.types.PhysicalAttributesInput.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    private String culture;

    private Gender gender;

    private String eyeColor;

    private String hairColor;

    private String height;

    public PhysicalAttributesInput build() {
                  com.example.middle_earth.generated.types.PhysicalAttributesInput result = new com.example.middle_earth.generated.types.PhysicalAttributesInput();
                      result.culture = this.culture;
          result.gender = this.gender;
          result.eyeColor = this.eyeColor;
          result.hairColor = this.hairColor;
          result.height = this.height;
                      return result;
    }

    public com.example.middle_earth.generated.types.PhysicalAttributesInput.Builder culture(
        String culture) {
      this.culture = culture;
      return this;
    }

    public com.example.middle_earth.generated.types.PhysicalAttributesInput.Builder gender(
        Gender gender) {
      this.gender = gender;
      return this;
    }

    public com.example.middle_earth.generated.types.PhysicalAttributesInput.Builder eyeColor(
        String eyeColor) {
      this.eyeColor = eyeColor;
      return this;
    }

    public com.example.middle_earth.generated.types.PhysicalAttributesInput.Builder hairColor(
        String hairColor) {
      this.hairColor = hairColor;
      return this;
    }

    public com.example.middle_earth.generated.types.PhysicalAttributesInput.Builder height(
        String height) {
      this.height = height;
      return this;
    }
  }
}
