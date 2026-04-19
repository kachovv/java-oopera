import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
       Actor actor1 = new Actor("Киллиан", "Мерфи", Person.Gender.MALE, 180);
       Actor actor2 = new Actor("Бред", "Питт", Person.Gender.MALE, 178);
       Actor actor3 = new Actor("Гвиндолин", "Кристи", Person.Gender.FEMALE, 191);
       Director director1 = new Director("Джеймс", "Кэмерон", Person.Gender.MALE, 6);
       Director director2 = new Director("Тим", "Бёртон", Person.Gender.MALE, 4);
       Director director3 = new Director("Владимир", "Бурмистров", Person.Gender.MALE, 6);
       MusicAuthor musicAuthor = new MusicAuthor("Макс", "Штайнер", Person.Gender.MALE);
       MusicAuthor musicAuthor1 = new MusicAuthor("Петр", "Чайковский", Person.Gender.MALE);
       Choreographer choreographer = new Choreographer("Мариус", "Питипа", Person.Gender.MALE);
       ArrayList<Actor> actors = new ArrayList<>();
       Show show = new Show("Сто лет одиночества", 9, director1, actors);
       ArrayList<Actor> actors2 = new ArrayList<>();
       Opera opera = new Opera("Богема", 2, director2, actors2, musicAuthor,
               "В огне камина ярко пылает полная жара сцена любви!", 12);
       ArrayList<Actor> actors3 = new ArrayList<>();
       Ballet ballet = new Ballet("Лебединое озеро", 2, director3, actors3, musicAuthor1,
               "Одетта превращается в девушку и вместе с Зигфридом радостно встречает первые лучи восходящего солнца.", choreographer);
       show.addActor(actor1);
       show.addActor(actor2);
       opera.addActor(actor3);
       opera.addActor(actor2);
       ballet.addActor(actor3);

       System.out.println("Список актеров для спектакля " + show.getTitle() + ":");
       show.printListOfActors();

       System.out.println("Список актеров для оперы " + opera.getTitle() + ":");
       opera.printListOfActors();

        System.out.println("Список актером для балета " + ballet.getTitle() + ":");
       ballet.printListOfActors();

       show.replaceActor(actor3, "Мерфи");
       show.printListOfActors();
       opera.replaceActor(actor1, "Иванов");

       System.out.println("Либретто для оперы " + opera.getTitle() + ":");
       opera.printLibrettoText();

       System.out.println("Либретто для балета " + ballet.getTitle() + ":");
       ballet.printLibrettoText();
    }
}
