package observations.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Location extends BaseEntity {
    private String name;
}
