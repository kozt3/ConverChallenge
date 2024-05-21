import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

public class Monedas {
		@SerializedName("conversion_rates")
		JsonObject moneda;
		double usd = 0;
		double ars = 0;
		double brl = 0;	
		double cop = 0;
			
	public JsonObject getMoneda() {
		return moneda;
	}


	public void setMoneda(JsonObject moneda) {
		this.moneda = moneda;
	}


	public double getUsd() {
		return usd;
	}


	public void setUsd(double usd) {
		this.usd = usd;
	}


	public double getArs() {
		return ars;
	}


	public void setArs(double ars) {
		this.ars = ars;
	}


	public double getBrl() {
		return brl;
	}


	public void setBrl(double brl) {
		this.brl = brl;
	}


	public double getCop() {
		return cop;
	}


	public void setCop(double cop) {
		this.cop = cop;
	}

	
	public double setUsdToArs(double monto) {
		return  getArs() * monto ;
	} 
	
	public double setArsToUsd(double monto) {
		return  monto / getArs();
	} 

	public double setUsdToBrl(double monto) {
		return  getBrl() * monto;
	} 
	
	public double setBrlToUsd(double monto) {
		return  monto / getBrl();
	}


	public double setUsdToCop(double monto) {
		// TODO Auto-generated method stub
		return getCop() * monto;
	}


	public double setCopToUsd(double monto) {
		// TODO Auto-generated method stub
		return monto / getCop();
	} 
	
	
}
