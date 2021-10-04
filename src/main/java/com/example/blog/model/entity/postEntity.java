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
@Table(name = "posts")
public class postEntity extends BaseClass{
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "image_url")
    private String imgUrl;
    @ManyToOne()
    private User author;
    @Column(name = "description")
    private String description;
    @Column(name = "create_date")
    private String createDate;


}
