package com.example.logonrm.configuracaopersonagem

enum class TipoPersonagemEnum(val id: Int){
    ANAO(0),
    ELFO(1),
    MAGO(2),
    GUERREIRO(3);

    companion object {
        fun from(findValue: Int): TipoPersonagemEnum = values().first{it.id == findValue}
    }
}