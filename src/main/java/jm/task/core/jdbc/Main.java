package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Иван", "Иванов", (byte) 33);
        userService.saveUser("Сидор", "Сидоров", (byte) 35);
        userService.saveUser("Петр", "Петров", (byte) 43);
        userService.saveUser("Наталия", "Ростова", (byte) 23);

        userService.getAllUsers().stream().map(a -> a.toString()).forEach(System.out::println);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
