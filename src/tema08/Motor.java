package tema08;

import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
public class Motor {
    private int putere;
    private String nume;
    private int nrCilindri;
}
