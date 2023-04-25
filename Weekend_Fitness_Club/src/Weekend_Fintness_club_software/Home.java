package Weekend_Fintness_club_software;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Home {
	static ArrayList<User> al = new ArrayList<>();
	static ArrayList<Lessons> lessons = new ArrayList<>();
	static ArrayList<Booking> booking = new ArrayList<>();
	static ArrayList<Rating> rating = new ArrayList<>();
	static int tempload = 0;

	public static void main(String[] args) {
		tempload++;
//		================zumba saturday==========================
		if (tempload == 1) {

			Lessons ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "ZUMBA";
			ls.lesson_name = "Zumba Fitness";
			ls.price = 10;
			ls.date = "6-2-2023";
			ls.time = "6 AM To 8 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "ZUMBA";
			ls.lesson_name = "Zumba Toning";
			ls.price = 15;
			ls.date = "12-2-2023";
			ls.time = "8 AM To 10 AM";
			lessons.add(ls);
			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "ZUMBA";
			ls.lesson_name = "mambo";
			ls.price = 20;
			ls.date = "18-2-2023";
			ls.time = "8 AM To 10 AM";
			lessons.add(ls);
			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "ZUMBA";
			ls.lesson_name = "bellydance";
			ls.price = 25;
			ls.date = "22-3-2023";
			ls.time = "7 PM To 10 AM";
			lessons.add(ls);

//		========================== sanday ==============
			ls = new Lessons();
			ls.lesson_day = "sunday";
			ls.finess_type = "ZUMBA";
			ls.lesson_name = "Zumba in the Circuit";
			ls.price = 30;
			ls.date = "7-2-2023";
			ls.time = "6 AM To 8 AM";
			lessons.add(ls);
			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "ZUMBA";
			ls.lesson_name = "Zumba Gold";
			ls.price = 35;
			ls.date = "13-2-2023";
			ls.time = "10 AM To 11:30 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "ZUMBA";
			ls.lesson_name = "Zumba Toning";
			ls.price = 40;
			ls.date = "19-2-2023";
			ls.time = "7 AM To 9 AM";
			lessons.add(ls);

			ls = new Lessons();
			ls.lesson_day = "sunday";
			ls.finess_type = "ZUMBA";
			ls.lesson_name = "mambo";
			ls.price = 20;
			ls.date = "23-2-2023";
			ls.time = "7 AM To 9 AM";
			lessons.add(ls);

//		===================saturday spin ===================
			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "SPIN";
			ls.lesson_name = "Pilates";
			ls.price = 10;
			ls.date = "4-3-2023";
			ls.time = "7 PM To 9 PM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "SPIN";
			ls.lesson_name = "boxing";
			ls.price = 15;
			ls.date = "11-3-2023";
			ls.time = "9 AM To 10:30 AM";
			lessons.add(ls);

			ls = new Lessons();
			ls.lesson_day = "Saturday";
			ls.finess_type = "SPIN";
			ls.lesson_name = "barre";
			ls.price = 20;
			ls.date = "18-3-2023";
			ls.time = "10 AM To 1 PM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "SPIN";
			ls.lesson_name = "circuits";
			ls.price = 25;
			ls.date = "25-3-2023";
			ls.time = "6 AM To 8 PM";
			lessons.add(ls);

//		========== sunday spin=======================

			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "SPIN";
			ls.lesson_name = "boot camp";
			ls.price = 35;
			ls.date = "5-3-2023";
			ls.time = "9 AM To 10 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "SPIN";
			ls.lesson_name = "gaming";
			ls.price = 40;
			ls.date = "12-3-2023";
			ls.time = "10 AM To 11 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "SPIN";
			ls.lesson_name = "endurance";
			ls.price = 45;
			ls.date = "19-3-2023";
			ls.time = "8 PM To 10 PM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "SPIN";
			ls.lesson_name = "Incresing strength";
			ls.price = 50;
			ls.date = "26-3-2023";
			ls.time = "8 AM To 10 AM";
			lessons.add(ls);
//===================== saturday yoga========================
			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "YOGA";
			ls.lesson_name = "Vinyasa Yoga";
			ls.price = 10;
			ls.date = "2-4-2023";
			ls.time = "7 PM To 10 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "YOGA";
			ls.lesson_name = "Iyengar Yoga";
			ls.price = 15;
			ls.date = "9-4-2023";
			ls.time = "8 AM To 10 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "YOGA";
			ls.lesson_name = "Ashtanga Yoga";
			ls.price = 20;
			ls.date = "16-4-2023";
			ls.time = "7 PM To 10 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "YOGA";
			ls.lesson_name = "Kundalini Yoga";
			ls.price = 25;
			ls.date = "21-4-2023";
			ls.time = "9 AM To 10:30 AM";
			lessons.add(ls);
//==================== sunday yoga================

			ls = new Lessons();
			ls.lesson_day = "sunday";
			ls.finess_type = "YOGA";
			ls.lesson_name = "Hot Yoga";
			ls.price = 30;
			ls.date = "3-4-2023";
			ls.time = "10 AM To 1 PM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "YOGA";
			ls.lesson_name = "Yin Yoga";
			ls.price = 35;
			ls.date = "10-4-2023";
			ls.time = "6 AM To 8 PM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "YOGA";
			ls.lesson_name = "Restorative Yoga";
			ls.price = 40;
			ls.date = "17-4-2023";
			ls.time = "8 AM To 10 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "YOGA";
			ls.lesson_name = "Anti Gravity Yoga";
			ls.price = 45;
			ls.date = "24-4-2023";
			ls.time = "10 AM To 11:30 AM";
			lessons.add(ls);
//============= saturday BODYSCULPT ==============

			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "BODYSCULPT";
			ls.lesson_name = "body composition";
			ls.price = 10;
			ls.date = "8-5-2023";
			ls.time = "9 AM To 10 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "BODYSCULPT";
			ls.lesson_name = "flexibility";
			ls.price = 15;
			ls.date = "15-5-2023";
			ls.time = "7 AM To 9 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "BODYSCULPT";
			ls.lesson_name = "muscular strength";
			ls.price = 20;
			ls.date = "22-5-2023";
			ls.time = "7 PM To 9 PM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "Saturday";
			ls.finess_type = "BODYSCULPT";
			ls.lesson_name = "muscular endurance";
			ls.price = 25;
			ls.date = "29-5-2023";
			ls.time = "8 AM To 10 AM";
			lessons.add(ls);
//=========== sudnay bodysculpt ======================
			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "BODYSCULPT";
			ls.lesson_name = "cardiorespiratory endurance";
			ls.price = 30;
			ls.date = "9-5-2023";
			ls.time = "10 AM To 11 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "BODYSCULPT";
			ls.lesson_name = "Pushups";
			ls.price = 35;
			ls.date = "16-5-2023";
			ls.time = "8 PM To 10 PM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "BODYSCULPT";
			ls.lesson_name = "Crunches";
			ls.price = 40;
			ls.date = "23-5-2023";
			ls.time = "8 AM To 10 AM";
			lessons.add(ls);

			ls = new Lessons();

			ls.lesson_day = "sunday";
			ls.finess_type = "BODYSCULPT";
			ls.lesson_name = "Squats";
			ls.price = 45;
			ls.date = "30-5-2023";
			ls.time = "7 PM To 10 AM";
			lessons.add(ls);

			ls = new Lessons();
		}

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Press 1 for Sign up ");
			System.out.println("Press 2 for Sign in ");
			System.out.println("Press 3 for Exit");
			int check = 0;
			try {
				int temp = sc.nextInt();
				check = temp;
				sc.nextLine();
			} catch (Exception e) {
				System.out.println("Invalid, Please Enter Valid Input");
				main(args);
			}

			switch (check) {
			case 1:
				Signup(sc);
				break;
			case 2:
				Signin(sc);
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid, Please Enter Valid Input");
			}
		}
	}


	static String name = "";
	static String mobileno = "";

	private static void Signin(Scanner sc) {

		System.out.println("Enter mobile number :");
		String mobile = sc.nextLine();
		System.out.println("Enter password :");
		String password = sc.nextLine();
		int avaliable = 0;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i).mobileno.equalsIgnoreCase(mobile) && al.get(i).password.equalsIgnoreCase(password)) {
				avaliable = 1;
				mobileno = al.get(i).mobileno;
				name = al.get(i).fullname;
			}
		}
		if (avaliable != 0) {
			System.out.println("Welcome " + name);
			signinsuccess(sc);
		} else {
			System.out.println("Invalid mobile name and Password");
		}
	}

	private static void signinsuccess(Scanner sc) {

		while (true) {
			System.out.println("press 1 for Book Weekend Fitness Club");
			System.out.println("press 2 for show my Booking ");
			System.out.println("press 3 for Give rating");
			System.out.println("press 4 for Check All Report");
			System.out.println("press 5 for Cancel Booking");
			System.out.println("press 6 for Edit Booking");
			System.out.println("press 7 for show all timetable");
			System.out.println("press 8 for Log out");
			int check = 0;
			try {
				int temp = sc.nextInt();
				check = temp;
				sc.nextLine();
			} catch (Exception e) {
				check = 0;
				sc.nextLine();
			}
			int cnt = 0;
			switch (check) {
			case 1:
				booking(sc);
				System.out.println("================================================");
				break;
			case 2:
				showbooking(sc);
				break;
			case 3:
				rating(sc);
				System.out.println("==========Thanks for visiting=================");
				break;
			case 4:
				report(sc);
				System.out.println("================================================");
				break;
			case 5:
				cancelbooking(sc);
				System.out.println("================================================");
				break;
			case 6:
				editbooking(sc);
				System.out.println("================================================");
				break;
			case 7:
				showalltimetable();
				System.out.println("================================================");
				break;
			case 8:
				cnt = 1;
				break;
			default:
				System.out.println("Invalid, Please Enter Valid Input");
				System.out.println("================================================");
			}
			if (cnt == 1)
				break;
		}
	}

	private static void showalltimetable() {

		Lessons obj=new Lessons();
		obj.print(lessons);
	}

	private static void report(Scanner sc) {
		if (rating.size() != 0) {
			System.out.println("==================[ Welcome To Report Panel ] ==================");

			int Zumba_Circuit = 0, Zumba_Gold = 0, Zumba_Toning = 0, mambo = 0, boot_camp = 0, gaming = 0,
					endurance = 0, Incresing_strength = 0, Hot_Yoga = 0, Yin_Yoga = 0, Restorative_Yoga = 0,
					Anti_Gravity_Yoga = 0, cardiorespiratory_endurance = 0, Pushups = 0, Crunches = 0, Squats = 0,
					Zumba_Fitness = 0, bellydance = 0, Pilates = 0, boxing = 0, barre = 0, circuits = 0,
					Vinyasa_Yoga = 0, Iyengar_Yoga = 0, Ashtanga_Yoga = 0, Kundalini_Yoga = 0, body_composition = 0,
					flexibility = 0, muscular_strength = 0, muscular_endurance = 0;

			int Zumba_Circuit_rt = 0, Zumba_Gold_rt = 0, Zumba_Toning_rt = 0, mambo_rt = 0, boot_camp_rt = 0,
					gaming_rt = 0, endurance_rt = 0, Incresing_strength_rt = 0, Hot_Yoga_rt = 0, Yin_Yoga_rt = 0,
					Restorative_Yoga_rt = 0, Anti_Gravity_Yoga_rt = 0, cardiorespiratory_endurance_rt = 0,
					Pushups_rt = 0, Crunches_rt = 0, Squats_rt = 0, Zumba_Fitness_rt = 0, bellydance_rt = 0,
					Pilates_rt = 0, boxing_rt = 0, barre_rt = 0, circuits_rt = 0, Vinyasa_Yoga_rt = 0,
					Iyengar_Yoga_rt = 0, Ashtanga_Yoga_rt = 0, Kundalini_Yoga_rt = 0, body_composition_rt = 0,
					flexibility_rt = 0, muscular_strength_rt = 0, muscular_endurance_rt = 0;

			for (int i = 0; i < rating.size(); i++) {

				if (rating.get(i).lesson_name.equalsIgnoreCase("Zumba Fitness")) {
					Zumba_Fitness++;
					Zumba_Fitness_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Zumba Toning")) {
					Zumba_Toning++;
					Zumba_Toning_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("mambo")) {
					mambo++;
					mambo_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("bellydance")) {
					bellydance++;
					bellydance_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Pilates")) {
					Pilates++;
					Pilates_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("boxing")) {
					boxing++;
					boxing_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("barre")) {
					barre++;
					barre_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("circuits")) {
					circuits++;
					circuits_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Vinyasa Yoga")) {
					Vinyasa_Yoga++;
					Vinyasa_Yoga_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Iyengar Yoga")) {
					Iyengar_Yoga++;
					Iyengar_Yoga_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Ashtanga Yoga")) {
					Ashtanga_Yoga++;
					Ashtanga_Yoga_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Kundalini Yoga")) {
					Kundalini_Yoga++;
					Kundalini_Yoga_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("body composition")) {
					body_composition++;
					body_composition_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("flexibility")) {
					flexibility++;
					flexibility_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("muscular strength")) {
					muscular_strength++;
					muscular_strength_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("muscular endurance")) {
					muscular_endurance++;
					muscular_endurance_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Zumba in the Circuit")) {
					Zumba_Circuit++;
					Zumba_Circuit_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Zumba Gold")) {
					Zumba_Gold++;
					Zumba_Gold_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("boot camp")) {
					boot_camp++;
					boot_camp_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("gaming")) {
					gaming++;
					gaming_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("endurance")) {
					endurance++;
					endurance_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Incresing strength")) {
					Incresing_strength++;
					Incresing_strength_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Hot Yoga")) {
					Hot_Yoga++;
					Hot_Yoga_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Yin Yoga")) {
					Yin_Yoga++;
					Yin_Yoga += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Restorative Yoga")) {
					Restorative_Yoga++;
					Restorative_Yoga_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Anti Gravity Yoga")) {
					Anti_Gravity_Yoga++;
					Anti_Gravity_Yoga_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("cardiorespiratory endurance")) {
					cardiorespiratory_endurance++;
					cardiorespiratory_endurance_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Crunches")) {
					Crunches++;
					Crunches_rt += rating.get(i).lesson_rating;
				}
				if (rating.get(i).lesson_name.equalsIgnoreCase("Squats")) {
					Squats++;
					Squats_rt += rating.get(i).lesson_rating;
				}
			}

			Map<String, Integer> map = new LinkedHashMap<>();
			map.put("Zumba_Circuit", Zumba_Circuit * 30);
			map.put("Zumba_Gold", Zumba_Gold * 35);
			map.put("Zumba_Toning", Zumba_Toning * 40);
			map.put("mambo", mambo * 20);
			map.put("boot_camp", boot_camp * 35);
			map.put("gaming", gaming * 40);
			map.put("endurance", endurance * 45);
			map.put("Incresing_strength", Incresing_strength * 50);
			map.put("Hot_Yoga", Hot_Yoga * 30);
			map.put("Yin_Yoga", Yin_Yoga * 35);
			map.put("Restorative_Yoga", Restorative_Yoga * 40);
			map.put("Anti_Gravity_Yoga", Anti_Gravity_Yoga * 45);
			map.put("cardiorespiratory_endurance", cardiorespiratory_endurance * 30);
			map.put("Pushups", Pushups * 35);
			map.put("Crunches", Crunches * 40);
			map.put("Squats", Squats * 45);
			map.put("Zumba_Fitness", Zumba_Fitness * 10);
			map.put("bellydance", bellydance * 25);
			map.put("Pilates", Pilates * 10);
			map.put("boxing", boxing * 15);
			map.put("barre", barre * 20);
			map.put("circuits", circuits * 25);
			map.put("Vinyasa_Yoga", Vinyasa_Yoga * 10);
			map.put("muscular_endurance", muscular_endurance * 25);
			map.put("muscular_strength", muscular_strength * 20);
			map.put("flexibility", flexibility * 15);
			map.put("body_composition", body_composition * 10);
			map.put("Kundalini_Yoga", Kundalini_Yoga * 25);
			map.put("Ashtanga_Yoga", Ashtanga_Yoga * 20);
			map.put("Iyengar_Yoga", Iyengar_Yoga * 15);

			Set<String> set = map.keySet();
			int maxincome = 0;
			String max_income_lsname = "";
			for (String i : set) {
				if (map.get(i) > maxincome) {
					max_income_lsname = i;
					maxincome = map.get(i);
				}
			}

			System.out.println(
					"============[Number of Customer per lessons with Average rating Report ]=================");
			if (Zumba_Circuit != 0)
				System.out.println("Lesson Name = Zumba_Circuit  ||   No.Of Customers = " + Zumba_Circuit
						+ "       Average Rating = " + Zumba_Circuit_rt / Zumba_Circuit);
			if (Zumba_Gold != 0)
				System.out.println("Lesson Name = Zumba_Gold  ||   No.Of Customers = " + Zumba_Gold
						+ "       Average Rating = " + Zumba_Gold_rt / Zumba_Gold);
			if (Zumba_Toning != 0)
				System.out.println("Lesson Name = Zumba_Toning  ||   No.Of Customers = " + Zumba_Toning
						+ "       Average Rating = " + Zumba_Toning_rt / Zumba_Toning);
			if (mambo != 0)
				System.out.println("Lesson Name = mambo  ||   No.Of Customers = " + mambo + "       Average Rating = "
						+ mambo_rt / mambo);
			if (boot_camp != 0)
				System.out.println("Lesson Name = boot_camp  ||   No.Of Customers = " + boot_camp
						+ "       Average Rating = " + boot_camp_rt / boot_camp);
			if (gaming != 0)
				System.out.println("Lesson Name = gaming  ||   No.Of Customers = " + gaming + "       Average Rating = "
						+ gaming_rt / gaming);
			if (endurance != 0)
				System.out.println("Lesson Name = endurance  ||   No.Of Customers = " + endurance
						+ "       Average Rating = " + endurance_rt / endurance);
			if (Incresing_strength != 0)
				System.out.println("Lesson Name = Incresing_strength  ||   No.Of Customers = " + Incresing_strength
						+ "       Average Rating = " + Incresing_strength_rt / Incresing_strength);
			if (Hot_Yoga != 0)
				System.out.println("Lesson Name = Hot_Yoga  ||   No.Of Customers = " + Hot_Yoga
						+ "       Average Rating = " + Hot_Yoga_rt / Hot_Yoga);
			if (Yin_Yoga != 0)
				System.out.println("Lesson Name = Yin_Yoga  ||   No.Of Customers = " + Yin_Yoga
						+ "       Average Rating = " + Yin_Yoga_rt / Yin_Yoga);
			if (Restorative_Yoga != 0)
				System.out.println("Lesson Name = Restorative_Yoga  ||   No.Of Customers = " + Restorative_Yoga
						+ "       Average Rating = " + Restorative_Yoga_rt / Restorative_Yoga);
			if (Anti_Gravity_Yoga != 0)
				System.out.println("Lesson Name = Anti_Gravity_Yoga  ||   No.Of Customers = " + Anti_Gravity_Yoga
						+ "       Average Rating = " + Anti_Gravity_Yoga_rt / Anti_Gravity_Yoga);
			if (cardiorespiratory_endurance != 0)
				System.out.println("Lesson Name = cardiorespiratory_endurance  ||   No.Of Customers = "
						+ cardiorespiratory_endurance + "       Average Rating = "
						+ cardiorespiratory_endurance_rt / cardiorespiratory_endurance);
			if (Pushups != 0)
				System.out.println("Lesson Name = Pushups  ||   No.Of Customers = " + Pushups
						+ "       Average Rating = " + Pushups_rt / Pushups);
			if (Crunches != 0)
				System.out.println("Lesson Name = Crunches  ||   No.Of Customers = " + Crunches
						+ "       Average Rating = " + Crunches_rt / Crunches);
			if (Squats != 0)
				System.out.println("Lesson Name = Squats  ||   No.Of Customers = " + Squats + "       Average Rating = "
						+ Squats_rt / Squats);
			if (Zumba_Fitness != 0)
				System.out.println("Lesson Name = Zumba_Fitness  ||   No.Of Customers = " + Zumba_Fitness
						+ "       Average Rating = " + Zumba_Fitness_rt / Zumba_Fitness);
			if (bellydance != 0)
				System.out.println("Lesson Name = bellydance  ||   No.Of Customers = " + bellydance
						+ "       Average Rating = " + bellydance_rt / bellydance);
			if (Pilates != 0)
				System.out.println("Lesson Name = Pilates  ||   No.Of Customers = " + Pilates
						+ "       Average Rating = " + Pilates_rt / Pilates);
			if (boxing != 0)
				System.out.println("Lesson Name = boxing  ||   No.Of Customers = " + boxing + "     Average Rating = "
						+ boxing_rt / boxing);
			if (barre != 0)
				System.out.println("Lesson Name = barre  ||   No.Of Customers = " + barre + "      Average Rating = "
						+ barre_rt / barre);
			if (circuits != 0)
				System.out.println("Lesson Name = circuits  ||   No.Of Customers = " + circuits
						+ "       Average Rating = " + circuits_rt / circuits);
			if (Vinyasa_Yoga != 0)
				System.out.println("Lesson Name = Vinyasa_Yoga  ||   No.Of Customers = " + Vinyasa_Yoga
						+ "       Average Rating = " + Vinyasa_Yoga_rt / Vinyasa_Yoga);
			if (muscular_endurance != 0)
				System.out.println("Lesson Name = muscular_endurance  ||   No.Of Customers = " + muscular_endurance
						+ "       Average Rating = " + muscular_endurance_rt / muscular_endurance);
			if (muscular_strength != 0)
				System.out.println("Lesson Name = muscular_strength  ||   No.Of Customers = " + muscular_strength
						+ "       Average Rating = " + muscular_strength_rt / muscular_strength);
			if (flexibility != 0)
				System.out.println("Lesson Name = flexibility  ||   No.Of Customers = " + flexibility
						+ "       Average Rating = " + flexibility_rt / flexibility);
			if (body_composition != 0)
				System.out.println("Lesson Name = body_composition  ||   No.Of Customers = " + body_composition
						+ "       Average Rating = " + body_composition_rt / body_composition);
			if (Kundalini_Yoga != 0)
				System.out.println("Lesson Name = Kundalini_Yoga  ||   No.Of Customers = " + Kundalini_Yoga
						+ "       Average Rating = " + Kundalini_Yoga_rt / Kundalini_Yoga);
			if (Ashtanga_Yoga != 0)
				System.out.println("Lesson Name = Ashtanga_Yoga  ||   No.Of Customers = " + Ashtanga_Yoga
						+ "       Average Rating = " + Ashtanga_Yoga_rt / Ashtanga_Yoga);
			if (Iyengar_Yoga != 0)
				System.out.println("Lesson Name = Iyengar_Yoga  ||   No.Of Customers = " + Iyengar_Yoga
						+ "       Average Rating = " + Iyengar_Yoga_rt / Iyengar_Yoga);
			System.out.println();
			System.out.println("Remaining all Lessons contains Zero Customers and Zero average");
			System.out.println(
					"=============================[ Max Income generated lesson Name ]===================================");
			System.out.println("Lesson Name = " + max_income_lsname + "     Income = " + maxincome);
			System.out.println();
			System.out
					.println("======================================================================================");
			System.out
					.println("========================[List of lesson with Income]===================================");

			for (String i : set) {
				System.out.println("Lesson Name = " + i + "         Income = " + map.get(i));
			}
		} else {
			System.out.println("No any Report Avaliable");
		}
	}

	private static void editbooking(Scanner sc) {
		if (booking.size() != 0) {
			Map<Integer, Integer> map = new LinkedHashMap<>();
			System.out.println("================ [Welcome to Edit panel] =======================");
			showbooking(sc);
			System.out.println("Select from above booking any one booking which you want to give rating");
			System.out.println("Enter Booking Id :");
			try {
				int num = 0;
				int cnt = 0;
				int index = 0;
				int bkid = sc.nextInt();
				for (int i = 0; i < booking.size(); i++) {
					if (booking.get(i).bookid == bkid) {
						index = i;
						cnt++;
						System.out.println("Press " + ++num + " for " + "booking id = " + booking.get(i).bookid + " || "
								+ booking.get(i).lesson_day + " " + booking.get(i).finess_type + " "
								+ booking.get(i).lesson_name + " " + booking.get(i).date + " " + booking.get(i).time
								+ " --> " + booking.get(i).price + " Ruppes");
					}
				}
				if (cnt == 0) {
					System.out.println("Booking Not Found");
					editbooking(sc);
				} else {
					System.out.println("At this time You made Changes in Above Booking ");
					sc.nextLine();
					editobj(index, sc);
				}
			} catch (Exception e) {
				System.out.println("Booking Not Found");
				sc.nextLine();
				editbooking(sc);
			}
		} else {
			System.out.println("No any Booking Avaliable");
		}
	}

	private static void editobj(int index, Scanner sc) {
		System.out.println("================[ Update Your Booking ]======================");
		System.out.println("(Saturday sunday) || (SPIN YOGA BODYSCULPT ZUMBA)");
		System.out.println("Enter any One week Day OR Fitness Type :");
		Map<Integer, Integer> map = new LinkedHashMap<>();
		int num = 0;
		int cnt = 0;
		String tempname = sc.nextLine();
		for (int i = 0; i < lessons.size(); i++) {
			if (lessons.get(i).lesson_day.equalsIgnoreCase(tempname)
					|| lessons.get(i).finess_type.equalsIgnoreCase(tempname)) {
				cnt++;
				System.out.println("Press " + ++num + " for " + lessons.get(i).lesson_day + " "
						+ lessons.get(i).finess_type + " " + lessons.get(i).date + " " + lessons.get(i).time + " --> "
						+ lessons.get(i).price + " $");
				map.put(num, i);
			}
		}
		if (cnt == 0) {
			System.out.println("Invalid input, please enter valid");
			sc.nextLine();
			editobj(index, sc);
		} else {
			try {
				int valid = sc.nextInt();
				if (valid <= 0 || valid > num) {
					System.out.println("Invalid input");
					editobj(index, sc);
				} else {
					int lsindex = 0;
					Set<Integer> set = map.keySet();
					for (int i : set) {
						if (valid == i) {
							lsindex = map.get(i);
						}
					}
					Lessons obj = lessons.get(lsindex);

					int bkid = booking.get(index).bookid;
					Booking bk = new Booking();
					bk.customer_name = name;
					bk.bookid = bkid;
					bk.date = obj.date;
					bk.lesson_day = obj.lesson_day;
					bk.finess_type = obj.finess_type;
					bk.lesson_name = obj.lesson_name;
					bk.status = "Edited Booking";
					bk.mobileno = mobileno;
					bk.price = obj.price;
					bk.time = obj.time;
					booking.set(index, bk);
					System.out.println("Successfully Edit your Booking");
					System.out.println("Thanks for visiting");
				}
			} catch (Exception e) {
				System.out.println("Something Wrong");
				sc.nextLine();
				editobj(index, sc);
			}
		}
	}

	private static void cancelbooking(Scanner sc) {
		if (booking.size() != 0) {
			System.out.println("================= Cancel Booking panel ==================== ");
			showbooking(sc);
			System.out.println("Select from above booking any one booking which you want to Cancel");
			System.out.println("Enter Booking id : ");
			try {
				int bkid = sc.nextInt();
				Map<Integer, Integer> map = new LinkedHashMap<>();
				int num = 0;
				int cnt = 0;
				int cancelvalid=0;
				for (int i = 0; i < booking.size(); i++) {

					if (booking.get(i).bookid == bkid && booking.get(i).customer_name.equals(name)) {
						cnt++;
						System.out.println("press " + ++num + " for this Cancel --> " + booking.get(i).lesson_day + " "
								+ booking.get(i).finess_type + " " + booking.get(i).lesson_name + " "
								+ booking.get(i).date + " " + booking.get(i).time + " " + booking.get(i).price + " $");
					
						if (booking.get(i).customer_name.equalsIgnoreCase(name) && booking.get(i).bookid == bkid
								&& booking.get(i).status.equalsIgnoreCase("Cancelled Booking")) {
							cancelvalid++;
						}
						
						map.put(num, i);
					}
				}
				if(cancelvalid==0)
				{
				if (cnt == 0) {
					System.out.println("NO any booking avaliable");
				} else {

					try {
						int valid = sc.nextInt();
						if (valid <= 0 || valid > num) {
							System.out.println("Invalid input");
							sc.nextLine();
							cancelbooking(sc);
						} else {
							int index = 0;
							Set<Integer> set = map.keySet();
							for (int i : set) {
								if (valid == i) {
									index = map.get(i);
								}
							}
//							booking.remove(index);
							Booking obj = booking.get(index);
							Booking newobj = new Booking();
							newobj.bookid = obj.bookid;
							newobj.customer_name = name;
							newobj.date = obj.date;
							newobj.finess_type = obj.finess_type;
							newobj.lesson_day = obj.lesson_day;
							newobj.lesson_name = obj.lesson_name;
							newobj.mobileno = obj.mobileno;
							newobj.status = "Cancelled Booking";
							newobj.price = obj.price;
							newobj.time = obj.time;
							booking.set(index, newobj);

							System.out.println("Successfully Cancel your Booking \n Thanks for visiting");
						}
					} catch (Exception e) {
						System.out.println("Something Wrong");
						sc.nextLine();
						cancelbooking(sc);
					}
				}
				}
				else
				{
					System.out.println("This Booking Already Cancelled");
				}
			} catch (Exception e) {
				System.out.println("something wrong");
				sc.nextLine();
				cancelbooking(sc);
			}
		} else {
			System.out.println("NO any booking avaliable");
		}
	}

