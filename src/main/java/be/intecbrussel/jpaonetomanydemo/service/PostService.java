package be.intecbrussel.jpaonetomanydemo.service;


import be.intecbrussel.jpaonetomanydemo.model.Post;

import java.util.List;
public interface PostService {
    List<Post> getAllPosts();

    void savePost(Post post);

    Post getPostById(Long id);

    void deletePostById(Long id);

}