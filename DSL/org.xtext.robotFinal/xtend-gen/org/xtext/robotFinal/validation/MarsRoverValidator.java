/**
 * generated by Xtext 2.12.0
 */
package org.xtext.robotFinal.validation;

import com.google.common.base.Objects;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.robotFinal.generator.MarsRoverGenerator;
import org.xtext.robotFinal.marsRover.Robot;
import org.xtext.robotFinal.marsRover.detect_lakes;
import org.xtext.robotFinal.marsRover.ultra;
import org.xtext.robotFinal.validation.AbstractMarsRoverValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class MarsRoverValidator extends AbstractMarsRoverValidator {
  @Check
  public void checkNumberOfLakes(final detect_lakes dl) {
    int _length = ((Object[])Conversions.unwrapArray(dl.getLakes_colors(), Object.class)).length;
    int _number_of_lakes = dl.getNumber_of_lakes();
    boolean _notEquals = (_length != _number_of_lakes);
    if (_notEquals) {
      this.error("Number of lakes must match number of corresponding colors", null);
    }
  }
  
  @Check
  public void macValidation(final Robot r) {
    int _length = r.getSlave_address().length();
    boolean _notEquals = (_length != 12);
    if (_notEquals) {
      this.error("MAC must be 12 hexa decimal characters long", null);
    }
  }
  
  @Check
  public void checkSpeeds(final Robot r) {
    int _drive_speed = r.getDrive_speed();
    int _special_speed = r.getSpecial_speed();
    boolean _equals = (_drive_speed == _special_speed);
    if (_equals) {
      this.warning("Special and drive speeds are the same, you might want them different", null);
    }
  }
  
  @Check
  public void checkUltrasonicDistance(final ultra u) {
    if (((u.getDistance() < 5) && (u.getDistance() > 255))) {
      this.error("Distance out of bounds [5, 255]", null);
    }
  }
  
  @Check
  public void checkSameMissions(final Robot r) {
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(r.getMissions(), Object.class)).length); i++) {
      for (int j = 0; (j < ((Object[])Conversions.unwrapArray(r.getMissions(), Object.class)).length); j++) {
        {
          if ((Objects.equal(MarsRoverGenerator.typeToText(r.getMissions().get(i).getType()), MarsRoverGenerator.typeToText(r.getMissions().get(j).getType())) && (i != j))) {
            this.error("Duplicate of mission found", null);
          }
          if ((Objects.equal(MarsRoverGenerator.typeToText(r.getMissions().get(i).getType()), "avoid_lakes") && 
            Objects.equal(MarsRoverGenerator.typeToText(r.getMissions().get(j).getType()), "detect_lakes"))) {
            this.error("Cannot detect and avoid lakes at the same time", null);
          }
          if ((Objects.equal(MarsRoverGenerator.typeToText(r.getMissions().get(i).getType()), "avoid_obstacles") && 
            Objects.equal(MarsRoverGenerator.typeToText(r.getMissions().get(j).getType()), "push_obstacles"))) {
            this.error("Cannot push and avoid obstacles at the same time", null);
          }
          if ((Objects.equal(MarsRoverGenerator.typeToText(r.getMissions().get(i).getType()), "detect_rocks") && 
            Objects.equal(MarsRoverGenerator.typeToText(r.getMissions().get(j).getType()), "push_obstacles"))) {
            this.error("Cannot push and detect rocks at the same time", null);
          }
          if ((Objects.equal(MarsRoverGenerator.typeToText(r.getMissions().get(i).getType()), "detect_rocks") && 
            Objects.equal(MarsRoverGenerator.typeToText(r.getMissions().get(j).getType()), "avoid_obstacles"))) {
            this.error("Cannot avoid and detect rocks at the same time", null);
          }
        }
      }
    }
  }
}