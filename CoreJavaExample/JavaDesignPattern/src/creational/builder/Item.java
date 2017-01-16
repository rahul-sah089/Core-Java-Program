//https://www.tutorialspoint.com/design_pattern/builder_pattern.htm
package creational.builder;

public interface Item {
	public String name();

	public Packing packing();

	public float price();
}
