import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookingServices {

    private List<Train> TrainList=new ArrayList<>();
    private List<Ticket> TicketList=new ArrayList<>();

    public BookingServices(){
        TrainList.add(new Train(101,"Rajdhani Express","Delhi","Nagpur",100,100));
        TrainList.add(new Train(102,"Shatabdi Express","Delhi","Mumbai",100,100));
        TrainList.add(new Train(103,"Durunto Express","Agra","Delhi",100,100));
        TrainList.add(new Train(104,"vande Bharat Express","Delhi","Goa",100,100));
        TrainList.add(new Train(105,"Intercity","Kolkata","Manali",100,100));
        TrainList.add(new Train(106,"Tejas Express","Delhi","Bengaluru",100,100));
    }
    public List<Train> searchTrain(String source,String destination)
    {
        List<Train> res=new ArrayList<>();
        for(Train train:TrainList)
        {
            if(train.getSource().equalsIgnoreCase(source) && train.getDestination().equalsIgnoreCase(destination))
            {
                res.add(train);
            }
        }

        return res;
    }

    public Ticket bookTicket(User user, int trainId, int seatCount)
    {
        for(Train train:TrainList)
        {
            if (train.getTrainId()==trainId)
            {
                if(train.bookseats(seatCount))
                {
                    Ticket ticket=new Ticket(user,train,seatCount);
                    TicketList.add(ticket);
                    return ticket;
                }
                else {
                    System.out.println("No enough seats available");
                    return null;
                }
            }
        }
        System.out.println("Train ID not found");
        return null;
    }
    public List<Ticket> getticketbyuser(User user){
        List<Ticket> res=new ArrayList<>();
        for(Ticket ticket:TicketList){
            if (ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                res.add(ticket);
            }
        }
        return res;
    }

    public boolean cancelTicket(int ticketid,User user){
        Iterator<Ticket> list=TicketList.listIterator();
        while(list.hasNext()){
            Ticket ticket = list.next();
            if (ticket.getTicketId()==ticketid && ticket.getUser().getUsername().equalsIgnoreCase(user.getUsername())){
                Train train=ticket.getTrain();
                train.cancelseats(ticket.getSeatBooked());
                list.remove();
                System.out.println("Ticket "+ticketid +" Cancelled Sucessfully ");
            }
        }
        System.out.println("Ticket not Found  or does not belong to current user");
        return false;
    }

    public void listAllTrian(){
        System.out.println("List of All Train");
        for (Train train :TrainList){
            System.out.println(train);
        }
    }
}

