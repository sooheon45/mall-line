package mall.line.domain;

import java.util.*;
import lombok.*;
import mall.line.domain.*;
import mall.line.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
}
