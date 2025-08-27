
public class Space {

    private final int expected;
    private final boolean fixed;
    private Integer actual;

    public Space(int expected, boolean fixed) {
        this.expected = expected;
        this.fixed = fixed;

        if (fixed) {
            this.actual = expected;
        }
    }

    public int getExpected() {
        return expected;
    }

    public void setActual(final Integer actual){
        if(fixed) return;
        this.actual = actual;
    }

    public boolean isFixed() {
        return fixed;
    }

    public Integer getActual() {
        return actual;
    }

    public void clear(){
        setActual(null);
    }

    
}
