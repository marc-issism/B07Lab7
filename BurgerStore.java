public class BurgerStore extends Store{

	@Override
	public Food createFood() {
		return new Burger();
	}

}
