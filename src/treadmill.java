public class treadmill extends Obstacles {
int Distance;

public treadmill (int _Distance) {
    this.Distance = _Distance;
}

    @Override
    public void Doit(Competitor competitor) {
        competitor.run(Distance);
    }
}
