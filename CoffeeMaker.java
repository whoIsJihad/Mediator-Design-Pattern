// CoffeeMaker.java
public class CoffeeMaker extends Component {
    public CoffeeMaker(Mediator mediator) {
        super(mediator);
    }

    public void brewCoffee() {
        System.out.println("Coffee Maker is BREWING coffee.");
    }
}
