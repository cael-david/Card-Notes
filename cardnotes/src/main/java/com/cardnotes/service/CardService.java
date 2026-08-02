package com.cardnotes.service;

import com.cardnotes.model.Card;
import com.cardnotes.model.CardRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CardService {

    private final CardRepository repository;

    public CardService(CardRepository repository){
        this.repository = repository;
    }
    public void deletarCard(Long id) {
        repository.deleteById(id);
    }

    public Card salvar(Card card) {
        if (card.getId() != null) {
            Card cardExistente = repository.findById(card.getId())
                    .orElseThrow(() -> new RuntimeException("Card não encontrado: " + card.getId()));

            if (card.getTitulo() != null) {
                cardExistente.setTitulo(card.getTitulo());
            }

            if (card.getDescricao() != null) {
                cardExistente.setDescricao(card.getDescricao());
            }

            if (card.getAnotacoes() != null) {
                cardExistente.setAnotacoes(card.getAnotacoes());
            }

            if (card.getImagemCapa() != null && !card.getImagemCapa().trim().isEmpty()) {
                cardExistente.setImagemCapa(card.getImagemCapa());
            }

            if (card.getOrdem() != null) {
                cardExistente.setOrdem(card.getOrdem());
            }

            if (card.getParent() != null) {
                cardExistente.setParent(card.getParent());
            }

            return repository.save(cardExistente);
        }

        return repository.save(card);
    }


    public List<Card> listarCardsPrincipais(){
        return repository.findByParentIsNullOrderByOrdem();
    }
    public List<Card> listarCardsFilhos(Long parentID){
        return repository.findByParentIdOrderByOrdem(parentID);
    }
    public Card buscarPorId(Long id){
        return repository.findById(id).orElseThrow(()->new RuntimeException("Card não encontrado"+id));
    }

}


