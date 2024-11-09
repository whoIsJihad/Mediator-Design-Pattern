public class Light extends Component {
    private String location;

    public Light(Mediator mediator,String location){
        super(mediator);

        this.location=location;

    }
    public void turnOn(){
        System.out.println(location+ "Light is ON");
    }

    public void turnOff(){
        System.out.println(location +"light is Off");
    }
}
