package moderna.api.cadastro.controller;

import moderna.api.cadastro.entidades.Cliente;
import moderna.api.cadastro.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping("/salvar")
    public void salvarCliente(@RequestBody Cliente cliente){
        clienteRepository.save(cliente);
    }

    @GetMapping("/buscar/{id}")
    public Optional<Cliente> buscarPorId(@PathVariable Long id){
        return clienteRepository.findById(id);
    }




}
