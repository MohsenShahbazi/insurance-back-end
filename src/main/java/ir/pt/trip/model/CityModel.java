package ir.pt.trip.model;

import ir.pt.core.model.BaseModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class CityModel extends BaseModel implements Serializable {
    private String name;
}
