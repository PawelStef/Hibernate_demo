package javagda25;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student implements IBaseEntity{
    @Id
    //dodatkowa tabela "hibernate_sequence" - sztuczne identyfikatory
    //identity  - generuj identyfikator z bazy i pobierz go i przypisz do pola
    //sequences - pobierz id, przypisz do pola, zapisz obiekt
    //table     -
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;

    @Column( nullable = false)
    private String name;
    private boolean alive;
    private int age;
    private double average; //nulable - nie ma not null

    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<Grade> gradeList;



}
