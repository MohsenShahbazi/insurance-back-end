package ir.pt.trip.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by Ahangari on 08/01/2017.
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FilterModel implements Serializable {
    private Integer page;
    private Integer size;
    private Map<String, Object> filter;
}
