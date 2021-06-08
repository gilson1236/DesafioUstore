package com.desafioustore.desafioustore.entities;

import com.desafioustore.desafioustore.enums.TipoTelefone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Telefone {
    private Long id;
    private TipoTelefone tipo;
    private String numero;
}
