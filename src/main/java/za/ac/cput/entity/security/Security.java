package za.ac.cput.entity.security;

public class Security {
    private String securityId;
    private String loginUsername;
    private String loginPassword;

    private Security (Builder builder){
        this.securityId = builder.securityId;
        this.loginUsername = builder.loginUsername;
        this.loginPassword = builder.loginPassword;
    }

    public String getSecurityId() { return securityId; }

    public String getLoginUsername() {
        return loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    @Override
    public String toString() {
        return "Security{" +
                "securityId='" + securityId + '\'' +
                ", loginUsername='" + loginUsername + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }

    public static class Builder{
        private String securityId;
        private String loginUsername;
        private String loginPassword;

        public Builder setSecurityId(String securityId) {
            this.securityId = securityId;
            return this;
        }

        public Builder setLoginUsername(String loginUsername){
            this.loginUsername = loginUsername;
            return this;
        }

        public Builder setLoginPassword(String loginPassword){
            this.loginPassword = loginPassword;
            return this;
        }

        public Builder copy(Security security) {
            this.securityId = security.securityId;
            this.loginUsername = security.loginUsername;
            this.loginPassword = security.loginPassword;
            return this;
        }

        public Security build(){
            return new Security(this);
        }
    }




}
