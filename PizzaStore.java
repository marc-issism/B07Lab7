public class PizzaStore extends Store {
	
	@Override
	public Food createFood() {
		return new Pizza();
	}
}
