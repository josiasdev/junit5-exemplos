package com.github.josiasdev;

import java.util.logging.Logger;

public class BancoDeDados {

    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexao");
    }

    public static void finalizarConexao(){
        LOGGER.info("Finalizou conexao");
    }

    public static void insereDados(Pessoa pessoa){
        //insere pessoa no Banco de Dados
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa){
        //remove pessoa no Banco de Dados
        LOGGER.info("Removeu dados");
    }

}