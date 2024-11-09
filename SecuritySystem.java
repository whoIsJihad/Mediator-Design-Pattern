public class SecuritySystem extends Component {
    private boolean armed;
    public SecuritySystem(Mediator mediator){
        super(mediator);
    }

    public void arm(){
        armed=true;
        System.out.println("System is armed");
        mediator.notify(this,"System armed");
    }

    public void disarm(){
        armed=false;
        System.out.println("System is disarmed");
        mediator.notify(this,"System disarmed");
    }

    public boolean isArmed(){
        return armed;
    }
}
