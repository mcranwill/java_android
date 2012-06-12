
public class AppleJacks {
	public void simpleMessage(String name){
		System.out.println("Hello " + name);
	}
	private String girlName;
	private int hour;
	private int minute;
	private int second;
	
	
	public String toMilitary(){
		return String.format("%02d:%02d:%02d", getHour(),getMin(),getSec());
	}
	public void setName(String name){
		girlName=name;
	}
	public String getName(){
		return girlName;
	}
	public void saying(){
		System.out.printf("Your first girlfriend was %s\n", getName() );
	}
	public AppleJacks(String name){
		girlName=name;
	}
	//Constructors
	public AppleJacks(){
		this(0,0,0);
	}
	public AppleJacks(int h){
		this(h,0,0);
	}
	public AppleJacks(int h,int m){
		this(h,m,0);
	}
	public AppleJacks(int h,int m,int s){
		setHour(h);
		setMin(m);
		setSec(s);
	}
	private void setHour(int h){
		hour = ((h>=0 && h < 24) ? h : 0);
	}
	private void setMin(int m){
		minute = ((m>=0 && m < 60) ? m : 0);
	}
	private void setSec(int s){
		second = ((s>=0 && s<60) ? s : 0);
	}
	public int getHour(){
		return hour;
	}
	public int getMin(){
		return minute;
	}
	public int getSec(){
		return second;
	}
	/*public void setTime(int h,int m,int s){
		hour = ((h>=0 && h < 24) ? h : 0);
		minute = ((m>=0 && m < 60) ? m : 0);
		second = ((s>=0 && s<60) ? s : 0);
	}*/
}