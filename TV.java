public class TV extends Component{
    public TV(Mediator mediator){
        super(mediator);
    }

    public void turnOn(){
        System.out.println("TV is on");
    }
    public void turnOff(){
        System.out.println("TV is off");
    }
}
