// 3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
// времени работы и стоимости.

public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    public class Attraction {
        private String name;
        private String openTime;
        private double cost;

        public Attraction(String name, String openTime, double cost) {
            this.name = name;
            this.openTime = openTime;
            this.cost = cost;
        }
    }



}
