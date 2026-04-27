package br.com.fiap.gamesjpa.model;

import jakarta.persistence.*;

import java.time.LocalDate;


@Entity
@Table(name="tbl_games")
public class Game {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator= "TBL_GAMES_SEQ")
    @SequenceGenerator(
            name = "TBL_GAMES_SEQ",
            sequenceName = "TBL_GAMES_SEQ",
            allocationSize=1
    )
    private Long id;

    private String title;

    @Column(name="release_date")
    private LocalDate releaseDate;

    private Double price;
    private String developer;
    private Boolean finished;
    private String category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", Title: " + this.title + ", ReleaseDate: " + this.releaseDate;
    }
}
