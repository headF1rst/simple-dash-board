package simple.board.article.service.response;

public record ArticleCreateResponse(
    String title,
    String content,
    Long writerId,
    Long boardId
) {

}
