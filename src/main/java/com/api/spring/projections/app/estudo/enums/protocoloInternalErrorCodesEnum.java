package com.api.spring.projections.app.estudo.enums;

public enum protocoloInternalErrorCodesEnum {



	//400
    E400000("400", "000", "N\u00famero do telefone informado n\u00e3o \u00e9 valido: %s"),

    //404
    E404000("404", "000", "Funcionario não encontrado: %s"),
    E404001("404", "001", "Funcionario não encontrado para delete: %s"),
    E404002("404", "002", "Funcionario não encontrado para atualizar: %s"),
    
  //500
    E500000("500", "000", "Erro interno sem causa mapeada");
 
    private final String errorTypeCode;
    private final String errorcode;
    private final String message;

    protocoloInternalErrorCodesEnum(String errorTypeCode, String errorcode, String message) {
        this.errorTypeCode = errorTypeCode;
        this.errorcode = errorcode;
        this.message = message;
    }

    public String getValue() {
        return this.name();
    }

    public String getErrorcode() {
        return String.format("%s.%s", errorTypeCode, errorcode);
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return String.format("C\u00f3digo da falha: %s = %s.", getErrorcode(), getMessage());
    }
}
