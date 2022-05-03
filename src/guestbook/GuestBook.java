package guestbook;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GuestBook {
    private int capacity = 20;
    private Guest [] book = new Guest[20];

    public void add(Guest guest) throws InvalidNameException, InvalidEmailException{
        if (guest.getName().length() < 4 ){
            throw new InvalidNameException("Name should have at least 4 letters");
        }


        if (!guest.getEmail().matches("^[aA-zZ0-9._%+-]+@[aA-zZ0-9.-]+\\.[aA-zZ]{2,6}$")){
            throw new InvalidEmailException("Email address is invalid, please enter valid email address.");
        }

        for (int i = 0; i < book.length; i++) {
            if(book[i] == null){
                book[i] = guest;
                break;
            }
        }

        if (book[capacity-1] != null) {
            throw new GuestBookFullException ("Guest book is full, No more space for new guests.");
        }

    }
}
