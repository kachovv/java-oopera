import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private ArrayList<Actor> listOfActors = new ArrayList<>();

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void printListOfActors() {
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст.");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println(actor);
            }
        }
    }

    public void printDirectorInfo() {
        System.out.println("Информация о режиссере:");
        System.out.println(director);
    }

    public void addActor(Actor newActor) {
        if (listOfActors == null) {
            listOfActors = new ArrayList<>();
        }
        if (listOfActors.contains(newActor)) {
            System.out.println("Актер " + newActor.getName() + " " + newActor.getSurname() + " уже есть в спектакле.");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актер добавлен.");
        }
    }

    public void replaceActor(Actor newActor, String surname) {
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст.");
            for (int i = 0; i < listOfActors.size(); i++) {
                if (listOfActors.get(i).getSurname().equals(surname)) {
                    listOfActors.set(i, newActor);
                    System.out.println("Актер с фамилией " + surname + " заменен.");
                    return;
                }
            }
            System.out.println("Актер с фамилией " + surname + " не найден.");
        }
    }
}
