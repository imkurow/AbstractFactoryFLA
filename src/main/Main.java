package main;

import gardens.VegieGarden;
import interfaces.Plant;

public class Main {

	public Main() {
		VegieGarden vegieGarden = new VegieGarden();
		Plant broccoli = vegieGarden.plantPusat();
		broccoli.grow();
		
		
//		The others logic.....
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
