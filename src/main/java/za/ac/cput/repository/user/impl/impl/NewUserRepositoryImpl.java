package za.ac.cput.repository.user.impl.impl;

import za.ac.cput.entity.user.NewUser;
import za.ac.cput.repository.user.impl.NewUserRepository;

import java.util.HashSet;
import java.util.Set;

public class NewUserRepositoryImpl implements NewUserRepository {



    private static NewUserRepository repository = null;
    private Set<NewUserRepository> newUserSet;

    private NewUserRepositoryImpl()
    {
        this.newUserSet = new HashSet<>();
    }

    public static NewUserRepository getRepository()
    {
        if(repository == null)
        {
            repository = new NewUserRepositoryImpl();
        }
        return repository;
    }

    @Override
    public Set<NewUser> getAll() {return this.newUserSet; }

    @Override
    public NewUser create(NewUser newUser)
    {
        this.newUserSet.add(newUser);
        return newUser;
    }

    @Override
    public NewUser read(String newUsername)
    {
        for(NewUser newUser : this.newUserSet)
        {
            if(newUser.getNewUsername().equalsIgnoreCase(newUsername))
            {
                return newUser;
            }
        }
        return null;
    }

    @Override
    public NewUser update(NewUser newUser)
    {
        boolean deleteNewUser = delete(newUser.getNewUsername());
        if(deleteNewUser)
        {
            this.newUserSet.add(newUser);
            return newUser;
        }
        return null;
    }

    @Override
    public boolean delete(String newUsername)
    {
        NewUser newUser = read(newUsername);
        if(newUser != null)
        {
            this.newUserSet.remove(newUser);
            return true;
        }
        return false;
    }

}
