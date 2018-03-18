public class BattleUnit {
	byte attackValue;
	byte defendValue;
	byte hitsLeft;

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
}