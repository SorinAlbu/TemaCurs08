package tema08;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class ParcDezmembrari {
    private IAutomobil automobil;

    @Autowired
    @Qualifier("autocar")
    public void setAutomobil(IAutomobil automobil) {
        this.automobil = automobil;
    }
}
