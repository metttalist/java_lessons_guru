package exceptions.myexceptions;

public class User {

//  Поле логин(естественно приватное)
    private String login;

    public String getLogin(){
        return login;
    }

    public void setLogin(String login) throws UserException { // обработка прердаёся на уровень выше
        if (login.length() < 3) throw new UserException(UserException.SHORT_LOGIN);
        if (login.length() > 6) throw new UserException(UserException.LONG_LOGIN);
        this.login = login;
    }
}
