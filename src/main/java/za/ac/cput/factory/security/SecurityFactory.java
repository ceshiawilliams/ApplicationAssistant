package za.ac.cput.factory.security;

import za.ac.cput.entity.security.Security;

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
