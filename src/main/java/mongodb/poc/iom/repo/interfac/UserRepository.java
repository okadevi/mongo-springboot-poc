package mongodb.poc.iom.repo.interfac;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import mongodb.poc.iom.model.User;


public interface UserRepository extends MongoRepository<User, String> {

}
