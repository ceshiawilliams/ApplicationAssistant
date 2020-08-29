package za.ac.cput.factory.user;

import za.ac.cput.entity.user.NewUser;

public class NewUserFactory {

    public static NewUser createNewUser(String newUsername, String newUserEmail, String newPassword, String confirmEmail, String confirmPassword) {
        NewUser registration = new NewUser.Builder()
                .setNewUsername(newUsername)
                .setNewUserEmail(newUserEmail)
                .setNewPassword(newPassword)
                .setConfirmEmail(confirmEmail)
                .setConfirmPassword(confirmPassword)
                .build();
        return registration;
    }
}
