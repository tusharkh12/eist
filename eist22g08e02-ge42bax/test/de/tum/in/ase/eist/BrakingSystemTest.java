package de.tum.in.ase.eist;

import org.easymock.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(EasyMockExtension.class)
class BrakingSystemTest {

	@TestSubject
	private BrakingSystem brakingSystem=new BrakingSystem();

	@Mock(fieldName = "distanceSensor")
	private Sensor distanceSensor;

	@Mock(fieldName = "speedSensor")
	private Sensor speedSensor;

	@Mock(fieldName = "brakingPedal")
	private Sensor brakingPedal;

	@Mock
	private ABS abs;

	@Mock
	private Brake brake;

	@Test
	void testBrakeProcess() {
		expect(distanceSensor.sense()).andReturn(0.5);
		replay(distanceSensor);
		expect(speedSensor.sense()).andReturn(100.);
		replay(speedSensor);
		expect(abs.shouldOverrideBrake()).andReturn(false);
		replay(abs);
		expect(brakingPedal.sense()).andReturn(1.0);
		replay(brakingPedal);
		brakingSystem.calculateNextFrame();
		//brake.brake(0.75);



		assertFalse(brakingSystem.isAbsWarning());
		verify(distanceSensor,speedSensor,brakingPedal,abs);
	}

	@Test
	void testABSWarning() {

		expect(distanceSensor.sense()).andReturn(0.5);
		replay(distanceSensor);
		expect(speedSensor.sense()).andReturn(100.);
		replay(speedSensor);
		expect(abs.shouldOverrideBrake()).andReturn(true);
		replay(abs);

		brakingSystem.calculateNextFrame();
		//brake.brake(0.75);



		assertTrue(brakingSystem.isAbsWarning());
		verify(distanceSensor,speedSensor,abs);
//		verify(speedSensor);
//		verify(brakingPedal);
//		verify(abs);



	}

}
