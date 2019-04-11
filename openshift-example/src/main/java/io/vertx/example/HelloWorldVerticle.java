package io.vertx.example;

import java.net.InetAddress;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class HelloWorldVerticle extends AbstractVerticle {

  @Override
  public void start() throws Exception {
    final String hostName = InetAddress.getLocalHost().getHostName();
    vertx.createHttpServer()
      .requestHandler(req -> {
        req.response().end("Hello World! " + Thread.currentThread().getName() + " " + hostName);
      })
      .listen(8080);
  }
}

