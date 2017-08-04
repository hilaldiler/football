
public class FootballEmulator extends Football {

	protected FootballClub homeTeam;
	protected FootballClub guestTeam;
	protected int scoresOfHomeTeam;
	protected int scoresOfGuestTeam;
	
	public FootballEmulator(FootballClub homeTeam, FootballClub guestTeam) {
		super();
		this.homeTeam = homeTeam;
		this.guestTeam = guestTeam;
	}
	
	@Override
	public void hasOpponent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void hasHoliganism() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void playableWith22Players() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void moveTheBall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void anOpponentScores(FootballClub club) {
		if(club.equals(homeTeam)) {
			scoresOfHomeTeam = scoresOfHomeTeam + 1;
		}
		else if(club.equals(guestTeam)) {
			scoresOfGuestTeam = scoresOfGuestTeam + 1;
		}
	}

	@Override
	void hasWinner() {
		if(scoresOfHomeTeam > scoresOfGuestTeam) {
			System.out.println(homeTeam.getClubName() + " kazandı");
		}
		else if(scoresOfGuestTeam > scoresOfHomeTeam) {
			System.out.println(guestTeam.getClubName() + " kazandı");
		}
		else System.out.println("Berabere");
		
	}

}
