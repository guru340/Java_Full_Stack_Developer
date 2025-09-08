package Services;

import config.DbConfig;
import entitiy.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    public void addCustomer(Customer customer) throws SQLException {
        Connection conn = DbConfig.getConnection();
        PreparedStatement ps=conn.prepareStatement("INSERT INTO customer (name,phone) VALUES (?,?)");
        ps.setString(1,customer.getName());
        ps.setString(2,customer.getPhone());
        ps.close();
        conn.close();
    }
    public List<Customer> getAllCustomer() throws SQLException{
        List<Customer> list=new ArrayList<>();
        Connection conn=DbConfig.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * from customer");
        while(rs.next()){
            list.add(new Customer(rs.getInt("id"),
                    rs.getString("name"),rs.getString("phone")));
        }
        return list;
    }
    public Customer getCustomersBasesOnNum(String number) throws SQLException{
        Customer customer=new Customer();
        Connection conn= DbConfig.getConnection();
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("SELECT * from customer where phone =" +number);
        while(rs.next())
        {
            customer = new Customer(rs.getInt("id"),
                    rs.getString("name"), rs.getString("phone"));
        }
        return customer;
    }

}
