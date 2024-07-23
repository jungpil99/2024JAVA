package consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Ex1 {

	public static void main(String[] args) {
		Consumer<String> consumer = a -> System.out.println(a);
		
		consumer.accept("망겜");
		
		BiConsumer<String, String> consumer2 = (x,y) ->{
			System.out.println(x+y);
		};
		
		consumer2.accept("양","파");

	}

}
