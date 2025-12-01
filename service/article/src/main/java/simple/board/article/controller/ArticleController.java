package simple.board.article.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import simple.board.article.service.ArticleService;
import simple.board.contract.api.ArticleApi;
import simple.board.contract.model.Article;
import simple.board.contract.model.ArticleListResponse;
import simple.board.contract.model.ArticleRequest;
import simple.board.contract.model.ArticleUpdateRequest;

@RestController
@RequiredArgsConstructor
public class ArticleController implements ArticleApi {

    private final ArticleService articleService;

    @Override
    @PostMapping("/articles")
    public ResponseEntity<Article> createArticle(ArticleRequest body) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteArticle(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Article> getArticleById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<ArticleListResponse> listArticles(Long boardId, Long writerId, Integer page, Integer size, String sort) {
        return null;
    }

    @Override
    public ResponseEntity<Article> updateArticle(Long id, ArticleUpdateRequest articleUpdateRequest) {
        return null;
    }
}
