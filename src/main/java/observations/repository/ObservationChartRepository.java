package observations.repository;

import observations.domain.ObservationChart;
import org.springframework.data.repository.CrudRepository;

public interface ObservationChartRepository extends CrudRepository<ObservationChart, Long> {
}
