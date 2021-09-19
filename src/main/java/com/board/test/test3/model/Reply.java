package com.board.test.test3.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne
    @JsonIgnoreProperties({"replys"})
    @JoinColumn(name = "boardId")
    private Board board;


    @ManyToOne
    @JsonIgnoreProperties({"password"})
    @JoinColumn(name="userId")
    private User user;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private int group;

    @Column(nullable = false)
    private int step;

    @Column(nullable = false)
    private int order;

    @Column(nullable = false)

   @CreationTimestamp
    private Timestamp createTime;

}
