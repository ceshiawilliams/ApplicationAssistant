package za.ac.cput.controller.financialAid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.financialAid.Funding;
import za.ac.cput.factory.financialAid.FundingFactory;
import za.ac.cput.service.financialAid.impl.FundingServiceImpl;

import java.util.Set;


@RestController
@RequestMapping ("/funding")
public class FundingController {

    @Autowired
    private FundingServiceImpl fundingService;

    @PostMapping( "/create")
    public  Funding create (@RequestBody Funding funding){

        Funding newFunding =  FundingFactory.createFunding(funding.getFundingName(), funding.getFundingRequirements());

        return fundingService.create(newFunding);

    }

    @GetMapping ("/read/{s}")
    public Funding read (@PathVariable String s ){

        return fundingService.read(s) ;

    }

    @PostMapping("/update")
    public Funding update (@RequestBody Funding funding ){

        return fundingService.update(funding);
    }

    @GetMapping("/all")
    public Set<Funding> getAll(){
        return fundingService.getAll();
    }

    @DeleteMapping("/delete/{s}")
    public boolean delete (@PathVariable String s ){

        return  fundingService.delete(s);
    }


}


