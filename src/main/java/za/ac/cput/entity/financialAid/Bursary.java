package za.ac.cput.entity.financialAid;

public class Bursary {
    private String bursaryName;
    private String bursaryRequirements;

    private Bursary(Builder builder){
        this.bursaryName = builder.bursaryName;
        this.bursaryRequirements = builder.bursaryRequirements;
    }

    public String getBursaryName() { return bursaryName;    }

    public String getBursaryRequirements() { return bursaryRequirements; }

    @Override
    public String toString(){
        return "Bursaries{" +
                "Bursary Name='" + bursaryName + '\'' +
                ", Bursary Requirements='" + bursaryRequirements + '\'' +
                '}';
    }

    public static class Builder{
        private String bursaryName;
        private String bursaryRequirements;

        public Builder setBursaryName(String bursaryName) {
            this.bursaryName = bursaryName;
            return this;
        }

        public Builder setBursaryRequirements(String bursaryRequirements) {
            this.bursaryRequirements = bursaryRequirements;
            return this;
        }

        public Builder copy(Bursary bursary) {
            this.bursaryName = bursary.bursaryName;
            this.bursaryRequirements = bursary.bursaryRequirements;
            return this;
        }

        public Bursary build(){
            return new Bursary(this);
        }

    }
}
