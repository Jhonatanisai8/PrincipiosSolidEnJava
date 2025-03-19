package exampleResponsabilidadUnica;

import java.util.concurrent.TimeUnit;

public class EjemploPrincipioNoAplicado {

    public final static Integer NUMERO_COCHES_PRODUCIR = 5;
    public final static Integer TIEMPO_PROCESO_PINTURA = 4;
    public final static Integer TIEMPO_PROCESO_RUEDA = 1;
    public final static Integer TIEMPO_PROCESO_INTERIOR = 4;

    public static void lineaProduccionSinPrincipio() throws InterruptedException {
        System.out.println("Inicia la linea de producción...");
        for (int carro = 0; carro < NUMERO_COCHES_PRODUCIR; carro++) {
            System.out.println("Se inicia el emsanblaje del carro " + (carro + 1));

            // proceso de pintura
            System.out.println("Se incia el proceso de pintura de carroceria para el carro " + (carro + 1));
            TimeUnit.SECONDS.sleep(TIEMPO_PROCESO_PINTURA);
            System.out.println("Se finaliza  el proceso de pintura de carroceria para el carro " + (carro + 1));

            // proceso para los neumaticos
            System.out.println("Se incia el proceso de ensamblaje de los neumaticos para el carro " + (carro + 1));
            for (int neumaticoCarro = 0; neumaticoCarro < 4; neumaticoCarro++) {
                System.out.printf("\t Ensamblaje del neumático %d del Carro %d\n", (neumaticoCarro + 1),
                        (carro + 1));
                TimeUnit.SECONDS.sleep(TIEMPO_PROCESO_RUEDA);
            }
            System.out.println("Se finaliza el proceso de ensamblaje de los neumaticos para el carro " + (carro + 1));

            // proceso del interior
            System.out.println(
                    " Se inicia proceso de ensamblaje del interior para el carro " + (carro + 1));
            TimeUnit.SECONDS.sleep(TIEMPO_PROCESO_INTERIOR);
            System.out.println(
                    "Se finaliza  proceso de ensamblaje del interior para el carro " + (carro + 1));

            System.out.println("Se finaliza el ensamblaje del carro " + (carro + 1) + "\n");
        }
        System.out.println("Finaliza la linea de producción....");
    }
}