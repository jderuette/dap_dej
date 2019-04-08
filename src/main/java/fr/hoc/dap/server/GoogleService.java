/**
 * 
 */
package fr.hoc.dap.server;

import java.io.IOException;
import java.util.Collections;

import com.google.api.client.auth.oauth2.AuthorizationCodeFlow;
import com.google.api.client.auth.oauth2.StoredCredential;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.DataStore;
import com.google.api.client.util.store.DataStoreFactory;
import com.google.api.services.gmail.GmailScopes;

/**
 * @author djer1
 *
 */
public class GoogleService {
    
    private static final DataStoreFactory DATA_STORE_FACTORY = null;
    HttpTransport httpTransport;
    JsonFactory jsonFactory = JacksonFactory.getDefaultInstance();

    protected AuthorizationCodeFlow getFlow() throws IOException {
      return new GoogleAuthorizationCodeFlow.Builder(
          new NetHttpTransport(), JacksonFactory.getDefaultInstance(),
          "[[ENTER YOUR CLIENT ID]]", "[[ENTER YOUR CLIENT SECRET]]",
          Collections.singleton(GmailScopes.GMAIL_READONLY)).setDataStoreFactory(
          DATA_STORE_FACTORY).setAccessType("offline").build();
    }
    
    public DataStore<StoredCredential> getUsers() throws IOException {
        AuthorizationCodeFlow flow = getFlow();
        
        return flow.getCredentialDataStore();
    }
    

}
