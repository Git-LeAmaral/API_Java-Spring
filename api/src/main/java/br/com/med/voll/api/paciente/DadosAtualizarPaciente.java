package br.com.med.voll.api.paciente;

import br.com.med.voll.api.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarPaciente(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {

}
