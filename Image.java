
public class Image {
	public String[] imageInfo;
	public int[] rgbPixelValues;
	
	public Image(String[] imageInfo, int[] rgbPixelValues) {
		this.imageInfo = imageInfo;
		this.rgbPixelValues = rgbPixelValues;
		
	}
	
	//put this somewhere else?
	public void fixResolution(int newWidth, int newheight) {
		
	}
}
