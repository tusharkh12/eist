package de.tum.in.ase.eist;

import org.easymock.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(EasyMockExtension.class)
class ABSTest {
	@TestSubject
	private ABS abs;

	@Mock
	private Sensor tractionSensor;

	@Test
	void testShouldNotOverrideBreakOnHighTraction() {

		expect(tractionSensor.sense()).andReturn(2.);
		replay(tractionSensor);

		assertFalse(abs.shouldOverrideBrake());

		verify(tractionSensor);
	}

	@Test
	void testShouldOverrideBreakOnLowTraction() {
		expect(tractionSensor.sense()).andReturn(0.02);
		replay(tractionSensor);

		assertTrue(abs.shouldOverrideBrake());

		verify(tractionSensor);
	}
}
