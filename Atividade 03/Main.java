import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class NumberException extends Exception {
    public NumberException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        // Cria as listas
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        LinkedList<String> list3 = new LinkedList<>();
        // Adicione 2 itens em cada lista
        try {
            addToList(list1, "Texto lista 1");
            addToList(list1, "Texto lista 2");
            addToList(list2, "Texto lista 3");
            addToList(list2, "Texto lista 4");
            addToList(list3, "Texto lista 5");
            addToList(list3, "Texto lista 6");
        } catch (NumberException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        showList(list1, 1);
        showList(list2, 2);
        showList(list3, 3);
        // Adicione todos os elementos da lista 2 e 3 para a lista 1.
        System.out.println("Adiciona todos os elementos da lista 2 e 3 para a lista 1.");
        list1.addAll(list2);
        list1.addAll(list3);
        showList(list1, 1);

        // Verifique se um elemento da lista 2 contém na lista 1.
        System.out.print("Verificando se um elemento da lista 2 está na lista 1: ");
        String element = list2.get(0);
        if (list1.contains(element)) {
            System.out.println("Elemento " + element + " encontrado na lista 1");
        } else {
            System.out.println("Elemento " + element + " não encontrado na lista 1");
        }

        // Verifique se todos os elementos da lista 3 estão na lista 1.
        System.out.print("Verificando se todos os elementos da lista 3 estão na lista 1: ");
        boolean allElementsInList1 = list1.containsAll(list3);
        if (allElementsInList1) {
            System.out.println("Todos os elementos da lista 3 estão na lista 1");
        } else {
            System.out.println("Alguns elementos da lista 3 não estão na lista 1");
        }

        // Verifique se a lista 1 é igual a lista 2.
        System.out.print("Verificando se a lista 1 é igual à lista 2: ");
        if (list1.equals(list2)) {
            System.out.println("A lista 1 é igual à lista 2");
        } else {
            System.out.println("A lista 1 não é igual à lista 2");
        }

        // Mostre o elemento 2 de cada lista.
        System.out.println("Elemento 2 de cada lista:");
        System.out.println("    Lista 1: " + list1.get(1));
        System.out.println("    Lista 2: " + list2.get(1));
        System.out.println("    Lista 3: " + list3.get(1));

        // Remova um elemento da lista 3.
        System.out.println("Removendo o último elemento da lista 3.");
        list3.removeLast();
        showList(list3, 3);

        // Remova os elementos da lista 3 da lista 1.
        System.out.println("Removendo os elementos da lista 3 da lista 1.");
        list1.removeAll(list3);
        showList(list1, 1);

        // Verifique o tamanho da lista 1.
        System.out.println("Tamanho da lista 1: " + list1.size());

        // Limpe a lista 3.
        System.out.println("Limpando a lista 3.");
        list3.clear();

        // Verifique se a lista 3 está vazia.
        System.out.println("Verificando se a lista 3 está vazia: " + list3.isEmpty());
        System.out.println("Tamanho da lista 3: " + list3.size());

        // Mostre cada elemento da lista 1.
        showList(list1, 1);
    }

    public static void showList(List<String> list, int i){
        System.out.println("Elementos da lista " + i + ":");
        for (String element : list) {
            System.out.println(element);
        }
    }

    public static void addToList(List<String> list, String text) throws NumberException {
        if (hasNumber(text)) {
            throw new NumberException("O texto não deve conter números.");
        }
        list.add(text);
    }

    public static boolean hasNumber(String text) {
        if (text.matches(".*\\d.*")) {
            return false;
        }
        return true;
    }
}
