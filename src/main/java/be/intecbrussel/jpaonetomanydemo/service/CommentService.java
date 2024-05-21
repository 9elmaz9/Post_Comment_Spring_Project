package be.intecbrussel.jpaonetomanydemo.service;


import be.intecbrussel.jpaonetomanydemo.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAll(Long postId);
    void save(Comment comment);
    Comment getById(Long id);
    void deleteById(Long id);
}