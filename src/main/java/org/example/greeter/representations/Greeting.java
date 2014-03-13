package org.example.greeter.representations;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Greeting")
@XmlAccessorType(XmlAccessType.FIELD)
public class Greeting {
  @XmlAttribute
  public String text;
}
