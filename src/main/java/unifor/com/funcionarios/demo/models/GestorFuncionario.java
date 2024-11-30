package unifor.com.funcionarios.demo.models;

import java.util.ArrayList;
import org.springframework.stereotype.Component;


@Component
public class GestorFuncionario {
    private ArrayList<Funcionario> funcionarios;

     /**
     * Este contrutor foi feito com a ajuda de @author gpt
     */
    public GestorFuncionario() {
        this.funcionarios = new ArrayList<Funcionario>();

        funcionarios.add(new Funcionario(1, "João Silva", "987654321", "Rua das Flores, 123", "Professor", 4000.00));
        funcionarios.add(new Funcionario(2, "Maria Oliveira", "986543210", "Avenida Central, 456", "Professor", 4200.00));
        funcionarios.add(new Funcionario(3, "Carlos Souza", "985432109", "Travessa das Palmeiras, 789", "Professor", 4100.00));
        funcionarios.add(new Funcionario(4, "Ana Lima", "984321098", "Praça da Liberdade, 12", "Professor", 4300.00));
        funcionarios.add(new Funcionario(5, "Pedro Santos", "983210987", "Estrada Velha, 321", "Professor", 4050.00));
        funcionarios.add(new Funcionario(6, "Cláudia Mendes", "982109876", "Rua do Sol, 45", "Recepcionista", 2500.00));
        funcionarios.add(new Funcionario(7, "Roberto Almeida", "981098765", "Avenida Brasil, 67", "Coordenador", 5000.00));
        funcionarios.add(new Funcionario(8, "Fernanda Costa", "980987654", "Rua das Árvores, 89", "Coordenador", 5200.00));
        funcionarios.add(new Funcionario(9, "Rafael Pereira", "979876543", "Alameda das Rosas, 101", "Coordenador", 5100.00));
        funcionarios.add(new Funcionario(10, "Juliana Carvalho", "978765432", "Rua das Magnólias, 202", "Diretor", 8000.00));

        
    }

    public Funcionario pegarPorId(int id){
        for(Funcionario funcionario : funcionarios)
            if (funcionario.getId() == id) return funcionario;
            
        return null;
    }

    public ArrayList<Funcionario> pegarTodos(){
        return funcionarios;
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(int id){
        funcionarios.remove(pegarPorId(id));
    }

    public void editarTelefone(int id, String telefone){
        for(Funcionario funcionario : funcionarios)
            if (funcionario.getId() == id) funcionario.setTelefone(telefone);
        
    }

    public void editarSalario(int id, double salario){
        for(Funcionario funcionario : funcionarios)
            if (funcionario.getId() == id) funcionario.setSalario(salario);
    }

}
