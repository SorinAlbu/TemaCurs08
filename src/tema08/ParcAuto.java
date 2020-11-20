package tema08;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class ParcAuto {
    @Autowired
    private Masina auto;
    private Motocicleta moto;
    private Autocar bus;

    @Autowired
    public ParcAuto(Autocar bus) {
        this.bus = bus;
    }

    @Autowired
    public void setMoto(Motocicleta moto) {
        this.moto = moto;
    }
}
