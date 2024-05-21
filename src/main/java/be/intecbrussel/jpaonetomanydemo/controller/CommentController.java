package be.intecbrussel.jpaonetomanydemo.controller;


import be.intecbrussel.jpaonetomanydemo.exception.ResourceNotFoundException;
import be.intecbrussel.jpaonetomanydemo.model.Comment;
import be.intecbrussel.jpaonetomanydemo.model.Post;
import be.intecbrussel.jpaonetomanydemo.repository.CommentRepository;
import be.intecbrussel.jpaonetomanydemo.repository.PostRepository;
import be.intecbrussel.jpaonetomanydemo.service.CommentService;
import be.intecbrussel.jpaonetomanydemo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;

//
//@RestController
//public class CommentController {
//
//    @Autowired
//    private CommentRepository commentRepository;
//
//    @Autowired
//    private PostRepository postRepository;
//
//    @GetMapping("/posts/{postId}/comments")
//    public Page<Comment> getAllCommentsByPostId(@PathVariable (value = "postId") Long postId,
//                                                Pageable pageable) {
//        return commentRepository.findByPostId(postId, pageable);
//    }
//
//    @PostMapping("/posts/{postId}/comments")
//    public Comment createComment(@PathVariable (value = "postId") Long postId,
//                                 @Valid @RequestBody Comment comment) {
//        return postRepository.findById(postId).map(post -> {
//            comment.setPost(post);
//            return commentRepository.save(comment);
//        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
//    }
//
//    @PutMapping("/posts/{postId}/comments/{commentId}")
//    public Comment updateComment(@PathVariable (value = "postId") Long postId,
//                                 @PathVariable (value = "commentId") Long commentId,
//                                 @Valid @RequestBody Comment commentRequest) {
//        if(!postRepository.existsById(postId)) {
//            throw new ResourceNotFoundException("PostId " + postId + " not found");
//        }
//
//        return commentRepository.findById(commentId).map(comment -> {
//            comment.setText(commentRequest.getText());
//            return commentRepository.save(comment);
//        }).orElseThrow(() -> new ResourceNotFoundException("CommentId " + commentId + "not found"));
//    }
//
//    @DeleteMapping("/posts/{postId}/comments/{commentId}")
//    public ResponseEntity<?> deleteComment(@PathVariable (value = "postId") Long postId,
//                                           @PathVariable (value = "commentId") Long commentId) {
//        return commentRepository.findByIdAndPostId(commentId, postId).map(comment -> {
//           commentRepository.delete(comment);
//            return ResponseEntity.ok().build();
//        }).orElseThrow(() -> new ResourceNotFoundException("Comment not found with id " + commentId + " and postId " + postId));
//    }
//}
@RestController
public class CommentController {

    @Autowired
    private CommentService commentService; // Используем сервис для работы с комментариями

    @Autowired
    private PostService postService; // Используем сервис для работы с постами

    @GetMapping("/posts/{postId}/comments")
    public List<Comment> getAllCommentsByPostId(@PathVariable Long postId) {
        return commentService.getAll(postId); // Получаем все комментарии для поста с указанным ID с помощью сервиса
    }

    @PostMapping("/posts/{postId}/comments")
    public void createComment(@PathVariable Long postId, @RequestBody Comment comment) {
        Post post = postService.getPostById(postId); // Получаем пост по ID
        comment.setPost(post); // Устанавливаем пост для комментария
        commentService.save(comment); // Сохраняем новый комментарий с помощью сервиса
    }

    @PutMapping("/posts/{postId}/comments/{commentId}")
    public void updateComment(@PathVariable Long postId, @PathVariable Long commentId, @RequestBody Comment commentRequest) {
        Post post = postService.getPostById(postId); // Получаем пост по ID
        // Проверяем существование поста
        if (post == null) {
            throw new ResourceNotFoundException("PostId " + postId + " not found");
        }
        commentRequest.setId(commentId); // Устанавливаем ID комментария из пути запроса
        commentRequest.setPost(post); // Устанавливаем пост для комментария
        commentService.save(commentRequest); // Сохраняем обновленный комментарий с помощью сервиса
    }

    @DeleteMapping("/posts/{postId}/comments/{commentId}")
    public void deleteComment(@PathVariable Long postId, @PathVariable Long commentId) {
        commentService.deleteById(commentId); // Удаляем комментарий с указанным ID с помощью сервиса
    }
}