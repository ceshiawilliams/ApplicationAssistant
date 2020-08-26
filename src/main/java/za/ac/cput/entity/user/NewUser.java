package za.ac.cput.entity.user;

public class NewUser {
    private String newUsername;
    private String newUserEmail;
    private String newPassword;
    private String confirmEmail;
    private String confirmPassword;

    private NewUser (Builder builder){
        this.newUsername = builder.newUsername;
        this.newUserEmail = builder.newUserEmail;
        this.newPassword = builder.newPassword;
        this.confirmEmail = builder.confirmEmail;
        this.confirmPassword = builder.confirmPassword;
    }

    public String getNewUsername() {
        return newUsername;
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
                "newUsername='" + newUsername + '\'' +
                ", newUserEmail='" + newUserEmail + '\'' +
                ", newPassword='" + newPassword + '\'' +
                ", confirmEmail='" + confirmEmail + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }

    public static class Builder{
        private String newUsername;
        private String newUserEmail;
        private String newPassword;
        private String confirmEmail;
        private String confirmPassword;

        public Builder setNewUsername(String newUsername){
            this.newUsername = newUsername;
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
            this.newUsername = newUser.newUsername;
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
