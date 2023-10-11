package com.example.restservice.model;

public class Greeting {
    private final Long id;
    private String content;

    /**
     *
     * @param id
     * @param content
     */
    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
