public class Cons extends Cast{
    private ActorRole actorRole;
    private Cast rest;

    public Cons(ActorRole actorRole, Cast rest) {
        this.actorRole =actorRole;
        this.rest=rest;
    }
}
