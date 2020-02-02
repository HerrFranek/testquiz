package pl.akademiakodu.testquiz;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class QuestionDTO {

    private Long id;
    List<String> options = new ArrayList<>();
    String answer;

    public QuestionDTO(String content) {

    }
}
