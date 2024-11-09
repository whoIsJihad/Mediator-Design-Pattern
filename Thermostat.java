public class Thermostat extends Component {
    public double temperature;
    public Thermostat(Mediator mediator){
        super(mediator);
    }
    public void setTemperature(double temperature){
        this.temperature=temperature;
        System.out.println("Thermostat set to "+temperature+" degrees");
        mediator.notify(this,"Temperature changed");
    }

    public double getTemperature(){
        return temperature;
    }
    

}
