package Tascom.DesafioTascomSpringCep.Interface;

import Tascom.DesafioTascomSpringCep.Model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//Interface para consumir a api desejada usando o Feign
@FeignClient(url= "https://viacep.com.br/ws/" , name = "viacep")
public interface CepService {

    @GetMapping("{cep}/json")
    Endereco buscaEnderecoPorCep(@PathVariable("cep") String cep);
}
