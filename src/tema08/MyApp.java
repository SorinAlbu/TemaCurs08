package tema08;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ParcAuto parcAuto = context.getBean("parcAuto", ParcAuto.class);

        // Before manually setting
        parcAuto.getMoto().travel();
        parcAuto.getMoto().maxDrivingSpeed();
        System.out.println("motor moto before: " + parcAuto.getMoto().getMotor());
        parcAuto.getBus().travel();
        parcAuto.getBus().maxDrivingSpeed();
        System.out.println("motor autocar before: " + parcAuto.getBus().getMotor());
        parcAuto.getAuto().travel();
        parcAuto.getAuto().maxDrivingSpeed();
        System.out.println("motor auto before: " + parcAuto.getAuto().getMotor());

        Motor motor = context.getBean("motor", Motor.class);
        motor.setNrCilindri(1);
        motor.setNume("BMW");
        motor.setPutere(57);
        parcAuto.getMoto().setMotor(motor);

        System.out.println("---Manually inserting Motor beans---");
        System.out.println("motor moto after: " + parcAuto.getMoto().getMotor());
        //System.out.println("nrCilindri: " + parcAuto.getMoto().getMotor().getNrCilindri());
        //System.out.println("Nume: " + parcAuto.getMoto().getMotor().getNume());
        //System.out.println("Putere: " + parcAuto.getMoto().getMotor().getPutere());

        Motor motor1 = context.getBean("motor", Motor.class);
        motor1.setNrCilindri(8);
        motor1.setNume("Otokar");
        motor1.setPutere(150);
        parcAuto.getBus().setMotor(motor1);

        System.out.println("motor autocar after: " + parcAuto.getBus().getMotor());

        Motor motor2 = context.getBean("motor", Motor.class);
        motor2.setNrCilindri(5);
        motor2.setNume("Skoda");
        motor2.setPutere(110);
        parcAuto.getAuto().setMotor(motor2);
        System.out.println("motor auto after: " + parcAuto.getAuto().getMotor());

        System.out.println("---Parc Dezmembrari---");
        ParcDezmembrari parcDezmembrari = context.getBean("parcDezmembrari", ParcDezmembrari.class);
        System.out.println(parcDezmembrari.getAutomobil().getClass());

        context.close();
    }
}
