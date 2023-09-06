package com.kenny.postgrescompositepksequencesample.controller;

import com.kenny.postgrescompositepksequencesample.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @PostMapping("/card_history")
    public void saveCardHistory() {
        cardService.saveCardHistory();
    }
}
