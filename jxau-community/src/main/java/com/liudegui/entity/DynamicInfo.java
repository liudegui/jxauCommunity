package com.liudegui.entity;

import lombok.Data;
import java.util.List;

@Data
public class DynamicInfo {
    private String studName;
    private String postID;
    private String PostDate;
    private String PostContent;
    private List<Comment> comment;
}
