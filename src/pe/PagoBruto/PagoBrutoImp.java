package pe.PagoBruto;
import javax.jws.WebService;

@WebService(endpointInterface = "pe.PagoBruto.PagoBrutoDao")
public class PagoBrutoImp implements PagoBrutoDao{

	@Override
	public double calcularpagototal(int horas, double pago) {
		
		double pagobruto=0;
		
		if(horas<=40) {
			pagobruto=horas*pago;
		}else {
			int horasextra=horas-40;
			double pagoextrar= pago + (pago/2);
			pagobruto = (40*pago) + (horasextra*pagoextrar);
			
		}
		return pagobruto;
	}
	

}
