package com.model;

public class User {
    private String username;
    private String password;
    private boolean vaiTro; //user (0) or admin (1)

    public User(String username, String password, boolean vaiTro) {
        this.username = username;
        this.password = password;
        this.vaiTro = vaiTro;
    }
   
    public User() {
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }
    
    
}
