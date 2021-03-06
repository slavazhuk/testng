package test.factory;

import org.testng.annotations.Factory;

public class NonPublicFactory {

  @Factory
  private Object[] createInstances() {
    return new Object[] {new BaseFactorySample(42), new BaseFactorySample(43)};
  }
}
