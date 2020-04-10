package com.liudegui.dao;

import com.liudegui.entity.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentDao {
    Integer selCount();

    void insertComment(Comment comment);
}
