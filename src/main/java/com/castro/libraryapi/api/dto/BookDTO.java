package com.castro.libraryapi.api.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;

@Data // Cria os métodos getters e setters
@Builder // faz com q o lombok crie um builder para a classe adicionando o construtor com todas as propriedades em tempo de execução
@NoArgsConstructor // cria um construtor sem arqumentos
@AllArgsConstructor // cria um construtor com todos os argumentos
public class BookDTO {
    private Long id;

    @NotEmpty
    private String title;

    @NotEmpty
    private String author;

    @NotEmpty
    private String isbn;
}
