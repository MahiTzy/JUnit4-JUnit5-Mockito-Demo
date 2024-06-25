package com.jnuit5.test.jnit5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.jnuit5.test.jnit5.dao.UserRepo;

// Annotate the test class to use the Mockito extension
@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    // Mock the UserRepo
    @Mock
    UserRepo userDao;

    // Inject the mocks into UserService
    @InjectMocks
    UserService userService;

    @Test
    public void testFindNameByID() {
        // Define behavior for the mock
        Mockito.when(userDao.findNameById(1)).thenReturn("Mohit");

        // Call the method to be tested
        String actual = userService.findName(1);
        String expected = "Mohit";

        // Verify the result
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testFindEmailByID() {
        // Define behavior for the mock
        Mockito.when(userDao.findEmailById(1)).thenReturn("ms@gmail.com");

        // Call the method to be tested
        String actual = userService.findEmail(1);
        String expected = "ms@gmail.com";

        // Verify the result
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSaveUser() {
        // Define behavior for the mock
        Mockito.when(userDao.createUser(Mockito.any())).thenReturn("Mohit");

        // Call the method to be tested
        String actual = userService.saveUser(Mockito.any());
        String expected = "Mohit";

        // Verify the result
        Assertions.assertEquals(expected, actual);
    }
}
