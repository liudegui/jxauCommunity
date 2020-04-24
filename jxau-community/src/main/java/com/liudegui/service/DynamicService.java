package com.liudegui.service;

import com.liudegui.dao.IDynamicDao;
import com.liudegui.entity.Post;
import com.liudegui.utils.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DynamicService {

    @Autowired
    IDynamicDao dynamicDao;
    public void publish(String content,HttpServletRequest request){
        //获取是谁发布者&判断是个人账号还是集体账号
        String username = CookieUtil.getCookieValue(request, "username");
        //获取系统时间
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String localDate = df.format(new Date());
        //获取记录条数
        Integer i = dynamicDao.selCount();
        Integer pkCount=i+1;
        //封装为一个对象插入数据库
        Post post = new Post();
        post.setStudID(username);
        post.setPostDate(localDate);
        post.setPostContent(content);
        post.setPostID(pkCount.toString());
        dynamicDao.insertPost(post);
    }
}
