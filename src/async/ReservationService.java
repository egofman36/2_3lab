package async;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.xml.ws.Endpoint;

@WebService(serviceName = "Reservation", portName = "ReservationPort", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/students")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class ReservationService {

	// store Sport assortment
	//TODO поменять
	private static Sport[] sportData = {
			new Sport("1", "Adidas", "Sports Equipment", "Tennis racquet", "-",8000),
			new Sport("2", "Adidas", "Sports Equipment", "Ball", "-",1500),
			new Sport("3", "Adidas", "Sports Equipment", "Bit", "-",1200),
			new Sport("4", "Nike", "Sports Equipment", "Tennis racquet", "-",1500),
			new Sport("5", "Puma ", "Sport", "Tracksuit", "XXL",7000)
	};
	// the number of products in the store
	private static int[] quantityData = {44, 22, 77, 24, 4};
	private static StoreAssortment storeAssortment = new StoreAssortment(sportData, quantityData);
	private UserReserve goReserveSport(String type, int quantity) {
		int size = storeAssortment.getSports().length;
		for (int i = 0; i < size; i++) {
			Sport currentSport = storeAssortment.getSports()[i];
			int currentQuantity = storeAssortment.getQuantity()[i];
			if (type.equals(currentSport.getType()) && quantity <= currentQuantity) {
				storeAssortment.setQuantityFromIndex(i, currentQuantity - quantity);
				return new UserReserve(currentSport, quantity);
			}
		}
		return null;
	}

	@WebMethod(operationName = "ReserveSport")
	public UserReserve reserveSport(String type, int quantity) {
		try {
			Thread.sleep(1000*10); // Sleep for 10 seconds
			return goReserveSport(type, quantity);
		} catch(InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}

	 public static void main(String args[]) {
	        Endpoint.publish("http://localhost:8082/Reservation", new ReservationService());
	  }
}
