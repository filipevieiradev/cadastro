package moderna.api.cadastro.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "api-cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
  @Column(nullable = false)
    private String razaoSocial;
  @Column(nullable = false, length = 15)
    private String cnpj;
    private String nomeSocio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeSocio() {
        return nomeSocio;
    }

    public void setNomeSocio(String nomeSocio) {
        this.nomeSocio = nomeSocio;
    }
}
