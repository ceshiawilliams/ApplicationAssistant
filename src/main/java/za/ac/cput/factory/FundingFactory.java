package za.ac.cput.factory;

import za.ac.cput.entity.Bursaries;
import za.ac.cput.entity.Funding;
import java.util.ArrayList;

public class FundingFactory {

    public static Funding createFunding ( Bursaries bursary){

        ArrayList<Bursaries> bursaryList = new ArrayList<Bursaries>();

        bursaryList.add(bursary);

        return new Funding.Builder()
                .setBursaryList(bursaryList)
                .build();
    }
}


