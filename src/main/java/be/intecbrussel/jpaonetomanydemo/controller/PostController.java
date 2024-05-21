package be.intecbrussel.jpaonetomanydemo.controller;

import be.intecbrussel.jpaonetomanydemo.exception.ResourceNotFoundException;
import be.intecbrussel.jpaonetomanydemo.model.Comment;
import be.intecbrussel.jpaonetomanydemo.model.Post;
import be.intecbrussel.jpaonetomanydemo.repository.PostRepository;
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
//public class PostController {
//
//    @Autowired
//    private PostRepository postRepository;
//
//    @GetMapping("/posts")
//    public Page<Post> getAllPosts(Pageable pageable) {
//        return postRepository.findAll(pageable);
//    }
//
//    @PostMapping("/posts")
//    public Post createPost(@Valid @RequestBody Post post) {
//        return postRepository.save(post);
//    }
//
//    @PutMapping("/posts/{postId}")
//    public Post updatePost(@PathVariable Long postId, @Valid @RequestBody Post postRequest) {
//        return postRepository.findById(postId).map(post -> {
//            post.setTitle(postRequest.getTitle());
//            post.setDescription(postRequest.getDescription());
//            post.setContent(postRequest.getContent());
//            return postRepository.save(post);
//        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
//    }
//
//
//    @DeleteMapping("/posts/{postId}")
//    public ResponseEntity<?> deletePost(@PathVariable Long postId) {
//        return postRepository.findById(postId).map(post -> {
//            postRepository.delete(post);
//            return ResponseEntity.ok().build();
//        }).orElseThrow(() -> new ResourceNotFoundException("PostId " + postId + " not found"));
//    }
//}
//
//
@RestController
public class PostController {

    @Autowired
    private PostService postService; // Используем сервис для работы с постами

    @GetMapping("/posts")
    public List<Post> getAllPosts() {
        return postService.getAllPosts(); // Получаем все посты с помощью сервиса
    }

    @PostMapping("/posts")
    public void createPost(@RequestBody Post post) {
        postService.savePost(post); // Сохраняем новый пост с помощью сервиса
    }

    @PutMapping("/posts/{postId}")
    public void updatePost(@PathVariable Long postId, @RequestBody Post postRequest) {
        postRequest.setId(postId); // Устанавливаем ID поста из пути запроса
        postService.savePost(postRequest); // Сохраняем обновленный пост с помощью сервиса
    }

    @DeleteMapping("/posts/{postId}")
    public void deletePost(@PathVariable Long postId) {
        postService.deletePostById(postId); // Удаляем пост с указанным ID с помощью сервиса
    }
}