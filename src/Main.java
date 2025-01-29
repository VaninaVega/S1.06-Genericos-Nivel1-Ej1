//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear un objeto con valores en cualquier orden (te lo crea mal al objeto que no recibe los parámetros en orden,
        // en este caso no me da error porque todos son de tipo String)

        NoGenericMethods obj1 = new NoGenericMethods("Banana", "Manzana", "Pera");
        NoGenericMethods obj2 = new NoGenericMethods("Manzana", "Banana", "Pera");
        NoGenericMethods obj3 = new NoGenericMethods("Pera", "Banana", "Manzana");

        // Mostrar los valores almacenados
        System.out.println("Objeto 1: Espera Banana, recibe: " + obj1.getBanana() + " / " +
                "Espera Manzana, recibe: " + obj1.getManzana() + " / " + "Espera Pera, recibe: " + obj1.getPera());
        System.out.println("Objeto 2: Espera Banana, recibe: " + obj2.getBanana() + " / " +
                "Espera Manzana, recibe: " + obj2.getManzana() + " / " + "Espera Pera, recibe: " + obj2.getPera());
        System.out.println("Objeto 3: Espera Banana, recibe: " + obj3.getBanana() + " / " +
                "Espera Manzana, recibe: " + obj3.getManzana() + " / " + "Espera Pera, recibe: " + obj3.getPera());
    }
}
