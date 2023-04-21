package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//service class

@Service
public class UserServiceImpl implements UserService
{
    //fake user
    static List<User> list=new ArrayList<User>();
    static {
            list.add(new User(1111,"raj","3745765"));
            list.add(new User(1112,"Ajay","3453453"));
            list.add(new User(1113,"Ajit","912339353"));
       // System.out.println("static list>=="+list);
    }

    //Override method of UserService  interface
    @Override
    public User getuser(Long id) {
        System.out.println("list>==="+list);
        User u=null;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i).getId()==id)
            {
                System.out.println("list of [i]"+list.get(i));
                u=list.get(i);
            }
        }
        System.out.println("u in interface>==="+u);
        return u;
    }

    //service for get all the user
    public List<User> getAllUsers()
    {
        System.out.println("list of all user>==="+list);
        return list;
    }
}
