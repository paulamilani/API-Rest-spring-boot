package br.com.alura.forum.controller.dto;

import br.com.alura.forum.model.Topico;

import java.util.List;
import java.util.stream.Collectors;

public class TopicoDTO {

    private long id;
    private String titulo;
    private String mensagem;
    private String dataCriacao;

//    construtor
    public TopicoDTO(Topico topico){

        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
        this.dataCriacao = topico.getDataCriacao();
    }

    public static List<TopicoDTO> converter(List<Topico> topicos) {
        return topicos.stream().map(TopicoDTO::new).collect(Collectors.toList());
    }

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }
}
