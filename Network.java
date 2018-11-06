public class Network {	
	
	int inputDataFeatureCount = 4000000;
	int inputLayerUnitCount = 20;
	int hiddenLayerUnitCount = 20;
	int outputLayerUnitCount = 1;
	
	int hiddenLayerCount = 3;
	
	InputLayer inputLayer;
	HiddenLayer[] hiddenLayers;
	OutputLayer ouputLayer;
	
	
	public Network() {
		createNetwork();
	}
	
	void createNetwork(){
		inputLayer = new InputLayer(inputLayerUnitCount);
		
		hiddenLayers = new HiddenLayer[hiddenLayerCount];
		for(int i = 0; i < hiddenLayerCount; i++) {
			hiddenLayers[i] = new HiddenLayer(hiddenLayerUnitCount);
		}
		
		ouputLayer = new OutputLayer(outputLayerUnitCount);
	}
	void trainNetwork(String trainingDataFolderPath) {
		//actually should probably pass in 2 arrays of data
		//	^since 2 possible values for class label: fire or no fire
		//no processing of actual images should be done by this class
	}
	
	double[] output() {
		double[] result = new double[outputLayerUnitCount];		
		return result;
	}
	
}
