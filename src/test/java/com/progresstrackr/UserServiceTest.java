package com.progresstrackr;

import com.progresstrackr.repositories.UserRepository;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.util.UUID;

import com.progresstrackr.models.User;
import com.progresstrackr.services.UserService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserByUUID() {
        // Créez un utilisateur et enregistrez-le dans la base de données
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@example.com");
        user.setPassword("password");
        user.setStreak(0);
        userRepository.save(user);

        // Obtenez l'UUID de l'utilisateur
        UUID userId = user.getId();

        // Appelez la méthode getUserByUUID pour rechercher l'utilisateur
        User retrievedUser = userService.getUserByUUID(userId);

        // Vérifiez si l'utilisateur récupéré correspond à l'utilisateur enregistré
        assertNotNull(retrievedUser);
        assertEquals(user.getId(), retrievedUser.getId());
        assertEquals(user.getFirstName(), retrievedUser.getFirstName());
        assertEquals(user.getLastName(), retrievedUser.getLastName());
        assertEquals(user.getEmail(), retrievedUser.getEmail());
        assertEquals(user.getPassword(), retrievedUser.getPassword());
        assertEquals(user.getStreak(), retrievedUser.getStreak());
    }



}