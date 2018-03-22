package observations.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import observations.domain.*;
import observations.util.Constants;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ObservationChartServiceTest {

    @Autowired
    private ObservationChartService observationChartService;

    @Test
    public void shouldBeAbleToAddAnObservationChart_ForLocationEmergencyDept() throws JsonProcessingException {
        ObservationChart emergencyObsChart = ObservationChart.builder()
                .location(Location.builder().name(Constants.ED).build())
                .observationSets(Arrays.asList(getObservationSet()))
                .build();

        observationChartService.save(emergencyObsChart);
        Assert.assertNotNull(observationChartService.getAllObservations());
    }

    private ObservationSet getObservationSet() {
        return ObservationSet.builder()
                .name(Constants.HEART_RATE)
                .description("test")
                .observationItems(Arrays.asList(
                        getObservationItem()))
                .build();
    }

    private ObservationItem getObservationItem() {
        Set<CallingCriteria> callingCriteriaSet = new HashSet<>();
        callingCriteriaSet.add(getCallingCriteria());
        return ObservationItem.builder()
                .callingCriterias(callingCriteriaSet).build();
    }

    private CallingCriteria getCallingCriteria() {
        Set<ObservationRange> observationRangeSet = new HashSet<>();
        observationRangeSet.add(getRange());
        return CallingCriteria.builder()
                .name(Constants.RED)
                .observationRanges(observationRangeSet)
                .build();
    }

    private ObservationRange getRange() {
        return ObservationRange.builder()
                .name(Constants.UPPER_BOUND_MAX)
                .value("120").build();
    }
}
