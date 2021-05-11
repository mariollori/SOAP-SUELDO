package pe.PagoBruto;

import javax.xml.ws.Endpoint;

public class PagoBrutoPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Endpoint.publish("http://localhost:2121/PagoBruto", new PagoBrutoImp());
	}

}
