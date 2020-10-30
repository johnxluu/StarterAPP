package csulb.cecs323.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AcademiProgram {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String code;
    private String name;
    private String degree;
    private int unitRequired;
    private int yearsCreated;

    private String getCode(){ return code;  }

    public void setCode(String code){ this.code = code; }

    private String getName(){ return name;  }

    public void setName(String name){ this.name = name; }

    private String getDegree(){ return degree;  }

    public void setDegree(String degree){ this.degree = degree; }

    private int getUnitRequired(){ return unitRequired;  }

    public void setUnitRequired(int unitRequired){ this.unitRequired = unitRequired; }

    private int getYearsCreated(){ return yearsCreated;  }

    public void setYearsCreated(int yearsCreated){ this.yearsCreated = yearsCreated; }
}
