package com.example.springbootwebsocket.model;

public class UserResponse {
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String content;
    public UserResponse() {}

    public UserResponse(String content) {
        this.content = content;
    }
}
