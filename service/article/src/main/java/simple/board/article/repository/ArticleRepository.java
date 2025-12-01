package simple.board.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import simple.board.article.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
