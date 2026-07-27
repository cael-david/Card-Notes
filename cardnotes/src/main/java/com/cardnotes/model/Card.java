package com.cardnotes.model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "cards")
@JsonIgnoreProperties(ignoreUnknown = true, value ={"hibernateLazyInitializer","handler"})
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    private String imagemCapa;

    private Integer ordem;

    @Column(columnDefinition = "TEXT")

    private String anotacoes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    @JsonIgnoreProperties("filhos")
    private Card parent;

    @OneToMany(mappedBy = "parent",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @OrderBy("ordem ASC")
    @JsonIgnoreProperties("parent")
    private List<Card> filhos = new ArrayList<>();

    @OneToMany(mappedBy = "card",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @OrderBy("ordem ASC")
    @JsonIgnoreProperties("card")
    private List<Imagem> imagens = new ArrayList<>();


}


