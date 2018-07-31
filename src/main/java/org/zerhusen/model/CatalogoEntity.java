package org.zerhusen.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "catalogo", schema = "anapath", catalog = "jlganfornina")
public class CatalogoEntity {
    private Long id;
    private String valor;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "valor", nullable = true, length = -1)
    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CatalogoEntity that = (CatalogoEntity) o;
        return Objects.equals(id, that.id) &&
            Objects.equals(valor, that.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, valor);
    }
}
