package br.usp.icmc.dilvan.swrlEditor.client.javafx;

import br.usp.icmc.dilvan.swrlEditor.client.javafx.data.EntityData;
import edu.stanford.smi.protege.event.Event;

//import edu.stanford.bmir.protege.web.client.rpc.data.EntityData;


public interface OntologyEvent extends Event {

	public EntityData getEntity();

	public int getRevision();

	public int getType();

	public String getUser();

}
