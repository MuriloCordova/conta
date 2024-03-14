package com.senai.conta.Service;

import com.senai.conta.Dtos.ContaDTO;
import com.senai.conta.Models.ContaModel;
import org.springframework.stereotype.Service;

@Service
public class ContaService {

    public boolean validarConta(ContaDTO conta, ContaModel contaBancaria){

        return contaBancaria.getContaNumero().equals(contaBancaria.getContaNumero());

    }

    public double deposito(ContaDTO conta,ContaModel contaBancaria ){
        double resultado;
       resultado = contaBancaria.getContaSaldo() + conta.getValor();

    return resultado;
    }

}
