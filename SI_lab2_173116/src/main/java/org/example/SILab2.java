package org.example;

import java.util.List;

public class SILab2 {

    public static boolean function (User user, List<User> allUsers) {
        if (user==null || user.getPassword()==null || user.getEmail()==null){
            throw new RuntimeException("Mandatory information missing!");
        }

        if (user.getUsername()==null){
            user.setUsername(user.getEmail());
        }

        int same = 1;
        if (user.getEmail().contains("@") && user.getEmail().contains(".")) {
            same = 0;
            for (int i=0;i<allUsers.size();i++) {
                User existingUser = allUsers.get(i);
                if (existingUser.getEmail() == user.getEmail()) {
                    same += 1;
                }
                if (existingUser.getUsername() == user.getUsername()) {
                    same += 1;
                }
            }
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String password = user.getPassword();
        String passwordLower = password.toLowerCase();

        if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8) {
            return false;
        }
        else {
            if (!passwordLower.contains(" ")) {
                for (int i = 0; i < specialCharacters.length(); i++) {
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) {
                        return same == 0;
                    }
                }
            }
        }
        return false;
    }

}
