package epsi.software.sakila.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
    @Table(name= "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long id;
    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDateTime getLastUpdate() {
        return LastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        LastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", LastUpdate=" + LastUpdate +
                '}';
    }

    @Column(name = "last_update")
    private LocalDateTime LastUpdate;
}
