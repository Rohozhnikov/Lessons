package lesson9.labs.prob8;

@FunctionalInterface
public interface MyTriFunction<S,T,U,R> {
	R apply(S s, T t, U u);
}
