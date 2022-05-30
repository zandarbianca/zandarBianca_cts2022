package agentie;

import java.util.ArrayList;
import java.util.List;

public class AgentieTurism {

	private List<IPachetTuristic> pacheteTuristice;
	
	public AgentieTurism() {
		pacheteTuristice=new ArrayList<IPachetTuristic>();
	}
	
	public void adaugaPachet(IPachetTuristic pachet) {
		pacheteTuristice.add(pachet);
	}

	public int getNumarPacheteTuristice(){
		return pacheteTuristice.size();
	}

	public double calculareSumaTotalaPachete() {
		double suma=0;
		for(IPachetTuristic pachet:pacheteTuristice) {
			suma+=pachet.getPret();
		}
		
		return suma;
	}
}
