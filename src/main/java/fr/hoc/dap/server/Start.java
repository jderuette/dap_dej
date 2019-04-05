package fr.hoc.dap.server;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author djer1
 *
 */
@SpringBootApplication
public class Start {
    

    /**
     * @param args
     * @throws GeneralSecurityException 
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException, GeneralSecurityException {
        SpringApplication.run(Start.class, args);
    }

}
