package lesson4.stat;

//singleton
//бывает нужно ограничить количество объектов класса - только один экземпляр
//- static - поле для класса

public class DataBaseConnector {
//        public static String conn;
    public String conn;

    public DataBaseConnector(String conn) {
        this.conn = conn;
    }

    public String getConnection() {
        return conn;
    }
}

class Constants{
    public static final String login = "odyssey"; //final - нельзя менять значение
    //может быть класс final
    final public String getLogin(){
        return login;
    }
}

class MyConstants extends Constants{
    //если класс final - от него нельяз отнаследоваться
//    @Override
//    public String getLogin(){ //нельзя оверрайдить так как она финал в спер классе
//        return "mmm"
//    }
}

class Tester{
    public static void main(String[] args) {
        DataBaseConnector con1 = new DataBaseConnector("mysql://mydb:34//mybase");
        DataBaseConnector con2 = new DataBaseConnector("oracle://server34:5001//enterprise");
        System.out.println(Constants.login);

        Logger logger = Logger.getInstance();
    }
}
//шаблон Синглетон
class Logger{
    private static Logger instance; //для хранения единств экземл

    private Logger(){ //приват конструкт чтобы нельзя было его создать экз

            }

    public static Logger getInstance(){ // статический инициализатор - для создания единств экз класса
        if (instance == null){
            instance =  new Logger();
        }
        return instance;
    }
}