public abstract class Component {
    public Mediator mediator;

    public Component(Mediator mediator) {
        this.mediator = mediator;
    }
    
}
