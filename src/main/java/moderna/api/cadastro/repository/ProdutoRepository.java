package moderna.api.cadastro.repository;

import moderna.api.cadastro.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    Optional<Produto> findByNumeroRegistro(String numeroRegistro);
}
