package io.paratek.deob.wrap;

import java.util.Objects;

public class TriSet<T> {

    public final T t1, t2, t3;

    public TriSet(T t1, T t2, T t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TriSet)) return false;
        TriSet<?> triSet = (TriSet<?>) o;
        return Objects.equals(t1, triSet.t1) &&
                Objects.equals(t2, triSet.t2) &&
                Objects.equals(t3, triSet.t3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(t1, t2, t3);
    }

    @Override
    public String toString() {
        return "TriSet@" + this.hashCode() + "{" + this.t1 + ", " + this.t2 + ", " + this.t3 + "}";
    }
}
