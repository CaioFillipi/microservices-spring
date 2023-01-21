package br.com.caio.microservices.loja.controller;

import br.com.caio.microservices.loja.dto.CompraDTO;
import br.com.caio.microservices.loja.service.CompraService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/loja")
public class CompraController {

    private final CompraService service;

    public CompraController(CompraService service) {
        this.service = service;
    }

    @PostMapping
    public void realizarCompra(@RequestBody CompraDTO compra){
        service.realizaCompra(compra);
    }
}
