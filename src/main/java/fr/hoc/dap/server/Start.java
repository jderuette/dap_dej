package fr.hoc.dap.server;

import java.io.IOException;
import java.security.GeneralSecurityException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mortbay.log.Log;

/**
 * @author djer1
 *
 */
public class Start {
    
    private static final Logger LOG = LogManager.getLogger();
    

    /**
     * @param args
     * @throws GeneralSecurityException 
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException, GeneralSecurityException {

        LOG.info("Salut le monde");

        LOG.error("Ceci est une erreur");

        LOG.debug("Ceci est un bug ?");

        System.out.println("Hello world 2");
        //System.out.println();      

        GmailQuickstart.main();
    }

}
