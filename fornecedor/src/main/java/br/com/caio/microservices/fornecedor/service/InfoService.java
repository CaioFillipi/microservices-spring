package br.com.caio.microservices.fornecedor.service;

import br.com.caio.microservices.fornecedor.model.InfoFornecedor;
import br.com.caio.microservices.fornecedor.repository.InfoRepository;
import org.springframework.stereotype.Service;

@Service
public class InfoService {

    private final InfoRepository repository;

    public InfoService(InfoRepository repository) {
        this.repository = repository;
    }

    public InfoFornecedor getInfoEstado(String estado){
        return repository.findByEstado(estado);
    }
}
