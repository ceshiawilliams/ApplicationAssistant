package za.ac.cput.entity.financialAid;

public class Funding {
    private String fundingName;
    private String fundingRequirements;

    private Funding(Builder builder){
        this.fundingName = builder.fundingName;
        this.fundingRequirements = builder.fundingRequirements;
    }

    public String getFundingName() { return fundingName;    }

    public String getFundingRequirements() { return fundingRequirements; }

    @Override
    public String toString() {
        return "Funding{" +
                "fundingName='" + fundingName + '\'' +
                ", fundingRequirements='" + fundingRequirements + '\'' +
                '}';
    }

    public static class Builder{
        private String fundingName;
        private String fundingRequirements;

        public Builder setFundingName(String fundingName) {
            this.fundingName = fundingName;
            return this;
        }

        public Builder setFundingRequirements(String fundingRequirements) {
            this.fundingRequirements = fundingRequirements;
            return this;
        }

        public Builder copy(Funding funding) {
            this.fundingName = funding.fundingName;
            this.fundingRequirements = funding.fundingRequirements;
            return this;
        }

        public Funding build(){
            return new Funding(this);
        }

    }
}
