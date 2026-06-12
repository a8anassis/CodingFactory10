package gr.aueb.cf.solutions.ch15;

/**
 * IShape skeletal impl.
 */
public abstract class AbstractShape implements IShape {
    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
