package com.example.server.enumeration;

public enum Status {
    SERVER_UP("severUp"),
    SERVER_DOWN("severDown");

    private final String status;


    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
