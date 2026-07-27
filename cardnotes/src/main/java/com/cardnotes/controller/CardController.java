package com.cardnotes.controller;

import com.cardnotes.model.Card;
import org.springframework.web.bind.annotation.*;
import com.cardnotes.service.CardService;

import java.util.List;

@RestController
@RequestMapping("/cards")
@CrossOrigin(origins="*")

public class CardController {
    private final CardService cardService;

    public CardController(CardService cardService){
        this.cardService = cardService;
    }

    @PostMapping
    public Card salvarCard(@RequestBody Card card){
        return cardService.salvar(card);
    }

    @GetMapping("/{id}")
    public Card buscarCard(@PathVariable Long id){
        return cardService.buscarPorId(id);
    }

    @GetMapping("/principais")
    public List<Card> listarCardsPrincipais(){
        return cardService.listarCardsPrincipais();
    }

    @GetMapping("/{parentId}/filhos")
    public List<Card> listarCards(
        @PathVariable Long parentId){
        return cardService.listarCardsFilhos(parentId);
    }

    @DeleteMapping("/{id}")
    public void deletarCard(@PathVariable Long id){
        cardService.deletarCard(id);
    }
}



