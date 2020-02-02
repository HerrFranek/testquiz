package pl.akademiakodu.testquiz;


import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Test extends EntityBase {

    private String name;

    public Test(String name) {
        this.name = name;
    }

    private List<Question> questions = new ArrayList<>();
}
