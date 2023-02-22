package Seminar003;

import java.util.*;

public class Company implements Iterable<User>{

    private User user;

    public Company(User user){
        this.user = user;
    }

    private List<User> getSubUsers(User user){
        List<User> users = new ArrayList<>();
        users.add(user);
        if(!user.getPersonal().iterator().hasNext()){
            return users;
        }
        for (User user1 : user.getPersonal()
             ) {
            users.addAll(getSubUsers(user1));
        }

        return users;

    }

    private List<User> getSubUsers2 (User user){
        List<User> users = new ArrayList<>();
        Queue<User> userQue = new ArrayDeque<>();
        userQue.offer(user);
        while (userQue.size() > 0){
            User userItem = userQue.poll();
            users.add(userItem);
            for (User subUser : userItem.getPersonal()
                 ) {
                userQue.offer(subUser);
            }
        }
        return users;

    }


    @Override
    public Iterator<User> iterator() {
        List<User> users = getSubUsers2(user);
        users.add(user);

        return users.iterator();
    }
}
