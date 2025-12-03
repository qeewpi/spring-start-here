package services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
@Lazy
public class CommentService {

    public CommentService() {
        System.out.println("Comment service instance created!");
    }
}
