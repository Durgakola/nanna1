package practiceswiggy;

public class SwiggyLogin {
        private  String username;
        private  String password;
        public SwiggyLogin(String username, String password) {
            this.username = username;
            this.password = password;
        }
        public boolean login(String enteredUsername, String enteredPassword) {
            return this.username.equals(enteredUsername) && this.password.equals(enteredPassword);
        }
    }

