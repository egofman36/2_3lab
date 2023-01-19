package sample;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService(serviceName = "DisplayAssortment", portName = "DisplayAssortmentPort", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam")
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class StoreService {
    // store Sport assortment
    private static Sport[] sportData = {
            new Sport("1", "Adidas", "Sports Equipment", "Tennis racquet", "-",8000),
            new Sport("2", "Adidas", "Sports Equipment", "Ball", "-",1500),
            new Sport("3", "Adidas", "Sports Equipment", "Bit", "-",1200),
            new Sport("4", "Nike", "Sports Equipment", "Tennis racquet", "-",1500),
            new Sport("5", "Puma ", "Sport", "Tracksuit", "XXL",7000)
    };
    // the number of products in the store
    private static int[] quantityData = {5, 4, 3, 2, 1};
    private static StoreAssortment storeAssortment = new StoreAssortment(sportData, quantityData);

    @WebMethod(operationName = "GetStoreAssortment")
    public StoreAssortment getStoreAssortment() {
        return storeAssortment;
    }

}