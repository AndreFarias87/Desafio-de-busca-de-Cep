package Tascom.DesafioTascomSpringCep.Rest;

import Tascom.DesafioTascomSpringCep.Interface.CepService;
import Tascom.DesafioTascomSpringCep.Model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepRestService {

    @Autowired
    private CepService cepService;
//rota criada para consumir o cep
    @GetMapping("/cep={cep}")
    public ResponseEntity<Endereco> getCep(@PathVariable String cep) {

        Endereco endereco = cepService.buscaEnderecoPorCep(cep);

        return endereco != null ? ResponseEntity.ok().body(endereco) : ResponseEntity.notFound().build();
    }

}
