package Services;

import config.DbConfig;
import entitiy.Invoices;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvoiceService {
    public static void addInvoice(Invoices invoice) throws SQLException {
        Connection conn = DbConfig.getConnection();
        PreparedStatement ps =
                conn.prepareStatement("INSERT INTO invoices (customer_id, vehicle_id,service_id) VALUES (?,?,?)");
        ps.setInt(1,invoice.getCustomerid());
        ps.setInt(2,invoice.getVehicleId());
        ps.setInt(3,invoice.getServiceId());
        int update=ps.executeUpdate();
        ps.close();
        conn.close();
    }


    public static List<Invoices> getAllInvoices() throws SQLException{
        List<Invoices> list=new ArrayList<>();
        Connection conn=DbConfig.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * from invoice");
        while(rs.next()){
            list.add(new Invoices(rs.getInt("id"),rs.getInt("customer_id"),
                    rs.getInt("service_id"),rs.getInt("vehicle_id")));
        }
        return list;
    }
}
