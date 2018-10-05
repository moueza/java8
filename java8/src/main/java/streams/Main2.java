package streams;

import java.util.stream.Stream;

public class Main2 {
	public static void main(String[] args) {
		System.out.println("OK2");
		// https://www.baeldung.com/java-8-streams

		Stream<String> onceModifiedStream = Stream.of("abcd", "bbcd", "cbcd").skip(1);

		Stream stream = onceModifiedStream;
		Stream<String> twiceModifiedStream = stream.skip(1).map(element -> ((String) element).substring(0, 3));

	}
}
