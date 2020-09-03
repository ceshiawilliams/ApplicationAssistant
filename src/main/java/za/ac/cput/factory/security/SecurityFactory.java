package za.ac.cput.factory.security;

import za.ac.cput.entity.security.Security;
import za.ac.cput.util.GenericHelper;
import za.ac.cput.util.StringHelper;

public class SecurityFactory {

    public static Security createSecurity(String loginUsername, String loginPassword)
    {
        if (StringHelper.isNullorEmpty(loginUsername)) return new Security.Builder().build();
        if (StringHelper.isNullorEmpty(loginPassword)) return new Security.Builder().build();
        String securityId = GenericHelper.generateRandom();
        //A check will be added later to see if the entered password matches the account password.
        Security verification = new Security.Builder()
                .setSecurityId(securityId)
                .setLoginUsername(loginUsername)
                .setLoginPassword(loginPassword)
                .build();
        return verification;
    }

}
