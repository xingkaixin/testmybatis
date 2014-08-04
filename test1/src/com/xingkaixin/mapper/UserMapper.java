package com.xingkaixin.mapper;

import java.util.List;

import com.xingkaixin.model.User;

public interface UserMapper {
    
    public int insert(User user);
    
    public int update(User user);
    
    public int delete(String userName);
    
    public List<User> selectAll();
    
    public int countAll();
    
    public User findByUserName(String userName);
}