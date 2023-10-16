package moderna.api.cadastro.controller;

import moderna.api.cadastro.entidades.Produto;
import moderna.api.cadastro.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @PostMapping("/salvar")
    public void salvarProduto(@RequestBody Produto produto){

        Optional<Produto> produtoRetorno = produtoRepository.findByNumeroRegistro(produto.getNumeroRegistro());

        if(produtoRetorno.isEmpty()) {
            produtoRepository.save(produto);
        }else{
            System.out.println("Produto com o numero de registro existente");
        }
    }

    @GetMapping("/buscar/{id}")
    public Optional<Produto> buscarPorId(@PathVariable Long id){
        return produtoRepository.findById(id);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarPorId(@PathVariable Long id){
        produtoRepository.deleteById(id);
    }

    @GetMapping("/listar")
    public List<Produto> listarTodos(){
        return produtoRepository.findAll();
    }

}
