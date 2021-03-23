package de.dhbw.plugins.rest;

import de.dhbw.cleanproject.application.character.CharacterApplicationService;
import de.dhbw.cleanproject.application.character.command.CreateCharacterCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/character")
public class CharacterController {

    private final CharacterApplicationService characterApplicationService;

    @Autowired
    public CharacterController(CharacterApplicationService characterApplicationService) {
        this.characterApplicationService = characterApplicationService;
    }

    @PostMapping
    @ResponseBody
    public void create(@RequestBody CreateCharacterCommand command) {
        this.characterApplicationService.createCharacter(command);
    }
}
