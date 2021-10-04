package com.example.blog.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comments")
public class Comment extends BaseClass{
    @Column(name = "content")
    private String content;
    @Column(name = "create_time")
    private String createTime;
    @ManyToOne
    private User author;
    @ManyToOne
    private postEntity post;

}
