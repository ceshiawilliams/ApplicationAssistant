package za.ac.cput.factory;

import za.ac.cput.entity.Security;

public class SecurityFactory {

    public static Security createSecurity(String loginUsername, String loginPassword)
    {
        //A check will be added later to see if the entered password matches the account password.
        Security verification = new Security.Builder()
                .setLoginUsername(loginUsername)
                .setLoginPassword(loginPassword)
                .build();
        return verification;
    }

}
