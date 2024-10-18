package gardens;

import interfaces.GardenFactory;
import interfaces.Plant;
import plants.Astilbe;
import plants.Dicentrum;
import plants.Sedum;

public class AnnualGarden implements GardenFactory {

	@Override
	public Plant plantPusat() {
		return new Dicentrum();
	}

	@Override
	public Plant plantTepi() {
		return new Sedum();
	}

	@Override
	public Plant plantPojok() {
		return new Astilbe();
	}
	
	
	
}
