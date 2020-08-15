package Model;
/**
 * Created by shahin_yzd on 8/15/2020.
 */
public class LogInModel {

    public class Person{
        private String userName;
        private String password;

        public String getUser() {
            return userName;
        }

        public void setUser(String userName) {
            this.userName = userName;
        }

        public String getPass() {
            return password;
        }

        public void setPass(String password) {
            this.password = password;
        }

        public Person(String userName,String password){
            //super();  //don't know it's affect
            this.userName=userName;
            this.password=password;
        }
    }
}
