public class Unit {
	private byte attackValue;
	private byte defendValue;
	private byte hits;
	private byte hitsLeft;
	private byte status = 2; // 2 = full, 1 = damaged, 0 = dead

	public BattleUnit() {
		this((byte)attackValue, (byte)defendValue);
	}
	public BattleUnit(int attackValue, int defendValue) {
		this((byte)attackValue, (byte)defendValue);
	}
	public BattleUnit(byte attackValue, byte defendValue) {
		this(attackValue, defendValue, 1);
	}
	public BattleUnit(byte attackValue, byte defendValue, byte hitsLeft) {
		this.attackValue = attackValue;
		this.defendValue = defendValue;
		this.hitsLeft = hitsLeft;
	}

	public byte takeHit() {
		if(this.hitsLeft == 0) {
			return (byte)-1;
		} else {
			hitsLeft--;
			status = hitsLeft > 0 ? 1 : 0;
			return hitsLeft;
		}
	}
}