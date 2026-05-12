import CoffeeDecorator.MilkDecorator;
import Concrete.Cappuccino;
import Interface.Coffee;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new Cappuccino();
        coffee = new MilkDecorator(coffee);
        System.out.println("Coffee description: " + coffee.getDescription());
        System.out.println("Total cost: " + coffee.getCost());
    }
}