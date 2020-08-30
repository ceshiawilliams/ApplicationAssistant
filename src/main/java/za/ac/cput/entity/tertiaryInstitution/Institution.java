package za.ac.cput.entity.tertiaryInstitution;

public class Institution
{
    private String institutionName;
    private String institutionCode;

    private Institution (Builder builder){
        this.institutionCode = builder.institutionCode;
        this.institutionName = builder.institutionName;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    @Override
    public String toString() {
        return "Institution{" +
                "institutionName='" + institutionName + '\'' +
                ", institutionCode=" + institutionCode +
                '}';
    }

    public static class Builder {
        private String institutionName;
        private String institutionCode;

        public Builder setInstitutionName(String institutionName) {
            this.institutionName = institutionName;
            return this;
        }

        public Builder setInstitutionCode(String institutionCode) {
            this.institutionCode = institutionCode;
            return this;
        }

        public Builder copy(Institution institution) {
            this.institutionName = institution.institutionName;
            this.institutionCode = institution.institutionCode;
            return this;
        }

        public Institution build() {
            return new Institution(this);
        }
    }
}
