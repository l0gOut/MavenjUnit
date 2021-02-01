package ru.sapteh.model;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class UserTest {

    private User user1;
    private User user2;
    private User user3;

    private User userNotAdd;
    private User userNotAdd1;

    @Before
    public void setUsers(){
        user1 = new User("Натаха", 16, Sex.FEMALE);
        user2 = new User("Алёна", 20, Sex.FEMALE);
        user3 = new User("Олег", 30, Sex.MALE);

//        userNotAdd = new User("", 0, null);
//        userNotAdd1 = new User(null, 0, null);
    }

    @Test
    public void getAllUsers(){
        List<User> expected = User.getAllUsers();
        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);
        actual.add(user3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_NO_NULL() {
        List<User> expected = User.getAllUsers();
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUsers_MALE() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(user3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_MALE_NO_NULL() {
        List<User> expected = User.getAllUsers(Sex.MALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getAllUsers_FEMALE() {
        List<User> expected = User.getAllUsers(Sex.FEMALE);

        List<User> actual = new ArrayList<>();
        actual.add(user1);
        actual.add(user2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllUsers_FEMALE_NO_NULL() {
        List<User> expected = User.getAllUsers(Sex.FEMALE);
        Assert.assertNotNull(expected);
    }

    @Test
    public void getHowManyUsers() {
        int expected = User.getHowManyUsers();

        int actual = 3;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsers_MALE() {
        int expected = User.getHowManyUsers(Sex.MALE);

        int actual = 1;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHowManyUsers_FEMALE() {
        int expected = User.getHowManyUsers(Sex.FEMALE);

        int actual = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers() {
        int expected = User.getAllAgeUsers();

        int actual = 16 + 20 + 30;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers_MALE() {
        int expected = User.getAllAgeUsers(Sex.MALE);

        int actual = 30;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAllAgeUsers_FEMALE() {
        int expected = User.getAllAgeUsers(Sex.FEMALE);

        int actual = 16 + 20;
        Assert.assertEquals(expected, actual);
    }

//    @Test
//    public void newUser_EMPTY_NAME() {
//        for (User user : User.getAllUsers()){
//            if (user.getName() != null && user.getName().isEmpty()) {
//                Assert.fail("Попытка создания пользователя с пустым именем");
//            }
//        }
//    }
//
//    @Test
//    public void newUser_AGE_ZERO() {
//        for (User user : User.getAllUsers()) {
//            if (user.getAge() <= 0) {
//                Assert.fail("Попытка создания пользователя c не допустимым возрастом");
//            }
//        }
//    }
//
//    @Test
//    public void newUser_SEX_NO_NULL() {
//        for (User user : User.getAllUsers()) {
//            if (user.getSex() == null) {
//                Assert.fail("Попытка создания пользователя с указанием пола = null");
//            }
//        }
//    }

    @After
    public void clear(){
        User.allUsers.clear();
    }

}
