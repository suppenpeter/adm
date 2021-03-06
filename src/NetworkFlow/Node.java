package NetworkFlow;

public class Node {
	
	private int index;
	private double demand;
	private double nettodemand;
	
	public Node(int index) {
		super();
		this.index = index;
	}

	public Node(int index, double demand) {
		super();
		this.index = index;
		this.demand = demand;
		this.nettodemand = 0;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public double getDemand() {
		return demand;
	}

	public void setDemand(double demand) {
		this.demand = demand;
	}

	public double getNettodemand() {
		return nettodemand;
	}

	public void setNettodemand(double nettodemand) {
		this.nettodemand = nettodemand;
	}
	
	public String toString() {
		StringBuffer string  = new StringBuffer("index: ");
		string.append(index);
		string.append(" demand: ");
		string.append(demand);
		string.append(" netto demand: ");
		string.append(nettodemand);
		
		return string.toString();
	}

}
