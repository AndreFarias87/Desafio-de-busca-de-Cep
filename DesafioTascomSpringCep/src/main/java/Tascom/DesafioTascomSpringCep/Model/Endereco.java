package Tascom.DesafioTascomSpringCep.Model;

import lombok.Getter;
import lombok.Setter;
//Classe criada para receber o objeto.
@Getter
@Setter
public class Endereco {

    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ddd;


}
