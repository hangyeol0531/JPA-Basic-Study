package hellpjpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class  Member {

    @Id @GeneratedValue()
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private Team team;

    //Period
    @Embedded
    private Period workPeriod;
    // Address
    @Embedded
    private Address homeAddress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "city",
                    column = @Column(name = "WORK_CITY")),
            @AttributeOverride(name = "street",
                    column = @Column(name = "WORK_STREET")),
            @AttributeOverride(name = "zipcode",
                    column = @Column(name = "WORK_ZIPCODE"))
    })
    private Address workAddress;
}
