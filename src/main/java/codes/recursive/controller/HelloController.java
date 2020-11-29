package codes.recursive.controller;

import io.micronaut.http.annotation.*;

@Controller("/hello")
public class HelloController {

  @Get(uri = "/", produces = "text/plain")
  public String index() {
    return "Example Response";
  }

  @Get("/version")
  public HttpResponse<Map> getVersion() {
    return HttpResponse.ok(Map.of("version", "0.1"));
  }
}
