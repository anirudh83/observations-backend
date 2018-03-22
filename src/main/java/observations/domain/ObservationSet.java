package observations.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ObservationSet extends BaseEntity {
    private String name;
    private String description;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<ObservationItem> observationItems;

    @OneToOne
    private Comment comment;
}
