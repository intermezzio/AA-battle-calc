import java.util.ArrayList;

public class Team {
	private ArrayList<Unit> units;
	private ArrayList<Unit> casualties;
	private byte [] hitsequence;

	/*
	Team includes hitsequence, etc.
	*/
	public Team (ArrayList<Team> units) {
		this(units, new byte [units.size()]);
	}
	public Team (ArrayList<Team> units, byte [] hitsequence) {
		this.units = units;
		this.casualties = new ArrayList<Team>();
		this.hitsequence = hitsequence;
	}

} 