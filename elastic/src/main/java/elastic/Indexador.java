package elastic;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;

public class Indexador {
	
	public static void main(String[] args) {
		Node node = nodeBuilder().node();
		Client client = node.client();
		IndexResponse actionGet = client.prepareIndex("javamagazine", "usuario").setSource("{\"name\":\"Joao\"}").execute().actionGet();
		System.out.println("Foi Criado? "+ actionGet.isCreated());
	}
}
