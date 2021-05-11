package pe.PagoBruto;

public class ClienteService {

	public static void main(String[] args) {
		PagoBrutoImpService pag = new PagoBrutoImpService();
		PagoBrutoDao pago = pag.getPagoBrutoImpPort();
		System.out.println("Pago total");
		System.out.println(pago.calcularpagototal(41, 10));
	}

}
