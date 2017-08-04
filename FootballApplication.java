
public class FootballApplication {

	public static void main(String[] args) {
		FootballClub fc1 = new FootballClub("Gençlerbirliği", "Kara kızıl", 1, "19 Mayıs", 25000);
		FootballClub fc2 = new FootballClub("Ankaragücü", "Sarı Lacivert", 1, "19 Mayıs", 25000);
		FootballEmulator emulator = new FootballEmulator(fc1, fc2);
		System.out.println(emulator.homeTeam.clubName);
		System.out.println(emulator.guestTeam.clubName);
		emulator.anOpponentScores(fc1);
		emulator.anOpponentScores(fc2);
		emulator.anOpponentScores(fc1);
		System.out.println(fc1.getClubName() + " " + emulator.scoresOfHomeTeam + " " + fc2.clubName + " " + emulator.scoresOfGuestTeam);
		emulator.hasWinner();
		
	}

}
