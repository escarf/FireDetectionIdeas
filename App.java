
public class App {
	private static DetectionModule detectionModule;
	private static GUIModule gui;
	private static AlertModule alertModule;
	private static APIAdapter apiAdapter;
	private static boolean quitProgram = false;
	 
	
	public static void main(String[] args) {		
		detectionModule = new DetectionModule();
		gui = new GUIModule();
		alertModule = new AlertModule();
		apiAdapter = new APIAdapter();
		
		
		gui.createGUI();
		
		while(!quitProgram) {	
			
			gui.showGUI();
			String userAction = gui.getLastUserAction();
				//there might be a better way to do this
			
			if(userAction.equals("train")) {
				
			}
		
			// ...
			
					
			//if timer.elapsedTime >= 300 000 
				//have adapter get image from API
				//resetTimer
		
		}
		
	}
	

}
