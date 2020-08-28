package za.ac.cput.factory.financialAid;

import za.ac.cput.entity.financialAid.Bursary;
import za.ac.cput.entity.financialAid.Funding;
import java.util.ArrayList;

public class FundingFactory {

    public static Funding createFunding ( Bursary bursary){

        ArrayList<Bursary> bursaryList = new ArrayList<Bursary>();

        bursaryList.add(bursary);

        return new Funding.Builder()
                .setBursaryList(bursaryList)
                .build();
    }
}


