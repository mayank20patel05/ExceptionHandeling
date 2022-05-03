package guestbook;

public class GuestRun{
    public static void main(String[] args) {
        GuestBook book = new GuestBook();
        try {
            book.add(new Guest("Mayank", "ahjhkd2@hotmail.com"));
            book.add(new Guest("Mayank", "ma12.rf%_we@gma.il.ca"));
            book.add(new Guest("Mayank", "master@.com"));

        } catch (InvalidNameException e) {
            e.printStackTrace();
        } catch (GuestBookFullException ex){
            System.out.println(ex.getMessage());
            System.out.println("Guest book is full now.");
            ex.printStackTrace();
        } catch (InvalidEmailException exc){
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        }
    }
}
