package com.example.middle_earth.generated.datafetchers;

import com.example.middle_earth.generated.types.Character;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;

@DgsComponent
public class CharactersDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "characters"
  )
  public List<Character> getCharacters(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
