import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import EnumsPackage.diasDaSemana;

public class diaProgram {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Test Before program");
		LocalDate date01 = LocalDate.now();
	
		
		System.out.println("Iniciando sistema:");
		System.out.println("");
		Integer day = date01.getDayOfMonth();
		System.out.println("Horario do dia");
		Integer diaHour = sc.nextInt();
		if (day == 1 || day == 8 || day == 15 || day == 22 || day == 29 ) {
			sc.nextLine();
			String dayWeek = "MONDAY";
			Dia dia = new Dia(diaHour, diasDaSemana.valueOf(dayWeek));
		System.out.println(	dia.getDay());
		System.out.println("It's a weekday");
			
		} else if(day == 2 || day == 9 || day == 16 || day == 23 || day == 30 ){
			sc.nextLine();
			String dayWeek = "TUESDAY";
			Dia dia = new Dia(diaHour, diasDaSemana.valueOf(dayWeek));
			System.out.println(	dia.getDay());
			System.out.println("It's a weekday");
		}
		else if(day == 3 || day == 10 || day == 17 || day == 24 || day == 31 ){
			sc.nextLine();
			String dayWeek = "WENDNESDAY";
			Dia dia = new Dia(diaHour, diasDaSemana.valueOf(dayWeek));
			System.out.println(	dia.getDay());
			System.out.println("It's a weekday");
		}
		else if(day == 4 || day == 11 || day == 18 || day == 25){
			sc.nextLine();
			String dayWeek = "THURSDAY";
			Dia dia = new Dia(diaHour, diasDaSemana.valueOf(dayWeek));
			System.out.println(	dia.getDay());
			System.out.println("It's a weekday");
		}
		else if(day == 5 || day == 12 || day == 19 || day == 26){
			sc.nextLine();
			String dayWeek = "FRIDAY";
			Dia dia = new Dia(diaHour, diasDaSemana.valueOf(dayWeek));
			System.out.println(	dia.getDay());
			System.out.println("It's a weekday");
		}
		else if(day == 6 || day == 13 || day == 20 || day == 27){
			sc.nextLine();
			String dayWeek = "SATURDAY";
			Dia dia = new Dia(diaHour, diasDaSemana.valueOf(dayWeek));
			System.out.println(	dia.getDay());
			System.out.println("It's a weekend day");
		}
		else if(day == 7 || day == 14 || day == 21 || day == 28){
			sc.nextLine();
			String dayWeek = "SUNDAY";
			System.out.println("It's a weekend day");
			Dia dia = new Dia(diaHour, diasDaSemana.valueOf(dayWeek));
			System.out.println(	dia.getDay());
		} else if(day > 31) {
			System.out.println("Não existe mes com mais de 31 dias");
		}
		
	
		sc.close();

	}

}