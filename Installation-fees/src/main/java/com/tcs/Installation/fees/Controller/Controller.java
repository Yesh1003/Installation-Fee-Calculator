package com.tcs.Installation.fees.Controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    private double installation_fee;

    @GetMapping("/installationfee")
    public void installationFee_calculator(@RequestParam int MSRP){

        installation_fee = MSRP*0.415;

        if(installation_fee < 1000){
            logger.info("The total installation fee is : " +1000);
        }else {
            logger.info("The total installation fee is : " +installation_fee);
        }

    }

}
