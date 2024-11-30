package unifor.com.funcionarios.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import unifor.com.funcionarios.demo.models.*;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    
    @Autowired
    private GestorFuncionario gestor;

    @GetMapping
    public List<Funcionario> getAll(){
        return gestor.pegarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable int id) {
        Funcionario funcionario = gestor.pegarPorId(id);
        if (funcionario == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(funcionario);
    }

    @PostMapping
    public void addFuncionario(@RequestBody Funcionario funcionario){
        gestor.adicionarFuncionario(funcionario);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        gestor.removerFuncionario(id);
    }

    @PutMapping("/telefone/{id}/{telefone}")
    public void editNumber(@PathVariable int id, @PathVariable String telefone){
        gestor.editarTelefone(id, telefone);
    }

    @PutMapping("/salario/{id}/{salario}")
    public void editSalary(@PathVariable int id, @PathVariable double    salario){
        gestor.editarSalario(id, salario);
    }

}
