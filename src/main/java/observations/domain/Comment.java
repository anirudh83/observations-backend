package observations.domain;

import lombok.Builder;

import javax.persistence.Entity;

@Builder
@Entity
public class Comment extends BaseEntity {
    private String message;
}
