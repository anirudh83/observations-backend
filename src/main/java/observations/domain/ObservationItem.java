package observations.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ObservationItem extends BaseEntity {

    @OneToMany(cascade = {CascadeType.ALL})
    private Set<CallingCriteria> callingCriterias;

    @OneToOne
    private Comment comment;
}
