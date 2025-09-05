public class Train {
    private int TrainId;
    private String name;
    private  String source;
    private  String Destination;

    private int totalseats;
    private int availableseats;

    public int getTrainId() {
        return TrainId;
    }

    public void setTrainId(int trainId) {
        TrainId = trainId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getAvailableseats() {
        return availableseats;
    }

    public void setAvailableseats(int availableseats) {
        this.availableseats = availableseats;
    }

    public int getTotalseats() {
        return totalseats;
    }

    public void setTotalseats(int totalseats) {
        this.totalseats = totalseats;
    }

    public Train(int trainId, String name, String source, String destination, int availableseats, int totalseats) {
        TrainId = trainId;
        this.name = name;
        this.source = source;
        Destination = destination;
        this.availableseats = availableseats;
        this.totalseats = totalseats;
    }
    public boolean bookseats(int count){
        if (count<=availableseats){
            availableseats-=count;
            return true;
        }
        return false;
    }
    public void cancelseats(int count){
        availableseats+=count;
    }

    @Override
    public String toString() {
        return TrainId+" | "+name+" | "+source+ " -> "+Destination+"Seat Available :"+availableseats;
    }
}
