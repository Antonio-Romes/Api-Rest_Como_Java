package com.webapi.br.LogError;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class SaveErrorLog {
	 @ExceptionHandler(Exception.class)
	  public ResponseEntity<String> handleException(Exception e) {
		 Date data = new Date();
		 SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		 String dataFormatada = formato.format(data);
	    try (FileWriter fw = new FileWriter("C:\\Users\\Antonio\\Desktop\\Java-Estudo\\webApi\\src\\main\\java\\com\\webapi\\br\\LogError\\Log\\"+dataFormatada+".txt", true);
	         PrintWriter pw = new PrintWriter(fw)) {
	    	  formato = new SimpleDateFormat("yyyy-MM-dd HH:mm");
			   dataFormatada = formato.format(data);
	    	 pw.println("Data: "+ dataFormatada);
	      pw.println("Mensagem: "+e.getMessage());
	      pw.println("");
	      pw.println("-------------------------------");
	      pw.println("");
	    } catch (IOException ex) {
	      // handle exception
	    }
	    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro interno do servidor");
	  }
}
