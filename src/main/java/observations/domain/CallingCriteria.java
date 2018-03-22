package observations.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CallingCriteria extends BaseEntity {

    private String name;

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<ObservationRange> observationRanges;
}
