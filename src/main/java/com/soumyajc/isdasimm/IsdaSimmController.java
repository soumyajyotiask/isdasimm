package com.soumyajc.isdasimm;

import com.soumyajc.isdasimm.model.CrifRecord;
import com.soumyajc.isdasimm.model.ImResponse;
import com.soumyajc.isdasimm.model.RiskClass;
import com.soumyajc.isdasimm.model.Silo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IsdaSimmController {

    private static final String DEFAULT_PF_ID = "DefaultId";

    @GetMapping(value = "/crifExample",
            produces = "application/json"
    )
    public @ResponseBody List<CrifRecord> getCrifExample(){
        List<CrifRecord> crifRecords = new ArrayList<>(1);
        crifRecords.add(new CrifRecord(
                RiskClass.Notional,
                "qualifier",
                "bucket",
                "level1",
                "level2",
                10000.0,
                Silo.Rates,
                "testPortfolio",
                "testTrade",
                null
        ));
        return crifRecords;
    }
    @PostMapping(
            value = "/imCrif",
            consumes = "application/json",
            produces = "application/json"
    )
    public @ResponseBody
    ImResponse getImFromCrif(@RequestBody List<CrifRecord> crifs){

        String portfolioId = crifs.stream().findFirst() //.orElse(DEFAULT_PF_ID);
                    .get().getPortfolioId().orElse(DEFAULT_PF_ID);
        return new ImResponse(portfolioId, 100.0);
    }
}