//	================================[ Rating ]============================================

	private static void rating(Scanner sc) {
		if (booking.size() != 0) {
			System.out.println("===========[ Welcome to Review panel ]==============================");
			showbooking(sc);
			System.out.println("Select from above booking any one booking which you want to give rating");
			System.out.println("Enter any Attended Lessons Booking Id :");
			try {
				int bkid = sc.nextInt();
				int cnt = 0;
				int bkindex = 0;
				int cancelvalid = 0;
				for (int i = 0; i < booking.size(); i++) {
					if (booking.get(i).customer_name.equalsIgnoreCase(name) && booking.get(i).bookid == bkid) {
						cnt++;
						bkindex = i;
						System.out.println(booking.get(i).lesson_day + " || " + booking.get(i).finess_type + " || "
								+ booking.get(i).lesson_name);
					}
					if (booking.get(i).customer_name.equalsIgnoreCase(name) && booking.get(i).bookid == bkid
							&& booking.get(i).status.equalsIgnoreCase("Cancelled Booking")) {
						cancelvalid++;
					}
				}
				if (cancelvalid == 0) {
					if (cnt == 0) {
						System.out.println("Please Enter Valid Booking id");
						rating(sc);
					} else {

						System.out.println("===========Give rating to above lesson===============");
						System.out.println("1 for Very dissatisfied");
						System.out.println("2 for Dissatisfied,");
						System.out.println("3 for Ok");
						System.out.println("4 for Satisfied,");
						System.out.println("5 for Very Satisfied");
						try {

							Rating rt = new Rating();
							rt.lesson_rating = sc.nextInt();
							if(rt.lesson_rating<1 || rt.lesson_rating>5)
							{
								System.out.println("invalid Rating");
							}
							else
							{
							Booking obj = booking.get(bkindex);
							Booking newbkobj = new Booking();
							newbkobj.bookid = obj.bookid;
							newbkobj.customer_name = obj.customer_name;
							newbkobj.date = obj.date;
							newbkobj.finess_type = obj.finess_type;
							newbkobj.lesson_day = obj.lesson_day;
							newbkobj.lesson_name = obj.lesson_name;
							newbkobj.mobileno = obj.mobileno;
							newbkobj.price = obj.price;
							newbkobj.time = obj.time;
							newbkobj.status = "Lesson Attended";
							booking.set(bkindex, newbkobj);
//					========== rating obj=======

							rt.customer_name = obj.customer_name;
							rt.date = obj.date;
							rt.finess_type = obj.finess_type;
							rt.lesson_day = obj.lesson_day;
							rt.lesson_name = obj.lesson_name;
							rt.mobileno = obj.mobileno;
							rt.price = obj.price;
							rt.time = obj.time;
							rating.add(rt);
							}
						} catch (Exception e) {
							System.out.println("Something Wrong");
							sc.nextLine();
							rating(sc);
						}
					}
				} else {
					System.out.println("This is a Cancelled booking, Please Enter valid ");
				}
			} catch (Exception e) {
				
				System.out.println("Booking NOt Avaliable");
				System.out.println("Press 1 for Enter booking id again\nPress anything for goto main Menu ");
				try {
					sc.nextLine();
					int twoway = sc.nextInt();
					if (twoway == 1) {
						sc.nextLine();
						rating(sc);
					} else {
					}
				} catch (Exception x) {
					sc.nextLine();
				}
			}
		} else {
			System.out.println("Sorry, First of all you Attend Fitness Lesson");
		}
	}
