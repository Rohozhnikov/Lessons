package lesson7.labs.prob3_staticstorage;

public interface Cache {
	//shouldn't be static
	public default  long timeout() {
		//seconds
		return 1;
	}
}