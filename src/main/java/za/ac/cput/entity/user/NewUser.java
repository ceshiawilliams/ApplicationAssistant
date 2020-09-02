package za.ac.cput.entity.user;

public class NewUser {
    private String newUserId;
    private String newUserName;
    private String newUserEmail;
    private String newPassword;
    private String confirmEmail;
    private String confirmPassword;

    private NewUser (Builder builder){
        this.newUserId = builder.newUserId;
        this.newUserName = builder.newUserName;
        this.newUserEmail = builder.newUserEmail;
        this.newPassword = builder.newPassword;
        this.confirmEmail = builder.confirmEmail;
        this.confirmPassword = builder.confirmPassword;
    }

    public String getNewUserId() { return newUserId; }

    public String getNewUserName() {
        return newUserName;
    }

    public String getNewUserEmail() {
        return newUserEmail;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    @Override
    public String toString() {
        return "NewUser{" +
                "newUserId='" + newUserId + '\'' +
                ", newUserName='" + newUserName + '\'' +
                ", newUserEmail='" + newUserEmail + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", confirmEmail='" + confirmEmail + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }

    public static class Builder{
        private String newUserId;
        private String newUserName;
        private String newUserEmail;
        private String newPassword;
        private String confirmEmail;
        private String confirmPassword;

        public Builder setNewUserId(String newUserId) {
            this.newUserId = newUserId;
            return this;
        }

        public Builder setNewUserName(String newUserName){
            this.newUserName = newUserName;
            return this;
        }

        public Builder setNewUserEmail(String newUserEmail){
            this.newUserEmail = newUserEmail;
            return this;
        }

        public Builder setNewPassword(String newPassword){
            this.newPassword = newPassword;
            return this;
        }

        public Builder setConfirmEmail(String confirmEmail){
            this.confirmEmail = confirmEmail;
            return this;
        }

        public Builder setConfirmPassword(String confirmPassword){
            this.confirmPassword = confirmPassword;
            return this;
        }

        public Builder copy(NewUser newUser) {
            this.newUserId = newUser.newUserId;
            this.newUserName = newUser.newUserName;
            this.newUserEmail = newUser.newUserEmail;
            this.newPassword = newUser.newPassword;
            this.confirmEmail = newUser.confirmEmail;
            this.confirmPassword = newUser.confirmPassword;
            return this;
        }

        public NewUser build(){
            return new NewUser(this);
        }
    }
}
