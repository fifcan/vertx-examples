package io.vertx.example;

import java.net.InetAddress;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;

public class HelloWorldVerticle extends AbstractVerticle {

  @Override
  public void start() throws Exception {
    vertx.createHttpServer()
      .requestHandler(req -> {
        req.response().end("Hello World! " + Thread.currentThread().getName() + " " + this.deploymentID());
      })
      .listen(8080);
  }
}

