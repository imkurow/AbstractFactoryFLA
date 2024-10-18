package gardens;

import interfaces.GardenFactory;
import interfaces.Plant;
import plants.Broccoli;
import plants.Corn;
import plants.Peas;

public class VegieGarden implements GardenFactory {


	@Override
	public Plant plantPusat() {
		return new Broccoli();
	}

	@Override
	public Plant plantTepi() {
		return new Corn();
	}

	@Override
	public Plant plantPojok() {
		return new Peas();
	}

}
