package dev.ens.rickandmortyapi.rickAndMortyApi;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/characters")
@RequiredArgsConstructor   //setzen der DI
public class CharacterController {

    private final RickAndMortyApiService rickAndMortyApiService;

   @GetMapping
    public ApiResponse getAllCharacters(){
       return rickAndMortyApiService.loadAllCharacters();
   }
}
