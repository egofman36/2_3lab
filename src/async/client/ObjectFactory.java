
package async.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the async.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReserveSport_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/students", "ReserveSport");
    private final static QName _ReserveSportResponse_QNAME = new QName("http://asu.dgtu.donetsk.ua/ex/students", "ReserveSportResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: async.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReserveSportResponse }
     * 
     */
    public ReserveSportResponse createReserveSportResponse() {
        return new ReserveSportResponse();
    }

    /**
     * Create an instance of {@link ReserveSport }
     * 
     */
    public ReserveSport createReserveSport() {
        return new ReserveSport();
    }

    /**
     * Create an instance of {@link UserReserve }
     * 
     */
    public UserReserve createUserReserve() {
        return new UserReserve();
    }

    /**
     * Create an instance of {@link Sport }
     * 
     */
    public Sport createSport() {
        return new Sport();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveSport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asu.dgtu.donetsk.ua/ex/students", name = "ReserveSport")
    public JAXBElement<ReserveSport> createReserveSport(ReserveSport value) {
        return new JAXBElement<ReserveSport>(_ReserveSport_QNAME, ReserveSport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReserveSportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://asu.dgtu.donetsk.ua/ex/students", name = "ReserveSportResponse")
    public JAXBElement<ReserveSportResponse> createReserveSportResponse(ReserveSportResponse value) {
        return new JAXBElement<ReserveSportResponse>(_ReserveSportResponse_QNAME, ReserveSportResponse.class, null, value);
    }

}
