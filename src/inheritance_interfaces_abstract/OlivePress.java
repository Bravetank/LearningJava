package inheritance_interfaces_abstract;

import inheritance_interfaces_abstract.model.Olive;

import java.util.List;

public class OlivePress implements Press{

	private int currentOil;

	public int getOil(List<Olive> olives) {

		int totalOil = currentOil;
		for (Olive o : olives) {
			totalOil += o.crush();
		}

		return totalOil;

	}

	@Override
	public void setOil(int oil) {
	    currentOil = oil;

	}

}
