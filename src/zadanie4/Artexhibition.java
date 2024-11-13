package zadanie4;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Artexhibition {
    private String name;
    private LocalDateTime start;
    private LocalDateTime end;
    private List<Art> painting;

    public Artexhibition (String name, LocalDateTime start, LocalDateTime end) {
        this.name = name;
        this.start = start;
        this.end= end   ;
        this.painting = new ArrayList<>();
    }

    public void addart(String name, String author) {
        painting.add(new Art(name, author));
    }

    public void info() {
        System.out.println("Выставка: " + name);
        System.out.println("Начало: " + start);
        System.out.println("Окончание: " + end);
        System.out.println("Картин на выставке: ");
        for (Art art : painting) {
            System.out.println(" - " + art);
        }
    }

    private class Art {
        private String name;
        private String author;

        public Art(String name, String author) {
            this.name= name;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Название: " + name + ", Автор: " + author;
        }
    }

    public static void main(String[] args) {
        Artexhibition  artexhibition= new Artexhibition (
                "Весеннее вдохновение",
                LocalDateTime.of(2023, 3, 1, 10, 0),
                LocalDateTime.of(2023, 3, 31, 18, 0)
        );

        artexhibition.addart("Звёздная ночь", "Винсент Ван Гог");
        artexhibition.addart("Мона Лиза", "Леонардо Давинчи");
        artexhibition.addart("Девятый вал", "Айвазовский");

        artexhibition.info();
    }
}
