package retryxception;

public class BookMyShowProcess {
    public void bookTicket(){
        try {
            BookMyShowService showService = new BookMyShowService();
          //  showService.
        }catch (Exception e){
            System.out.println(" error occures "+ e);
        }finally {
            System.out.println(" finally block from Book ticket");
        }
    }
}
