package javagda25;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Grade implements IBaseEntity{
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private GradeSubject subject;
    @CreationTimestamp
    private LocalDateTime dateTime;
    private double value;

    @ToString.Exclude
    @ManyToOne()
    private Student student;



}
