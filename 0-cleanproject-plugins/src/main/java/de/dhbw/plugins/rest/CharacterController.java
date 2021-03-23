package de.dhbw.plugins.rest;

import de.dhbw.cleanproject.application.character.CharacterApplicationService;
import de.dhbw.cleanproject.application.character.command.CreateCharacterCommand;
import de.dhbw.cleanproject.character.CharacterResource;
import de.dhbw.cleanproject.character.CharacterToCharacterResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/character")
public class CharacterController {

    private final CharacterApplicationService characterApplicationService;

    private final CharacterToCharacterResourceMapper characterToCharacterResourceMapper;

    @Autowired
    public CharacterController(CharacterApplicationService characterApplicationService,
                               CharacterToCharacterResourceMapper characterToCharacterResourceMapper) {
        this.characterApplicationService = characterApplicationService;
        this.characterToCharacterResourceMapper = characterToCharacterResourceMapper;
    }

    @GetMapping
    @ResponseBody
    public List<CharacterResource> get() {
        return this.characterApplicationService.findAllCharacters().stream()
                .map(characterToCharacterResourceMapper)
                .collect(Collectors.toList());
    }

    @PostMapping
    @ResponseBody
    public void create(@RequestBody CreateCharacterCommand command) {
        this.characterApplicationService.createCharacter(command);
    }
}
