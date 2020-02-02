package pl.akademiakodu.testquiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionMapper {

    public QuestionDTO maptoQuestionDTO(Question question){
        QuestionDTO questionDTO = new QuestionDTO(question.getContent());
        questionDTO.setId(question.getId());

        List<Answer> answers = question.getAnswers();

        List<String> answersName = new ArrayList<>();

        for (int i = 0; i < answersName.size(); i++) {
            answersName.add(answers.get(i).getName());
        }

        List<String> answersName2 = answers.stream()
                .map(x -> x.getName())
                .collect(Collectors.toList());

        questionDTO.setOptions(answersName2);

        String correctAnswer = "";
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).isCorrect()){
                correctAnswer = answers.get(i).getName();
            }
        }

        questionDTO.setAnswer(correctAnswer);
        return questionDTO;
    }
}
