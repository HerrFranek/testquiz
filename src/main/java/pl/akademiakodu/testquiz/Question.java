package pl.akademiakodu.testquiz;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Question extends EntityBase{
    private String name;

    @JoinColumn(name = "test_id")
    @ManyToOne
    private Test test;

    private String content;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answers = new ArrayList<>();

    public Question(String content){
        this.content = content;
    }
}
