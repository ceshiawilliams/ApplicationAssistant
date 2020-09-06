package za.ac.cput.service.user.impl;

import za.ac.cput.entity.user.User;
import za.ac.cput.repository.user.UserRepository;
import za.ac.cput.repository.user.impl.UserRepositoryImpl;
import za.ac.cput.service.user.UserService;

import java.util.HashSet;
import java.util.Set;

public class UserServiceImpl implements UserService {
    private static UserService service = null;
    private UserRepository repository;

    private UserServiceImpl()
    {
        this.repository = UserRepositoryImpl.getRepository();
    }

    public static UserService getService()
    {
        if(service == null)
        {
            service = new UserServiceImpl();
        }
        return service;
    }
    @Override
    public Set<User> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Set<User> getAllStartingWith(String letter) {
        Set<User> userSet = getAll();
        Set<User> usersStartingWith = new HashSet<>();
        for(User user : userSet){
            if(user.getUsername().trim().toLowerCase().startsWith(letter))
            {
                usersStartingWith.add(user);
            }
        }
        return usersStartingWith;
    }

    @Override
    public User create(User user)
    {
        return this.repository.create(user);
    }

    @Override
    public User read(String userId)
    {
        return this.repository.read(userId);
    }

    @Override
    public User update(User user)
    {
        return this.repository.update(user);
    }

    @Override
    public boolean delete(String userId)
    {
        return this.repository.delete(userId);
    }
}
