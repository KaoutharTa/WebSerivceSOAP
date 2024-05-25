package ma.enset;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@WebService(serviceName = "BanqueWS")
public class BankService {
    @WebMethod(operationName = "conversionEuroToDH")
    public double conversion(@WebParam(name="montant") double mt){
        return mt*15;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code  ){
        return new Compte(code , Math.random()*4000, new Date());

    }
    @WebMethod
    public List<Compte> compteList(){
        return List.of(
                new Compte(1 , Math.random()*4000, new Date()),
                new Compte(2 , Math.random()*4000, new Date()),
                new Compte(3 , Math.random()*4000, new Date())
        );
    }
}
