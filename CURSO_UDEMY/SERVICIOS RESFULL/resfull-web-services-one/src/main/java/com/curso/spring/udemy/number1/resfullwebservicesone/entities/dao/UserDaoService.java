package com.curso.spring.udemy.number1.resfullwebservicesone.entities.dao;

import com.curso.spring.udemy.number1.resfullwebservicesone.entities.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int count = 5;
    static {
        users.add(new User(1, "Carlos", new Date()));
        users.add(new User(2, "Juan", new Date()));
        users.add(new User(3, "Pepe", new Date()));
        users.add(new User(4, "Jorge", new Date()));
        users.add(new User(5, "Laura", new Date()));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        if(user.getId()==null){
            user.setId(++count);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id){
        List<User> list = users.stream().filter(x -> x.getId()==id).collect(Collectors.toList());

        if(list.isEmpty()){
            return null;
        }

        return list.get(0);
    }

    public User deleteById(int id){

        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()){
            User user = iterator.next();
            if(user.getId()==id){
                iterator.remove();
                return user;
            }
        }

        return null;
    }

}
