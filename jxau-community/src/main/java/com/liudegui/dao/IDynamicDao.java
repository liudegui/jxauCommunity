package com.liudegui.dao;

import com.liudegui.entity.Post;
import org.springframework.stereotype.Repository;

@Repository
public interface IDynamicDao {

    void insertPost(Post post);
    Integer selCount();
}
