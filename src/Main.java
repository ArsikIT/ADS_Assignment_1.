import tasks.Tasks;


public class Main {
    public static void main(String[] args) {
        Tasks tasks_type = new Tasks();
        MyApplication app = new MyApplication(tasks_type);

        app.menu();
    }
}