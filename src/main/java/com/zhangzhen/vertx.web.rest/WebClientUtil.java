package com.zhangzhen.vertx.web.rest;

import io.vertx.ext.web.client.WebClient;

public class WebClientUtil {

  WebClient client;
  WebClientUtil(WebClient client) {
    this.client = client;
  }

  public void getByURL(String url) {
    try {
      client
        .get(8888, url, "/")
        .send()
        .onSuccess(response -> System.out
          .println("Received response with status code" + response.statusCode()))
        .onFailure(err ->
          System.out.println("Something went wrong " + err.getMessage()));
    }catch (Exception e) {
      e.printStackTrace();
    }
  }




}
