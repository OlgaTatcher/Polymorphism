import GeometricFigures.Circle;
import GeometricFigures.GeometricFigure;
import GeometricFigures.Square;
import GeometricFigures.Triangle;
import Сompetitor.*;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Program {
    public static void main(String[] args) {
        GeometricFigure [] Figures={new Circle(5),
                new Triangle(10.5,5),
                new Square(4)};

        for (GeometricFigure geometricFigure:Figures) {
            System.out.println("Area of figures - "+geometricFigure.NameOfFigure()+": "+geometricFigure.figureArea());
        }



        Competitior [] participant={new Man(1.5,25.0),
                new Cat(1.0,12.0),
                new Robot(2.0,30.0)};

        Obstacle [] overcome={new Wall(5),new Track(30)};

        for (Competitior competitior:participant) {
            for (Obstacle barrier:overcome) {
                System.out.println("Участник: "+competitior.NameOfCompetitior()+" преодолел "+barrier.NameOfObstacle());
                }

            }
        System.out.println(" ");


        Wall wall=new Wall(1);
        Track track=new Track(15);
        Man man = new Man(2,20);
        Cat cat = new Cat(1.0,12.0);
        Robot robot = new Robot(25, 300);

        if (man.getJump()> wall.getHeight()&&(man.getRun()>track.getLength())){
            wall.overcoming(man);
            System.out.println("Участник "+man.NameOfCompetitior()+" преодолел первую преграду");
            track.overcoming(man);
            System.out.println("Участник "+man.NameOfCompetitior()+" преодолел вторую преграду");
        } else{
            System.out.println("Участник "+man.NameOfCompetitior()+" выбывает");
        }


        if (cat.getJump()> wall.getHeight()&&(cat.getRun()>track.getLength())){
            wall.overcoming(cat);
            System.out.println("Участник "+cat.NameOfCompetitior()+ "преодолел первую преграду");
            track.overcoming(cat);
            System.out.println("Участник "+cat.NameOfCompetitior()+" преодолел вторую преграду");
        } else{
            System.out.println("Участник "+cat.NameOfCompetitior()+" выбывает");
        }

        if (robot.getJump()> wall.getHeight()&&(robot.getRun()>track.getLength())){
            wall.overcoming(robot);
            System.out.println("Участник "+robot.NameOfCompetitior()+" преодолел первую преграду");
            track.overcoming(robot);
            System.out.println("Участник "+robot.NameOfCompetitior()+" преодолел вторую преграду");
        } else{
            System.out.println("Участник "+robot.NameOfCompetitior()+" выбывает");
        }

        }



}





