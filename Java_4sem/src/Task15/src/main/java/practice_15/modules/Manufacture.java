package practice_15.modules;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manufactures", schema = "public")
@Getter
@Setter
public class Manufacture {
    @Id
    @SequenceGenerator(name = "worker_seq", sequenceName = "worker_sequence", allocationSize = 1)
    @GeneratedValue(generator = "worker_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @OneToMany(mappedBy = "manufacture")
    private List<Worker> workers;

    @Override
    public String toString() {
        return "Manufacture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", workers=" + workers +
                '}';
    }
}
