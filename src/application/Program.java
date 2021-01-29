package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = Integer.parseInt(sc.nextLine());
		
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Check-out dates be after check-im date");
			
		} else {

			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			
			System.out.print("Check-in date (dd/MM/yyyy): ");//VAI DIGITAR UMA VERIFICAÇÃO DE ENTRADA
			checkIn = sdf.parse(sc.next());
			
			System.out.print("Check-out date (dd/MM/yyyy): ");//VAI DIGITAR UMA VERIFICAÇÃO DE SAÍDA
			checkOut = sdf.parse(sc.next());

			
//			SEGUNDA SOLUÇÃO - RUIM
			
			String error = reservation.updateDates(checkIn, checkOut);
			
			if (error != null) {
				System.out.println("Error in reservation: " + error);
				
			} else {
				System.out.println("Reservation: " + reservation);
			}
			
//			FIM DA SEGUNDA SOLUÇÃO
			
		}
		
		sc.close();
		
		
//		after --> DEPOIS
	}
}
















