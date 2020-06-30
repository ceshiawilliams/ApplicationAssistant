package za.ac.cput.entity;

import java.util.ArrayList;

public class Funding {
    private ArrayList<Funding> bursaryList = new ArrayList();

    private Funding (Builder builder){
        this.bursaryList = builder.bursaryList;
    }

    public ArrayList<Funding> getBursaryList() {
        return bursaryList;
    }

    @Override
    public String toString() {
        return "Funding{" +
                "bursaryList=" + bursaryList +
                '}';
    }

    public static class Builder {
        private ArrayList<Funding> bursaryList = new ArrayList();

        public Builder setBursaryList(ArrayList<Funding> bursaryList) {
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
