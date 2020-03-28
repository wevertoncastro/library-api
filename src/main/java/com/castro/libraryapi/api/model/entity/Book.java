package com.castro.libraryapi.api.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data // coloca os getters e setters e cria o toString e equalsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity // diz ao jpa a essa classe é uma entidade
@Table
public class Book {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY) // esse cammpo será gerado automaticamente
    private Long id;

    @Column
    private String author;

    @Column
    private String title;

    @Column
    private String isbn;
}
