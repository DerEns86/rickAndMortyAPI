package dev.ens.rickandmortyapi.rickAndMortyApi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class RickAndMortyApiService {

    private final RestClient restClient;

    public RickAndMortyApiService() {
        this.restClient = RestClient.builder()
                .baseUrl("https://rickandmortyapi.com")
        .build();
    }

    public ApiResponse loadAllCharacters(){

        ApiResponse body = restClient.get()
                .uri("/api/character")
                .retrieve()
                .body(ApiResponse.class);

        return body;
    }
}
