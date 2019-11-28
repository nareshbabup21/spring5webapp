package guru.springframework.spring5webapp.model;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * created by naresh 11/28/2019
 */
@Entity
public class Publisher {

    public Publisher() {}
    private String name;
    private String address;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;



   public Publisher(String name, String address, Long Id)
    {
        this.name = name;
        this.address = address;
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}




