package gt.edu.miumg.sistemas.ingesoftware.parcial2.BubbleSort;

import gt.edu.miumg.sistemas.ingesoftware.parcial2.BubbleSort.Services.BubbleSort;
import gt.edu.miumg.sistemas.ingesoftware.parcial2.BubbleSort.Services.IBubbleSort;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BubbleSortApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BubbleSortApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        IBubbleSort bubble = new BubbleSort();

        String[] words = {"Perro", "Pino","Cabello","Reloj","Gato","Ingenieria","sistemas"};

        bubble.Sort(words);

        for (int i = 0; i < words.length; i++) {
            
            
            System.out.println(words[i]);
            
        }
    }
}

  

