package observations.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ObservationChart extends BaseEntity {

    @ManyToOne(cascade = {CascadeType.ALL})
    private Location location;

    @OneToMany(cascade = {CascadeType.ALL})
    List<ObservationSet> observationSets;
}
