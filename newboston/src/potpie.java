
public class potpie {
	private int month;
	private int day;
	private int year;
	
	public potpie(int m,int d, int y){
		month =m;
		day =d;
		year =y;
		System.out.printf("The constructor is %s\n", this.toString());
	}
	public String toString(){
		return String.format("%d/%d/%d",month,day,year);
	}
}