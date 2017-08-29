package get_request;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/*
 * OkHTTP is an open source project designed to be an efficient HTTP client. It supports the SPDY protocol. 
 * SPDY is the basis for HTTP 2.0 and allows multiple HTTP requests to be multiplexed over one socket connection
 */
public class FacebookGetMeFeed {
	
	public void fb_get_request_me_feed() throws IOException{
		OkHttpClient client = new OkHttpClient();

		MediaType mediaType = MediaType.parse("application/octet-stream");
		RequestBody body = RequestBody.create(mediaType, "Etiam mi lacus, cursus vitae felis et, blandit pellentesque neque. Vestibulum eget nisi a tortor commodo dignissim.\nQuisque ipsum ligula, faucibus a felis a, commodo elementum nisl. Mauris vulputate sapien et tincidunt viverra. Donec vitae velit nec metus.");
		Request request = new Request.Builder()
		  .url("https://graph.facebook.com/me/feed?access_token=EAACEdEose0cBAIy5Kit04ZBzSF7sMBnxWmeTy23x8ufHZCCEkBCSqsr1nUFR3Fil96sMrfxdtLQBWQnEObA447UIPIX9zqLmgDtt76jrIBxEetLInyD5A1ONJEEJrBkr7WKNAopgFAuIMPfSsuSmO7cLAN4CEky6EZAtYLJ5qGXZB9EXJe0Gb75hi8dkCIrC6OSyvGXVNAZDZD")
		  .get()
		  .addHeader("cache-control", "no-cache")
		  .addHeader("postman-token", "49c4950d-2a23-5901-e335-556156811e68")
		  .build();

		Response response = client.newCall(request).execute();
	}
	
}
