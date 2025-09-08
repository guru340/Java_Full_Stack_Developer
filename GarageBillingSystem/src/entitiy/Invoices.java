package entitiy;

public class Invoices {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int vehicleId) {
        VehicleId = vehicleId;
    }

    public int getServiceId() {
        return ServiceId;
    }

    public void setServiceId(int serviceId) {
        ServiceId = serviceId;
    }

    private int id;
    private int customerid;
    private int VehicleId;
    private int ServiceId;

    public Invoices(int customerid, int vehicleId, int serviceId, int vehicle_id) {
        this.customerid = customerid;
        VehicleId = vehicleId;
        ServiceId = serviceId;
    }

    public Invoices(int id) {
        this.id = id;
    }
}
