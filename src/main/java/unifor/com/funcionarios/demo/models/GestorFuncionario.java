package unifor.com.funcionarios.demo.models;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import unifor.com.funcionarios.demo.repository.FuncionarioRepository;


@Service
public class GestorFuncionario {
    
     @Autowired
    private FuncionarioRepository funcionarioRepository;

    public Funcionario pegarPorId(int id) {
        return funcionarioRepository.findById(id).orElse(null);
    }

    public List<Funcionario> pegarTodos() {
        return funcionarioRepository.findAll();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    public void removerFuncionario(int id) {
        funcionarioRepository.deleteById(id);
    }

    public void editarTelefone(int id, String telefone) {
        Funcionario funcionario = funcionarioRepository.findById(id).orElse(null);
        if (funcionario != null) {
            funcionario.setTelefone(telefone);
            funcionarioRepository.save(funcionario);
        }
    }

    public void editarSalario(int id, double salario) {
        Funcionario funcionario = funcionarioRepository.findById(id).orElse(null);
        if (funcionario != null) {
            funcionario.setSalario(salario);
            funcionarioRepository.save(funcionario);
        }
    }

}
