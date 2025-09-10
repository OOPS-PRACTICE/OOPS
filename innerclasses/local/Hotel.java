
public class Hotel {

    private String name;
    private int totalRooms;
    private int reservedRooms;


    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reserveRoom(String guestName, int numOfRooms){
        class ReservationValidator {

            boolean validate() {
                if(numOfRooms < 0){
                   return false;
                }

                if(reservedRooms + numOfRooms > totalRooms){
                    return false;
                }

                return true;
            }
        }

        ReservationValidator rscValid = new ReservationValidator();
        if(rscValid.validate()){
            reservedRooms += numOfRooms;
        }else{
            System.out.println("Reservation is failed");
        }
    }


}
