package com.koguze.edc;

import javax.xml.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by koguze on 8/2/2016.
 */

@XmlRootElement(name = "operations")
public class Operations {



    private List<Operation> operations;

    public Operations()
    {
        operations = new ArrayList<Operation>();
    }


    @XmlElement(name = "operation")
    public List<Operation> getOperations() {
        return operations;
    }
    public void setOperations(List operation)
    {
        this.operations = operation;
    }
}
