package za.ac.cput.entity;

public class Security {
    private String loginUsername;
    private String loginPassword;

    private Security (Builder builder){

    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    @Override
    public String toString() {
        return "Security{" +
                "loginUsername='" + loginUsername + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }

    public static class Builder{
        private String loginUsername;
        private String loginPassword;

        public Builder setLoginUsername(String loginUsername){
            this.loginUsername = loginUsername;
            return this;
        }

        public Builder setLoginPassword(String loginPassword){
            this.loginPassword = loginPassword;
            return this;
        }

        public Builder copy(Security security) {
            this.loginUsername = security.loginUsername;
            this.loginPassword = security.loginPassword;
            return this;
        }

        public Security build(){
            return new Security(this);
        }
    }




}
