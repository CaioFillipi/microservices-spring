package br.com.caio.microservices.fornecedor.controller;

import br.com.caio.microservices.fornecedor.service.InfoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/info")
public class InfoController {

    private final InfoService service;

    public InfoController(InfoService service) {
        this.service = service;
    }

    @GetMapping
    @RequestMapping(value = "/{estado}")
    public ResponseEntity getInfoPorEstado(@PathVariable("estado") String estado){
        return ResponseEntity.ok(service.getInfoEstado(estado.toUpperCase()));
    }
}
