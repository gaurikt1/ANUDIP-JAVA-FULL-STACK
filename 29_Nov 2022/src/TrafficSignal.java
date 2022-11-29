enum TrafficSignal 
{
 GREEN(30),RED(60),ORANGE(5);
 int time;           
  TrafficSignal(int time){
	this.time=time;
  }
  int showTime() {
	 return time;
}
   public static void main(String[]args) {
	   for(TrafficSignal trafficsignal:TrafficSignal.values())
	   System.out.println(trafficsignal+""+trafficsignal.showTime());
   }
	   
	
}


