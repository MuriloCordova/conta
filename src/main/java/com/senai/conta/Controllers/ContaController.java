package com.senai.conta.Controllers;

import com.senai.conta.Dtos.*;
import com.senai.conta.Models.ContaModel;
import com.senai.conta.Service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conta")
public class ContaController {

    @Autowired
    ContaService contaService;

    private static ContaModel contaBancaria = new ContaModel();

    @PutMapping("/deposito")
    public ResponseEntity<RetornoDTO> deposito (@RequestBody ContaDTO dados){
        RetornoDTO resultado = new RetornoDTO();

        contaBancaria.setContaSaldo(contaService.deposito(dados,contaBancaria));
        resultado.setMensagem("Valor depositado com sucesso! Saldo: " + contaBancaria.getContaSaldo());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultado);
    }

    @PutMapping("/saque")
    public ResponseEntity<ContaDTO> saque (@RequestBody ContaDTO dados){
        ContaDTO resultado = new ContaDTO();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(resultado);
    }


}
