package domain.card;

public enum Type {
	SPADE("스페이드"),
	DIAMOND("다이아몬드"),
	HEART("하트"),
	CLUB("클로버");

	private String typeName;

	Type(String type) {
		this.typeName = type;
	}

	public String getTypeName() {
		return typeName;
	}
}
