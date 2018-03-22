package observations.service.impl;

import observations.domain.ObservationChart;
import observations.repository.ObservationChartRepository;
import observations.service.ObservationChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ObservationChartServiceImpl implements ObservationChartService {

    @Autowired
    private ObservationChartRepository observationChartRepository;

    @Override
    public void save(ObservationChart emergencyObsChart) {
        observationChartRepository.save(emergencyObsChart);
    }

    @Override
    public Collection<ObservationChart> getAllObservations() {
        return (Collection<ObservationChart>) observationChartRepository.findAll();
    }
}
