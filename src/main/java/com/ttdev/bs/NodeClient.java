package com.ttdev.bs;

import org.apache.cxf.jaxrs.client.WebClient;
import javax.ws.rs.*;

public class NodeClient {
	public static void main(String[] args) {
		WebClient client = WebClient.create("http://localhost/home/?q=es/endpoint");

        //Result result = client.path("node/47").accept("application/xml").get(Result.class);

		client.accept("application/xml");
		client.path("node/47");


		Result node = client.get(Result.class);
        System.out.println(node.getTitle());


	}
}
