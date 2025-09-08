package Services;

import entitiy.Invoices;

import java.sql.SQLException;
import java.util.List;

public class BillingSystem {
    public  CustomerService customerService=new CustomerService();
    public InvoiceService invoiceService=new InvoiceService();

    public void createInvoice(int customerid, int vehicleid, List<Integer> serviceId) throws SQLException {
        String sids="";
        for (int servicesId:serviceId){
            sids+=servicesId;
        }
        InvoiceService.addInvoice(new Invoices(0,customerid,vehicleid,Integer.parseInt(sids)));
        System.out.println("Invoice generated Successfully....");
    }
    public void showAllInvoices() throws SQLException{
        List<Invoices> invoices=InvoiceService.getAllInvoices();
        for (Invoices in:invoices){
            System.out.println(in);
        }
    }
}
