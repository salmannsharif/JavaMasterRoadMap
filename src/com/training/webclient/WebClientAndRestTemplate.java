package com.training.webclient;

public class WebClientAndRestTemplate {
    public static void main(String[] args) {
        // Using webclient
//        WebClient webClient = WebClient.create("https://api.api-ninjas.com/v1/commodityprice?name=platinum");
//        String response =  webClient
//                .get()
//                .header("X-Api-Key", "1goPEJbAms9+2jdsB0c3SQ==Rk3PjnBtpyMzoFcv")
//                .retrieve()
//                .bodyToMono(String.class)
//                .block();
//        System.out.println(response);

        // Using RestTemplate
//        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.api-ninjas.com/v1/interestrate";
//        HttpHeaders headers = new HttpHeaders();
//        headers.set("X-Api-Key", "1goPEJbAms9+2jdsB0c3SQ==Rk3PjnBtpyMzoFcv");

//        HttpEntity<String> entity = new HttpEntity<>(headers);
//        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
//        System.out.println(responseEntity.getBody());


//        String apiKey = " CC8R3WLE3Y1ZMC7Z";  // Replace with your actual API key
//        String symbol = "IBM";
//        String interval = "5min";
//        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_INTRADAY"
//                + "&symbol=" + symbol
//                + "&interval=" + interval
//                + "&apikey=" + apiKey;
//
//        OkHttpClient client = new OkHttpClient();
//
//        Request request = new Request.Builder()
//                .url(url)
//                .get()
//                .build();
//
//        try (Response response = client.newCall(request).execute()) {
//            System.out.println(response.body().string());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//        OkHttpClient client = new OkHttpClient();
//        // Define the media type for form encoding
//        MediaType mediaType = MediaType.parse("application/x-www-form-urlencoded");
//        // Create the request body with form parameters
//        String requestBodyContent = "client_id=0z6ohrjwux7t6sbu&client_secret=UQAwHYJp&grant_type=client_credentials&scope=emsi_open";
//        RequestBody body = RequestBody.create(mediaType, requestBodyContent);
//        // Build the request
//        Request request = new Request.Builder()
//                .url("https://auth.emsicloud.com/connect/token")
//                .post(body)
//                .addHeader("Content-Type", "application/x-www-form-urlencoded")
//                .build();
//        // Execute the request and handle the response
//        try (Response response = client.newCall(request).execute()) {
//            if (!response.isSuccessful()) {
//                throw new IOException("Unexpected code " + response);
//            }
//            // Print the response body
//            System.out.println(response.body().string());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
