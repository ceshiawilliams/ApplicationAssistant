package za.ac.cput.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.entity.Funding;

import java.util.ArrayList;



public class FundingFactoryTest {


    private ArrayList<Funding> bursaryList;


    Funding funding = FundingFactory.getFunding(bursaryList);

    @Before
    public void setUp() {
    }

    @Test
    public void getFunding() {

        System.out.println(funding.toString());


    }
}