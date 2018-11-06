import java.util.ArrayList;
import java.util.HashMap;

public class HiddenLayer extends Layer{
	public HiddenLayer(int unitCount) {
		super(unitCount);
		this.layerUnits = new ArrayList<SigmoidUnit>();
		//layerUnits.add(new InputUnit()); //this works
		this.layerUnitWeights = new ArrayList<HashMap<Integer, Double>>();
	}
}
