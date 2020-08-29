package za.ac.cput.entity.financialAid;

import java.util.ArrayList;

public class Funding {
    private ArrayList<Bursary> bursaryList = new ArrayList();

    private Funding (Builder builder){
        this.bursaryList = builder.bursaryList;
    }

    public ArrayList<Bursary> getBursaryList() {
        return bursaryList;
    }

    @Override
    public String toString() {
        return "Funding{" +
                "bursaryList=" + bursaryList +
                '}';
    }

    public static class Builder {
        private ArrayList<Bursary> bursaryList = new ArrayList();

        public Builder setBursaryList(ArrayList<Bursary> bursaryList) {
            this.bursaryList = bursaryList;
            return this;
        }

        public Builder copy(Funding funding) {
            this.bursaryList = funding.bursaryList;
            return this;
        }

        public Funding build() {
            return new Funding(this);
        }
    }
}
