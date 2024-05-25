package ma.enset;

import proxy.BankService;
import proxy.BanqueWS;
import proxy.Compte;

public class Main {
    public static void main(String[] args) {
        BankService proxy = new BanqueWS().getBankServicePort();
        System.out.println(proxy.conversionEuroToDH(10));
        Compte compte = proxy.getCompte(3);
        System.out.println("--------------------------");

        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
        System.out.println(compte.getLocalDate());

        proxy.compteList().forEach(ct ->{
            System.out.println("--------------------------");
            System.out.println(ct.getCode());
            System.out.println(ct.getSolde());
            System.out.println(ct.getLocalDate());
        });

    }
}