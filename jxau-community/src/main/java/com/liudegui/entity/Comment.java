package com.liudegui.entity;

import lombok.Data;

@Data
public class Comment {
    private String commID;
    private String studID;
    private String postID;
    private String commContent;
    private String commDate;
}
