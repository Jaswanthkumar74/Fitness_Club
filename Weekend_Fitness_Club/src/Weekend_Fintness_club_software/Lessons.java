package Weekend_Fintness_club_software;

import java.util.ArrayList;
import java.util.List;

public class Lessons implements TimetablePrint {
	
	String lesson_day;
	String finess_type;
	String lesson_name;
	int price;
	String date;
	String time;
	
	@Override
	public void print(ArrayList<Lessons> al) {
		
		for (int i = 0; i < al.size(); i++) 
		{
			System.out.println(al.get(i).lesson_day+" || "+al.get(i).date+" || "+al.get(i).time+" || "+al.get(i).finess_type+" || "+al.get(i).lesson_name+" || "+"$"+al.get(i).price);
		}
	}

}
