package pl.akademiakodu.testquiz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.akademiakodu.testquiz.Test;

@Repository
public interface TestRepository extends CrudRepository<Test,Long> {

}
