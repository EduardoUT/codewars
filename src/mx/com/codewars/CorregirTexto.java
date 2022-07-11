/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.codewars;

/**
 * El software de reconocimiento de carácteres se usa ampliamente para
 * digitalizar textos impresos.
 *
 * Por lo tanto, los textos se pueden editar, buscar y almacenar en una
 * computadora.
 *
 * Cuando los documentos (especialmente los bastante antiguos escritos con una
 * máquina de escribir) se digitalizan, los softwares de reconocimiento de
 * carácteres a menudo cometen errores.
 *
 * Tú tarea es corregir los errores en los textos digitalizados. Sólo debes
 * lidiar con los siguientes errores:
 *
 * S es malinterpretado como 5
 *
 * O es malinterpretado como 0
 *
 * I es malinterpretado como 1
 *
 * Los casos de prueba contienen sólo números sólo por error.
 *
 * @author Eduardo Reyes Hernández
 */
public class CorregirTexto {

    public static void main(String[] args) {
        System.out.println(CorregirTexto.corregir("1F-RUDYARD K1PL1NG"));
        System.out.println(CorregirTexto.corregir("R0BERT MERLE - THE DAY 0F THE D0LPH1N"));
        System.out.println(CorregirTexto.corregir("R1CHARD P. FEYNMAN - THE FEYNMAN LECTURE5 0N PHY51C5"));
        System.out.println(CorregirTexto.corregir("R1CHARD P. FEYNMAN - 5TAT15T1CAL MECHAN1C5"));
        System.out.println(CorregirTexto.corregir("5TEPHEN HAWK1NG - A BR1EF H15T0RY 0F T1ME"));
        System.out.println(CorregirTexto.corregir("5TEPHEN HAWK1NG - THE UN1VER5E 1N A NUT5HELL"));
        System.out.println(CorregirTexto.corregir("ERNE5T HEM1NGWAY - A FARWELL T0 ARM5"));
        System.out.println(CorregirTexto.corregir("ERNE5T HEM1NGWAY - F0R WH0M THE BELL T0LL5"));
        System.out.println(CorregirTexto.corregir("ERNE5T HEM1NGWAY - THE 0LD MAN AND THE 5EA"));
        System.out.println(CorregirTexto.corregir("J. R. R. T0LK1EN - THE L0RD 0F THE R1NG5"));
        System.out.println(CorregirTexto.corregir("J. D. 5AL1NGER - THE CATCHER 1N THE RYE"));
        System.out.println(CorregirTexto.corregir("J. K. R0WL1NG - HARRY P0TTER AND THE PH1L050PHER'5 5T0NE"));
        System.out.println(CorregirTexto.corregir("J. K. R0WL1NG - HARRY P0TTER AND THE CHAMBER 0F 5ECRET5"));
        System.out.println(CorregirTexto.corregir("J. K. R0WL1NG - HARRY P0TTER AND THE PR150NER 0F Azkaban"));
        System.out.println(CorregirTexto.corregir("J. K. R0WL1NG - HARRY P0TTER AND THE G0BLET 0F F1RE"));
        System.out.println(CorregirTexto.corregir("J. K. R0WL1NG - HARRY P0TTER AND THE 0RDER 0F PH0EN1X"));
        System.out.println(CorregirTexto.corregir("J. K. R0WL1NG - HARRY P0TTER AND THE HALF-BL00D PR1NCE"));
        System.out.println(CorregirTexto.corregir("J. K. R0WL1NG - HARRY P0TTER AND THE DEATHLY HALL0W5"));
        System.out.println(CorregirTexto.corregir("UR5ULA K. LE GU1N - A W1ZARD 0F EARTH5EA"));
        System.out.println(CorregirTexto.corregir("UR5ULA K. LE GU1N - THE T0MB5 0F ATUAN"));
        System.out.println(CorregirTexto.corregir("UR5ULA K. LE GU1N - THE FARTHE5T 5H0RE"));
        System.out.println(CorregirTexto.corregir("UR5ULA K. LE GU1N - TALE5 FR0M EARTH5EA"));
    }

    public static String corregir(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            char caracterErroneo = texto.charAt(i);
            switch (String.valueOf(caracterErroneo)) {
                case "5":
                    texto = texto.replace(caracterErroneo, 'S');
                    break;
                case "0":
                    texto = texto.replace(caracterErroneo, 'O');
                    break;
                case "1":
                    texto = texto.replace(caracterErroneo, 'I');
                    break;
                default:
                    break;
            }
        }
        return texto;
    }
}
