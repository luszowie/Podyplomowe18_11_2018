
    class MarsApplication {
        public static void main(String[] arguments) {
            MarsRobot spirit = new MarsRobot("exploracja",2, -60);
            MarsRobot spirit2 = new MarsRobot("oczekiwanie",0, 0);
            MarsRobot spirit3 = new MarsRobot("powrót do bazy",5, -133);




            spirit.showAttributes();
            System.out.println("Zwiększanie prędkości do 3.");
            spirit.speed = 3;
            spirit.showAttributes();
            System.out.println("Zmiana temperatury na -90.");
            spirit.temperature = -90;
            spirit.showAttributes();
            System.out.println("Sprawdzenie temperatury.");
            spirit.checkTemperature();
            spirit.showAttributes();
        }
    }

