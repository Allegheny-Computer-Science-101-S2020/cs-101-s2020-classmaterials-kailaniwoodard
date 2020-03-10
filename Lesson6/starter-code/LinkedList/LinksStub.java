/** LinksStub serves as the driver class for the Linked List project.
*/
public class LinksStub {
	/** The main class for LinksStub.
	*/
	public static void main(String args[]) {
		int links_count = 5;
		int nodes_in_links = 4;
		Links[] link_arr = new Links[links_count];

		for (int i = 0; i < link_arr.length; i++){
			Links link = new Links();
			int pos = 0;

			for (int j = nodes_in_links * i; j < nodes_in_links * i + nodes_in_links; j++){
				link.insertNode(pos, j);
				pos++;
			}

			link_arr[i] = link;
		}

		for (int i = 0; i < link_arr.length; i++){
			link_arr[i].displayNodes();
		}

		link_arr[0].removeNode(3);
		link_arr[1].removeNode(5);
		link_arr[4].removeNode(19);

		for (int i = 0; i < link_arr.length; i++){
			link_arr[i].displayNodes();
		}

		link_arr[0].findNode(3);

	}
}
