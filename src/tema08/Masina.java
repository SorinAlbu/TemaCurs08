package tema08;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Masina implements IAutomobil {
    @Autowired
    private Motor motor;

    @Override
    public void travel() {
        System.out.println("travel with car");
    }

    @Override
    public void maxDrivingSpeed() {
        System.out.println("180km/h");
    }
}
