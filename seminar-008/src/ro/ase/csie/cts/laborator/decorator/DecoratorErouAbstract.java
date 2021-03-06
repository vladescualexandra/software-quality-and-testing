package ro.ase.csie.cts.laborator.decorator;

public abstract class DecoratorErouAbstract extends SuperErou {

    SuperErou erou = null;

    public DecoratorErouAbstract(SuperErou erou) {
        super(erou.nume, erou.puncteViata);
        this.erou = erou;
    }

    @Override
    public int getPuncteViata() {
        return this.erou.getPuncteViata();
    }

    @Override
    public void alearga() {
        this.erou.alearga();
    }

    @Override
    public void esteLovit(int puncte) {
        this.erou.esteLovit(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        this.erou.seVindeca(puncte);
    }
}
