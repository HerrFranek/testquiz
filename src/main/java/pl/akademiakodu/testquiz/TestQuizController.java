package pl.akademiakodu.testquiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.akademiakodu.testquiz.repository.TestRepository;

@Controller
public class TestQuizController {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TestRepository testRepository;

    @GetMapping("/{id}")
    @ResponseBody
    public String sayHello(@PathVariable Long id) {
        return testMapper.mapToTestDto(testRepository.findById(id).get());
    }
}
