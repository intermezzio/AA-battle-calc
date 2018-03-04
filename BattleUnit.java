public class BattleUnit {
	byte attackValue;
	byte defendValue;

	public BattleUnit() {
		this((byte)attackValue, (byte)defendValue);
	}
	public BattleUnit(int attackValue, int defendValue) {
		this((byte)attackValue, (byte)defendValue);
	}
	public BattleUnit(byte attackValue, byte defendValue) {
		this.attackValue = attackValue;
		this.defendValue = defendValue;
	}
}