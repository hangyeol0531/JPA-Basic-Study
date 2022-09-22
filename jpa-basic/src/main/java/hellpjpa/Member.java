package hellpjpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Member {
    @Id
    private Long id;
    private String name;

    public Member(){

    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
