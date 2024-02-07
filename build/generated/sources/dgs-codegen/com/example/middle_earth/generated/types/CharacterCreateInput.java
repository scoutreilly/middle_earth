package com.example.middle_earth.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class CharacterCreateInput {
  private String name;

  private String title;

  private String weapon;

  private PhysicalAttributesInput physicalAttributes;

  public CharacterCreateInput() {
  }

  public CharacterCreateInput(String name, String title, String weapon,
      PhysicalAttributesInput physicalAttributes) {
    this.name = name;
    this.title = title;
    this.weapon = weapon;
    this.physicalAttributes = physicalAttributes;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWeapon() {
    return weapon;
  }

  public void setWeapon(String weapon) {
    this.weapon = weapon;
  }

  public PhysicalAttributesInput getPhysicalAttributes() {
    return physicalAttributes;
  }

  public void setPhysicalAttributes(PhysicalAttributesInput physicalAttributes) {
    this.physicalAttributes = physicalAttributes;
  }

  @Override
  public String toString() {
    return "CharacterCreateInput{" + "name='" + name + "'," +"title='" + title + "'," +"weapon='" + weapon + "'," +"physicalAttributes='" + physicalAttributes + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterCreateInput that = (CharacterCreateInput) o;
        return java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(weapon, that.weapon) &&
                            java.util.Objects.equals(physicalAttributes, that.physicalAttributes);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, title, weapon, physicalAttributes);
  }

  public static com.example.middle_earth.generated.types.CharacterCreateInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String name;

    private String title;

    private String weapon;

    private PhysicalAttributesInput physicalAttributes;

    public CharacterCreateInput build() {
                  com.example.middle_earth.generated.types.CharacterCreateInput result = new com.example.middle_earth.generated.types.CharacterCreateInput();
                      result.name = this.name;
          result.title = this.title;
          result.weapon = this.weapon;
          result.physicalAttributes = this.physicalAttributes;
                      return result;
    }

    public com.example.middle_earth.generated.types.CharacterCreateInput.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.example.middle_earth.generated.types.CharacterCreateInput.Builder title(
        String title) {
      this.title = title;
      return this;
    }

    public com.example.middle_earth.generated.types.CharacterCreateInput.Builder weapon(
        String weapon) {
      this.weapon = weapon;
      return this;
    }

    public com.example.middle_earth.generated.types.CharacterCreateInput.Builder physicalAttributes(
        PhysicalAttributesInput physicalAttributes) {
      this.physicalAttributes = physicalAttributes;
      return this;
    }
  }
}
