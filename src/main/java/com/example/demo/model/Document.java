package com.example.demo.model;

/**
 * document model
 * <p>
 * Copyright © 2024 xpc1024 All Rights Reserved
 **/
public class Document {
    /**
     * id
     */
    private Long id;
    /**
     * title
     */
    private String title;
    /**
     * content
     */
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
