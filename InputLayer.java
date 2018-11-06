import java.util.ArrayList;
import java.util.HashMap;

public class InputLayer extends Layer{
	
	//Note: this layer shouldn't actually have any weights
	//^see Layer.java
	
	public InputLayer(int layerCount) {
		super(layerCount);
		this.layerUnits = new ArrayList<SigmoidUnit>();
		this.layerUnitWeights = new ArrayList<HashMap<Integer, Double>>();
	}
}