//	=======================================[ Show Booking ]======================================

	private static void showbooking(Scanner sc) {
		int count = 0;
		System.out.println("====================[ My Booking ]=============================");
		for (int i = 0; i < booking.size(); i++) {
			if (booking.get(i).customer_name.equalsIgnoreCase(name)) {
				count++;
				System.out.println("booking Id = " + booking.get(i).bookid + " || " + booking.get(i).customer_name + " "
						+ booking.get(i).mobileno + " " + booking.get(i).lesson_day + " || "
						+ booking.get(i).finess_type + " || " + booking.get(i).lesson_name + " || "
						+ booking.get(i).date + " " + booking.get(i).time + " || " + "$" + booking.get(i).price + " || "
						+ booking.get(i).status);
			}
		}
		if (count == 0)
			System.out.println("No any Booking Avaliable");
		System.out.println("=================================================================");
	}

//	===========================================[ Booking ]===================================
	private static void booking(Scanner sc) {
		System.out.println("================[ Book Your Weekend Fitness Club ]======================");
		System.out.println("(Saturday sunday) || (SPIN YOGA BODYSCULPT ZUMBA)");
		System.out.println("Enter any One week Day OR Fitness Type ");
		String tempname = sc.nextLine();
		Map<Integer, Integer> map = new LinkedHashMap<>();
		int num = 0;
		int cnt = 0;
		for (int i = 0; i < lessons.size(); i++) {
			if (lessons.get(i).lesson_day.equalsIgnoreCase(tempname)
					|| lessons.get(i).finess_type.equalsIgnoreCase(tempname)) {
				cnt++;
				System.out.println("Press " + ++num + " for " + lessons.get(i).lesson_day + " "
						+ lessons.get(i).finess_type + " " + lessons.get(i).lesson_name + " " + lessons.get(i).date
						+ " " + lessons.get(i).time + " --> " + "$" + lessons.get(i).price);
				map.put(num, i);
			}
		}
		if (cnt == 0) {
			System.out.println("Invalid input, please enter valid");
			booking(sc);
		} else {
			try {
				int valid = sc.nextInt();
				if (valid <= 0 || valid > num) {
					System.out.println("Invalid input");
					sc.nextLine();
					booking(sc);
				} else {
					int index = 0;
					Set<Integer> set = map.keySet();
					for (int i : set) {
						if (valid == i) {
							index = map.get(i);
						}
					}
					Lessons obj = lessons.get(index);
					int count = 0;
					int spacevalid = 0;
					int cancelbkvalid = 0;
					for (int i = 0; i < booking.size(); i++) {
						if (booking.get(i).customer_name.equals(name)
								&& booking.get(i).finess_type.equals(obj.finess_type)
								&& booking.get(i).lesson_day.equals(obj.lesson_day)
								&& booking.get(i).lesson_name.equals(obj.lesson_name)
								&& booking.get(i).time.equals(obj.time)) {
							count++;
						}
						if (booking.get(i).lesson_name.equalsIgnoreCase(obj.lesson_name)) {
							spacevalid++;
						}
						if (booking.get(i).lesson_name.equalsIgnoreCase(obj.lesson_name) && booking.get(i).status.equalsIgnoreCase("Cancelled Booking")) {
							cancelbkvalid++;
						}
					}
					spacevalid = spacevalid - cancelbkvalid;
					if (count == 0) {
						if (spacevalid < 5) {
							Booking bk = new Booking();
							bk.bookid = (int) (Math.random() * 1000000);
							bk.customer_name = name;
							bk.date = obj.date;
							bk.lesson_day = obj.lesson_day;
							bk.finess_type = obj.finess_type;
							bk.lesson_name = obj.lesson_name;
							bk.mobileno = mobileno;
							bk.price = obj.price;
							bk.time = obj.time;
							booking.add(bk);
							System.out.println("Successfully Book your Slot");
							System.out.println("Thanks for visiting");
						} else {
							System.out.println("Sorry This lessons slot Already Full Try another lesson");
						}
					} else {
						System.out.println("This booking already Exist");
						sc.nextLine();
						booking(sc);
					}
				}
			} catch (Exception e) {
				System.out.println("Something Wrong");
				sc.nextLine();
				booking(sc);
			}
		}
	}

