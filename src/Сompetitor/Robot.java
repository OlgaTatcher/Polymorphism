package Сompetitor;

public class Robot implements Competitior{
    private static final String NAME="Robot";
    private double jump;
    private double run;

    public Robot(double jump, double run) {
        this.jump = jump;
        this.run = run;
    }

    public double getJump() {
        return jump;
    }

    public void setJump(double jump) {
        this.jump = jump;
    }

    public double getRun() {
        return run;
    }

    public void setRun(double run) {
        this.run = run;
    }


    @Override
    public String NameOfCompetitior() {
        return NAME;
    }

    @Override
    public void running(int length) {
        if (length>this.run){
            System.out.println(NAME+" can't run");
        }else{
            System.out.println(NAME+" ran the distance");
        }

    }

    @Override
    public void jumping(int height) {
        if (height>this.jump){
            System.out.println(NAME+" can't jump");
        }else{
            System.out.println(NAME+" jumped the wall");
        }

    }
}
