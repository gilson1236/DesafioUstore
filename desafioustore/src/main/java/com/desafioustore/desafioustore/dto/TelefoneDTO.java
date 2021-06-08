package com.desafioustore.desafioustore.dto;

import com.desafioustore.desafioustore.enums.TipoTelefone;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneDTO {

    private Long id;
    private TipoTelefone tipoTelefone;
    private String numero;
}
