package simple.board.article.service.response;

import java.time.LocalDateTime;
import simple.board.article.entity.Article;

public record ArticleResponse(
    Long id,
    String title,
    String content,
    Long boardId,
    Long writerId,
    LocalDateTime createdAt,
    LocalDateTime updatedAt
) {

    public static ArticleResponse from(Article article) {
        return new ArticleResponse(
            article.getId(),
            article.getTitle(),
            article.getContent(),
            article.getBoardId(),
            article.getWriterId(),
            article.getCreatedAt(),
            article.getUpdatedAt()
        );
    }
}
