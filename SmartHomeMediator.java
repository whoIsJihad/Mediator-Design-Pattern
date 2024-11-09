import java.time.LocalTime;

public class SmartHomeMediator implements Mediator{
    private Light livingRoomLight;
    private Light kitchenLight;
    private Thermostat thermostat;
    private SecuritySystem securitySystem;
    private CoffeeMaker coffeeMaker;
    private TV tv;

    public SmartHomeMediator(Light livingRoomLight, Light kitchenLight, Thermostat thermostat,
                             SecuritySystem securitySystem, CoffeeMaker coffeeMaker, TV tv) {
        this.livingRoomLight = livingRoomLight;
        this.kitchenLight = kitchenLight;
        this.thermostat = thermostat;
        this.securitySystem = securitySystem;
        this.coffeeMaker = coffeeMaker;
        this.tv = tv;
    }

    public void notify(Component sender,String event){
        if(sender instanceof SecuritySystem){
            if (event.equalsIgnoreCase("System armed")){
                livingRoomLight.turnOff();
                kitchenLight.turnOff();
                tv.turnOff();
            }
            else if(event.equalsIgnoreCase("System disarmed")){
                livingRoomLight.turnOn();
                kitchenLight.turnOn();
            }
        }

        if(sender instanceof Thermostat){
            if(thermostat.getTemperature()<18){
                System.out.println("Heating system is activated");
            }
            else {
                System.out.println("Heating system is deactivated");
            }
        }
        LocalTime currentTime=LocalTime.now();

        if(currentTime.getHour()==7 && event.equalsIgnoreCase("Temperature Changed")){
            coffeeMaker.brewCoffee();
            livingRoomLight.turnOn();
        }
    }
}


