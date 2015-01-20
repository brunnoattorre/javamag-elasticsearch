package elastic;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.node.Node;

public class Buscador {

	public static void main(String[] args) {
		Node node = nodeBuilder().node();
		Client client = node.client();
		SearchResponse response = client.prepareSearch("javamagazine")
		        .setTypes("autor")
		        .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
		        .setQuery(QueryBuilders.termQuery("name", "Joao")).execute().actionGet();
		System.out.println("O documento achado foi do autor com nome:"+ response.getHits().getAt(0).field("name"));
	}
}
