package observations.service;

import observations.domain.ObservationChart;

import java.util.Collection;

public interface ObservationChartService {
    void save(ObservationChart emergencyObsChart);

    Collection<ObservationChart> getAllObservations();
}
