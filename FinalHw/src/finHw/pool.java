package finHw;

public class pool implements size {
	
	private double length, width, height;
 public pool(double l,double w, double h){
	 this.length=l;
	 this.width=w;
	 this.height=h;
 }
 public double getPerimeter(){
 return 2*(length+width);}
 public double GetVolume(){
	 return this.length*this.width*this.height;
 }


}
