package Сompetitor;

public class Man implements Competitior {
    private static final String NAME="Man";
    private double jump;
    private double run;

    public Man(double jump, double run) {
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

    public void setRun(int run) {
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