// ==================================sign up =======================================
	private static void Signup(Scanner sc) {

		String fullname = fullname(sc);
		while (fullname.length() <= 6) {
			System.out.println("enter valid full name");
			fullname = fullname(sc);
		}

		String mobileno = mobilenovalid(sc);
		while (mobileno.length() != 12 ) {
			System.out.println("Enter valid mobile number");
			mobileno = mobilenovalid(sc);
		}

		int age = agevalid(sc);
		while (age == 0 || age < 18 || age > 300) {
			System.out.println("enter valid age ");
			age = agevalid(sc);
		}
		sc.nextLine();

		System.out.println("Enter Password should be Greater than or equal 6 Digits : ");
		String password = sc.nextLine();
		System.out.println("Confirm password");
		String passvalid = sc.nextLine();

		boolean isvalid = true;
		while (true) {
			isvalid = true;

			if (password.length() < 6) {
				isvalid = false;
				System.out.println("Sorry, Enter valid password");
				System.out.println("Enter Password should be Greater than or equal 6 Digits : ");
				 password = sc.nextLine();
				System.out.println("Confirm password");
				 passvalid = sc.nextLine();
			} else if (!password.equals(passvalid)) {
				isvalid = false;
				System.out.println(
						"Password does not match please Enter valid Password & "
						+ "password should be Greater then or equal 6 Digits : ");
				password = sc.nextLine();
				System.out.println("Confirm password");
				passvalid = sc.nextLine();
			}

			if (isvalid) {
				int cnt=0;
				for (int i = 0; i < al.size(); i++) {
					if(al.get(i).mobileno.equalsIgnoreCase(mobileno) && al.get(i).password.equalsIgnoreCase(password))
					{
						cnt++;
					}
				}
				if(cnt==0)
				{
				User obj = new User(fullname, mobileno, age, password);
				al.add(obj);
				System.out.println("Successfully Sign up");
				break;
				}
				else
				{
					System.out.println("sign up Not Successful because of This Mobile number and Password already exist");
					break;
				}
			}
		}
	}

	private static int agevalid(Scanner sc) {
		int age = 0;
		try {
			System.out.println("Enter Your age & Age should be greater or equal to 18:");
			int tempage = sc.nextInt();
			age = tempage;
		} catch (Exception e) {
			System.out.println("Enter valid age");
			sc.nextLine();
			age = agevalid(sc);
		}
	
		return age;
	}

	private static String mobilenovalid(Scanner sc) {
		System.out.println("Enter Mobile number:");
		String mobileno = sc.nextLine();
		int cnt = 0;
		int zerocnt = 0;
		for (int i = 0; i < mobileno.length(); i++) {
			char ch = mobileno.charAt(i);
			if (ch >= '0' && ch <= '9') {
				cnt++;
			}
			if (ch == '0') {
				zerocnt++;
			}
		}
		if (cnt != 11 || zerocnt == 10) {
			System.out.println("Please Enter valid mobile number");
			mobileno=mobilenovalid(sc);
		}
		return mobileno;
	}

	private static String fullname(Scanner sc) {
		String fullname = "";
		System.out.println("Enter Full name:");
		fullname = sc.nextLine();
		int cnt = 0;
		for (int i = 0; i < fullname.length(); i++) {
			char ch = fullname.charAt(i);
			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch == ' ') {
				cnt++;
			}
		}
		if (fullname.length() != cnt) {
			System.out.println("Enter valid name");
			fullname = fullname(sc);
		}
		return fullname;
	}
}
