package Seminar003;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User>{

    ArrayList<User> users = new ArrayList<>();

    public Personal() {
    }

    public Personal(ArrayList<User> users) {
        this.users = users;
    }

    public List<User> toList(){
        List<User> ul = new ArrayList<>();
        for (User user : this
             ) {
            ul.add(user);
        }
        return ul;
    }



    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }
        };
    }
}
