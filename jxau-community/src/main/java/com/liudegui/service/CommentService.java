package com.liudegui.service;

import com.liudegui.dao.ICommentDao;
import com.liudegui.entity.Comment;
import com.liudegui.utils.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CommentService {

    @Autowired
    ICommentDao commentDao;
    public void comment(String commentText, HttpServletRequest request){
        //获取是谁发布者&判断是个人账号还是集体账号
        String username = CookieUtil.getCookieValue(request, "username");
        //获取系统时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String localDate = df.format(new Date());
        //获取评论的内容

        //获取记录条数
        Integer i = commentDao.selCount();
        Integer pkCount=i+1;
        //封装为一个对象插入数据库
        Comment comment = new Comment();
        comment.setPostID("1");
        comment.setStudID(username);
        comment.setCommID(pkCount.toString());
        comment.setCommContent(commentText);
        comment.setCommDate(localDate);

        commentDao.insertComment(comment);
    }
}
