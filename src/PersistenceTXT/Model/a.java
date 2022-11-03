package PersistenceTXT.Model;

public class a {
private String name;
private String age;
private String friend;


public a(){
super();
//  TODO Auto-generated constructor stub
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFriend() {
        return friend;
    }

    public void setFriend(String friend) {
        this.friend = friend;
    }
    public a(String name, String age, String friend) {
        this.name = name;
        this.age = age;
        this.friend = friend;
    }

}
