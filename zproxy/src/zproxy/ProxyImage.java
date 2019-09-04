package zproxy;

public class ProxyImage implements Image {
	 private RealImage realImage;
	   private String fileName;

	   public ProxyImage(String fileName){
	      this.fileName = fileName;
	   }

	   public void display(Image ri) {
	      if(realImage == null){
	         realImage = new RealImage(fileName);
	         realImage.display(realImage);
	      }
	      else
	      realImage.display(this);
	   }
	   

}
