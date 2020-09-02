package za.ac.cput.factory.user;

import za.ac.cput.entity.user.NewUser;
import za.ac.cput.util.GenericHelper;
import za.ac.cput.util.StringHelper;

public class NewUserFactory {

    public static NewUser createNewUser(String newUserName, String newUserEmail, String newPassword, String confirmEmail, String confirmPassword) {
        if (StringHelper.isNullorEmpty(newUserName)) return new NewUser.Builder().build();
        if (StringHelper.isNullorEmpty(newPassword)) return new NewUser.Builder().build();
        if (StringHelper.isNullorEmpty(confirmEmail)) return new NewUser.Builder().build();
        if (StringHelper.isNullorEmpty(confirmPassword)) return new NewUser.Builder().build();
        String newUserId = GenericHelper.generateRandom();
        NewUser registration = new NewUser.Builder()
                .setNewUserId(newUserId)
                .setNewUserName(newUserName)
                .setNewUserEmail(newUserEmail)
                .setNewPassword(newPassword)
                .setConfirmEmail(confirmEmail)
                .setConfirmPassword(confirmPassword)
                .build();
        return registration;
    }
}
