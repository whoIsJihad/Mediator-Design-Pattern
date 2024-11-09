public class SmartHomeDemo {
    public static void main(String[] args) {

        Light livingRoomLight=new Light(null,"Living Room");
        Light kitchenLight=new Light(null, "Kitchen");
        Thermostat thermostat=new Thermostat(null);
        SecuritySystem securitySystem=new SecuritySystem(null);
        CoffeeMaker coffeeMaker=new CoffeeMaker(null);

        TV tv=new TV(null);
        SmartHomeMediator mediator=new SmartHomeMediator(livingRoomLight, kitchenLight, thermostat, securitySystem, coffeeMaker, tv);
        livingRoomLight.mediator=mediator;
        kitchenLight.mediator=mediator;
        thermostat.mediator=mediator;
        tv.mediator=mediator;
        securitySystem.mediator=mediator;
        System.out.println("--Arming Security System--");
        securitySystem.arm();
        System.out.println("Setting thermostat to 17 degrees");
        thermostat.setTemperature(17);
        System.out.println("Disarming Security System");
        securitySystem.disarm();

        System.out.println("Setting thermostat to 19 degrees");
        thermostat.setTemperature(19);

        System.out.println("Simulating Morning Routine");
        
    }
}
