package ir.pt.insurance.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FilterModel implements Serializable {
    private Integer page;
    private Integer size;
    private Map<String, Object> filter;
}
