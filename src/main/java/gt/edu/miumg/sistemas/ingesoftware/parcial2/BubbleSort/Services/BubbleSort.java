package gt.edu.miumg.sistemas.ingesoftware.parcial2.BubbleSort.Services;

public class BubbleSort implements IBubbleSort {

    @Override
    public void Sort(String[] words) {

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words.length - 1; j++) {
                String elementoActual = words[j],
                        elementoSiguiente = words[j + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {

                    words[j] = elementoSiguiente;
                    words[j + 1] = elementoActual;
                }
            }
        }

    }

}
