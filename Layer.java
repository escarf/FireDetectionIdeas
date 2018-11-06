import java.util.ArrayList;
import java.util.HashMap;

public abstract class Layer {
	protected ArrayList<SigmoidUnit> layerUnits;
	protected ArrayList<HashMap<Integer, Double>> layerUnitWeights;
	protected int unitCount;
	protected int inputCount;
	
	//Note: the weights for Units in this layer are the weights that feed into
	// this layer. As such, the InputLayer won't use any weights.
	
	//How to get weight from j to i ?
	//How should weights be updated?
	
	
	public Layer(int unitCount) {
		this.unitCount = unitCount;
	}
}
