package com.example.middle_earth.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Character {
  private String id;

  private String name;

  private String title;

  private String weapon;

  private PhysicalAttributes physicalAttributes;

  public Character() {
  }

  public Character(String id, String name, String title, String weapon,
      PhysicalAttributes physicalAttributes) {
    this.id = id;
    this.name = name;
    this.title = title;
    this.weapon = weapon;
    this.physicalAttributes = physicalAttributes;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public PhysicalAttributes getPhysicalAttributes() {
    return physicalAttributes;
  }

  public void setPhysicalAttributes(PhysicalAttributes physicalAttributes) {
    this.physicalAttributes = physicalAttributes;
  }

  @Override
  public String toString() {
    return "Character{" + "id='" + id + "'," +"name='" + name + "'," +"title='" + title + "'," +"weapon='" + weapon + "'," +"physicalAttributes='" + physicalAttributes + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character that = (Character) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(weapon, that.weapon) &&
                            java.util.Objects.equals(physicalAttributes, that.physicalAttributes);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, title, weapon, physicalAttributes);
  }

  public static com.example.middle_earth.generated.types.Character.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String id;

    private String name;

    private String title;

    private String weapon;

    private PhysicalAttributes physicalAttributes;

    public Character build() {
                  com.example.middle_earth.generated.types.Character result = new com.example.middle_earth.generated.types.Character();
                      result.id = this.id;
          result.name = this.name;
          result.title = this.title;
          result.weapon = this.weapon;
          result.physicalAttributes = this.physicalAttributes;
                      return result;
    }

    public com.example.middle_earth.generated.types.Character.Builder id(String id) {
      this.id = id;
      return this;
    }

    public com.example.middle_earth.generated.types.Character.Builder name(String name) {
      this.name = name;
      return this;
    }

    public com.example.middle_earth.generated.types.Character.Builder title(String title) {
      this.title = title;
      return this;
    }

    public com.example.middle_earth.generated.types.Character.Builder weapon(String weapon) {
      this.weapon = weapon;
      return this;
    }

    public com.example.middle_earth.generated.types.Character.Builder physicalAttributes(
        PhysicalAttributes physicalAttributes) {
      this.physicalAttributes = physicalAttributes;
      return this;
    }
  }
}
