package Enums;

public enum CategoriaIngresso {
	VIP("VIP", 1000), BACKSTAGE("BACKSTAGE", 800), PLATEIA_VIP("PLATEIA_VIP", 500), PLATEIA("PLATEIA", 300);

	private final String type; // in kilograms
	private final int preco; // in meters

	CategoriaIngresso(String type, int preco) {
		this.type = type;
		this.preco = preco;
	}

	public String getType() {
		return this.type;
	}

	public int getPreco() {
		return this.preco;
	}
}