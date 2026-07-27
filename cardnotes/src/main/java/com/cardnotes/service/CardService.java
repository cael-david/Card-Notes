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
                    .orElseThrow(() -> new RuntimeException("Card não encontrado" + card.getId()));
            cardExistente.setTitulo(card.getTitulo());
            cardExistente.setDescricao(card.getDescricao());
            cardExistente.setAnotacoes(card.getAnotacoes());
            cardExistente.setImagemCapa(card.getImagemCapa());
            cardExistente.setOrdem(card.getOrdem());

            // Opcional: atualiza o parent caso tenha mudado de hierarquia
            cardExistente.setParent(card.getParent());

            return repository.save(cardExistente);
        }

        // Se não tem ID, é um card totalmente novo
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


