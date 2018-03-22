package observations.controller;


import lombok.extern.slf4j.Slf4j;
import observations.domain.ObservationChart;
import observations.service.ObservationChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@Slf4j
public class ObservationChartConfigurationApi {

    @Autowired
    private ObservationChartService observationChartService;

    @GetMapping("/observationCharts")
    public Collection<ObservationChart> getDefaultObservationChart() {
        log.info("Fetching Observation Chart");
        return observationChartService.getAllObservations();
    }

    @PostMapping("/observationChart")
    public String createObservationChart(@RequestBody ObservationChart observationChart) {
        log.info("Creating Observation Chart with data  =[{}]", observationChart);
        observationChartService.save(observationChart);
        return "Observation Chart Saved Successfully";
    }

}
