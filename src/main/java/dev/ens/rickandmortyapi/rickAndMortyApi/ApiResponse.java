package dev.ens.rickandmortyapi.rickAndMortyApi;

import java.util.List;

public record ApiResponse(
        ResponseInfo info,
        List<Character> results
) {
}
