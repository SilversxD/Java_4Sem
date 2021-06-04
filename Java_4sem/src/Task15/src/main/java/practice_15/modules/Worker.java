package practice_15.modules;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "workers", schema = "public")
@Getter
@Setter
public class Worker {
    @Id
    @SequenceGenerator(name = "worker_seq", sequenceName = "worker_sequence", allocationSize = 1)
    @GeneratedValue(generator = "worker_seq", strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "middle_name")
    private String middleName;
    @ManyToOne
    @JsonIgnore
    private Manufacture manufacture;

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", manufacture=" + manufacture +
                '}';
    }
}
