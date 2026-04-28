package br.com.fiap.gamesjpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_categories")
public class Category {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "TBL_CATEGORIES_SEQ"
    )
    @SequenceGenerator(
            name = "TBL_CATEGORIES_SEQ",
            sequenceName = "TBL_CATEGORIES_SEQ",
            allocationSize = 1
    )
    private Long id;

    @Column(name = "name_category")
    private String nameCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return nameCategory;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nameCategory = nameCategory;
    }
}