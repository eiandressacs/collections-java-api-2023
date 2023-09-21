package mainjava.map.Ordenacao;

import javax.swing.plaf.PanelUI;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEvento {
    // atributos: Key LocalDate do valor Evento
    private static Map<LocalDate, Evento> eventoMap;

    public AgendaEvento() {
        this.eventoMap = new HashMap<>();
    }

    public static void adicionarEventos(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento() {
        // Esse metoto vai dar o proximo evento que vai acontecer usando o TreeMap para organizar na ordem crescente
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for ( Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O proximo evento: " + proximoEvento +  " acontecera na data "  + proximaData);
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();

        AgendaEvento.adicionarEventos(LocalDate.of(2023, Month.FEBRUARY, 21), "Evento 1", "Atração 1");
        AgendaEvento.adicionarEventos(LocalDate.of(2022, Month.JANUARY, 12), "Evento 2", "Atração 2");
        AgendaEvento.adicionarEventos(LocalDate.of(2021, Month.JULY, 7), "Evento 3", "Atração 3");
        AgendaEvento.adicionarEventos(LocalDate.of(2024, Month.OCTOBER, 22), "Evento 4", "Atração 4");

        agendaEvento.exibirAgenda();

        agendaEvento.obterProximoEvento();

    }
}
