package com.example.middle_earth.generated.datafetchers;

import com.example.middle_earth.generated.types.Character;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class CharacterDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "character"
  )
  public Character getCharacter(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
