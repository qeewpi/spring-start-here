package services;

import org.springframework.stereotype.Service;
import repositories.CommentRepository;

@Service
public class CommentService {

    public CommentService() {
        System.out.println("Comment service instance created!");
    }
}
