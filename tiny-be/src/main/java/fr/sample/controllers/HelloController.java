package fr.sample.controllers;

import fr.sample.pojo.DummyDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController
{
  @Value("${hello.message:test}")
  private String helloValue= "Default Hello Value";

  @RequestMapping("/api/hello")
  public DummyDTO hello()
  {
    return new DummyDTO(this.helloValue);
  }

}