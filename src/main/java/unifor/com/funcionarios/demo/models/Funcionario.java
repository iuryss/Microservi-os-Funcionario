package unifor.com.funcionarios.demo.models;

import lombok.*;
import org.springframework.stereotype.Component;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Component
public class Funcionario {
    
    private int id;
    private String nome;
    private String telefone;
    private String endereço;
    private String profissao;
    private double salario;


}
