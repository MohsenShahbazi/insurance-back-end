package ir.pt.insurance.model;

import ir.pt.core.model.BaseModel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;

@Setter
@Getter
public class DocumentModel extends BaseModel implements Serializable {

    private String title;
    private String description;
    private boolean published;
}
