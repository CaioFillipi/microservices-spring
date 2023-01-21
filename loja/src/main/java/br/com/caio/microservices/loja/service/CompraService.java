package br.com.caio.microservices.loja.service;

import br.com.caio.microservices.loja.dto.CompraDTO;
import br.com.caio.microservices.loja.dto.InfoFornecedorDTO;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompraService {

    private final RestTemplate client;

    public CompraService(RestTemplate client) {
        this.client = client;
    }

    public void realizaCompra(CompraDTO compra){

        ResponseEntity<InfoFornecedorDTO> resultRequest =
            client.exchange("http://fornecedor/api/v1/info/"+compra.getEndereco().getEstado(),
                HttpMethod.GET,null, InfoFornecedorDTO.class);

        System.out.println(resultRequest.getBody().getEndereco());

    }
}
