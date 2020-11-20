package tema08;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Autocar implements  IAutomobil {
    private Motor motor;

    @Autowired
    public Autocar(Motor motor) {
        this.motor = motor;
    }

    @Override
    public void travel() {
        System.out.println("travel with bus");
    }

    @Override
    public void maxDrivingSpeed() {
        System.out.println("90km/h");
    }
}
