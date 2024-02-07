package com.example.middle_earth.generated;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String Character = "character";

    public static final String Characters = "characters";

    public static class CHARACTER_INPUT_ARGUMENT {
      public static final String Id = "id";
    }
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String CharacterCreate = "characterCreate";

    public static final String CharacterUpdate = "characterUpdate";

    public static final String CharacterDelete = "characterDelete";

    public static class CHARACTERCREATE_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    public static class CHARACTERUPDATE_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    public static class CHARACTERDELETE_INPUT_ARGUMENT {
      public static final String Id = "id";
    }
  }

  public static class CHARACTER {
    public static final String TYPE_NAME = "Character";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Title = "title";

    public static final String Weapon = "weapon";

    public static final String PhysicalAttributes = "physicalAttributes";
  }

  public static class PHYSICALATTRIBUTES {
    public static final String TYPE_NAME = "PhysicalAttributes";

    public static final String Culture = "culture";

    public static final String Gender = "gender";

    public static final String EyeColor = "eyeColor";

    public static final String HairColor = "hairColor";

    public static final String Height = "height";
  }

  public static class CHARACTERCREATEINPUT {
    public static final String TYPE_NAME = "CharacterCreateInput";

    public static final String Name = "name";

    public static final String Title = "title";

    public static final String Weapon = "weapon";

    public static final String PhysicalAttributes = "physicalAttributes";
  }

  public static class PHYSICALATTRIBUTESINPUT {
    public static final String TYPE_NAME = "PhysicalAttributesInput";

    public static final String Culture = "culture";

    public static final String Gender = "gender";

    public static final String EyeColor = "eyeColor";

    public static final String HairColor = "hairColor";

    public static final String Height = "height";
  }
}
