import java.awt.Graphics2D;
import org.junit.Test;
import static org.mockito.Mockito.*;

import com.nw.clock.AnalogClock;

public class AnalogClockTest {
	
	@Test
	public void testDrawCircleLineWithTwelveOClock() {
		Graphics2D graphics2D = mock(Graphics2D.class);
		
		AnalogClock.drawCircleLine(graphics2D, 5, 5, 5, 0, 12, 0., 1.);
		verify(graphics2D).drawLine(5, 5, 5, 0);
	}
	
	@Test
	public void testDrawCircleLineWithSixOClock() {
		Graphics2D graphics2D = mock(Graphics2D.class);
		
		AnalogClock.drawCircleLine(graphics2D, 5, 5, 5, 6, 12, 0., 1.);
		verify(graphics2D).drawLine(5, 5, 5, 10);
	}

	@Test
	public void testDrawCircleLineWithThreeOClock() {
		Graphics2D graphics2D = mock(Graphics2D.class);
		
		AnalogClock.drawCircleLine(graphics2D, 5, 5, 5, 3, 12, 0., 1.);
		verify(graphics2D).drawLine(5, 5, 10, 5);
	}
	
	@Test
	public void testDrawCircleLineWithNineOClock() {
		Graphics2D graphics2D = mock(Graphics2D.class);
		
		AnalogClock.drawCircleLine(graphics2D, 5, 5, 5, 9, 12, 0., 1.);
		verify(graphics2D).drawLine(5, 5, 0, 5);
	}
	
	
	@Test
	public void testDrawCircleLineWithNineOClockFirstHalf() {
		Graphics2D graphics2D = mock(Graphics2D.class);
		
		AnalogClock.drawCircleLine(graphics2D, 5, 5, 5, 9, 12, 0., .5);
		verify(graphics2D).drawLine(5, 5, 2, 5);
	}
	
	@Test
	public void testDrawCircleLineWithNineOClockSecondHalf() {
		Graphics2D graphics2D = mock(Graphics2D.class);
		
		AnalogClock.drawCircleLine(graphics2D, 5, 5, 5, 9, 12, .5, 1.);
		verify(graphics2D).drawLine(2, 5, 0, 5);
	}

}
