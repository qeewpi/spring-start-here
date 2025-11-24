package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

/* Because we don’t use stereotype
annotations, we no longer need to use
the @ComponentScan annotation. */
@Configuration
public class ProjectConfig {

    // We create a bean for each of the two dependencies
    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public CommentNotificationProxy commentNotificationProxy() {
        return new EmailCommentNotificationProxy();
    }

    /* We use parameters of the @Bean method (which are now defined with
    the interface type) to instruct Spring to provide references for beans
    from its context, compatible with the type of the parameters. */
    @Bean
    public CommentService commentService(CommentRepository commentRepository,
                                         CommentNotificationProxy commentNotificationProxy) {
        return new CommentService(commentRepository, commentNotificationProxy);
    }
}
