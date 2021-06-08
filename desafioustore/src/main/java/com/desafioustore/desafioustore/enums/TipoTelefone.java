package com.desafioustore.desafioustore.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TipoTelefone {

    CELULAR("celular"),
    FIXO("fixo"),
    COMERCIAL("comercial");

    private final String descricaoTipo;
}
