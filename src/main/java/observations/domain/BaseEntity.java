package observations.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity extends Auditable {

    @Id
    @GeneratedValue
    private Long id;

}
