package gardens;

import interfaces.GardenFactory;
import interfaces.Plant;
import plants.Anemone;
import plants.Aster;
import plants.Dianthus;

public class ParennialGarden implements GardenFactory {

	@Override
	public Plant plantPusat() {
		return new Anemone();
	}

	@Override
	public Plant plantTepi() {
		return new Dianthus();
	}

	@Override
	public Plant plantPojok() {
		return new Aster();
	}

}
