package fr.sample.pojo;

import com.fasterxml.jackson.annotation.JsonView;
import fr.sample.views.StandardView;

/** A Dummy DTO. */
public class DummyDTO
{
  /** A value. */
  @JsonView(StandardView.class)
  private String value;

  /**
   * A dummy constructor.
   *
   * @param pValue
   *     a value
   */
  public DummyDTO(final String pValue)
  {
    this.value = pValue;
  }
}