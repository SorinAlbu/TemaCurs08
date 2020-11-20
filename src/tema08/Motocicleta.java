package tema08;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motocicleta implements IAutomobil {
    @Getter
    private Motor motor;

    @Override
    public void travel() {
        System.out.println("travel with bike");
    }

    @Override
    public void maxDrivingSpeed() {
        System.out.println("250km/h");
    }

    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
