package exampleResponsabilidadUnica;

import java.util.concurrent.TimeUnit;

public class EjemploPrincipioAplicado {

    public static void lineaProduccionConPrincipio() throws InterruptedException {
        System.out.println("Se inicia la linea de produccion.....");
        for (int iteradorAuto = 0; iteradorAuto < EjemploPrincipioNoAplicado.NUMERO_COCHES_PRODUCIR; iteradorAuto++) {
            formatoMensajeProceso(true, "ensamblaje del carro", iteradorAuto);
            procesoPintarCarro(iteradorAuto);
            procesoRuedasCarro(iteradorAuto);
            procesoInterioresCarro(iteradorAuto);
            formatoMensajeProceso(false, "ensamblaje del carro", iteradorAuto);
        }
        System.out.println("Se finaliza la linea de produccion.....");
    }

    private static void formatoMensajeProceso(Boolean esInicio, String proceso, Integer iteradorCarro) {
        String prefijo = "";
        if (esInicio) {
            prefijo = "Inicio";
        } else {
            prefijo = "Finaliza";
        }
        System.out.println(prefijo + " proceso de " + proceso + " del carro " + (iteradorCarro + 1));
    }

    private static void procesoPintarCarro(Integer iteradorCarro) throws InterruptedException {
        formatoMensajeProceso(true, "pintura de carroceria", iteradorCarro);
        TimeUnit.SECONDS.sleep(EjemploPrincipioNoAplicado.TIEMPO_PROCESO_PINTURA);
        formatoMensajeProceso(false, "pintura de carroceria", iteradorCarro);
    }

    private static void procesoRuedasCarro(Integer iteradorCarro) throws InterruptedException {
        formatoMensajeProceso(true, "Rueda de carroceria", iteradorCarro);
        for (int rueda = 0; rueda < 4; rueda++) {
            formatoMensajeProceso(true, "ensamblaje del neumatico " + (rueda + 1), iteradorCarro);
            TimeUnit.SECONDS.sleep(EjemploPrincipioNoAplicado.TIEMPO_PROCESO_RUEDA);
        }
        formatoMensajeProceso(false, "Rueda de carroceria", iteradorCarro);
    }

    private static void procesoInterioresCarro(Integer iteradorCarro) throws InterruptedException {
        formatoMensajeProceso(true, "interior carroceri", iteradorCarro);
        TimeUnit.SECONDS.sleep(EjemploPrincipioNoAplicado.TIEMPO_PROCESO_INTERIOR);
        formatoMensajeProceso(false, "interior carroceri", iteradorCarro);

    }

}
