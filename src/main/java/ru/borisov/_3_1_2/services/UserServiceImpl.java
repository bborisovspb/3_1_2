package ru.borisov._3_1_2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.borisov._3_1_2.models.User;
import ru.borisov._3_1_2.repositories.UsersRepository;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<User> getAllUsers(){
        return usersRepository.findAll();
    }
    public User userInfo(int id){
        Optional<User> foundUser = usersRepository.findById(id);
        return foundUser.orElse(null);
    }
    public void saveUser(User user){
        usersRepository.save(user);
    }
    public void updateUser(User user){
        usersRepository.save(user);
    }
    public void deleteUser(int id) {
        usersRepository.deleteById(id);
    }

}
