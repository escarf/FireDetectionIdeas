import java.util.ArrayList;
import java.util.HashMap;

public class OutputLayer extends Layer {
	public OutputLayer(int unitCount) {
		super(unitCount);
		this.layerUnits = new ArrayList<SigmoidUnit>();
		this.layerUnitWeights = new ArrayList<HashMap<Integer, Double>>();
		
	}
}
