package timeofday_oop;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TimeOfDayTest {
    @Test
    void test() {
        // Nesne oluştur ve kontrol et
        TimeOfDay t = new TimeOfDay(2, 30);
        assertEquals(2, t.getHours());
        assertEquals(30, t.getMinutes());
        assertEquals(150, t.getMinutesSinceMidnight());

        // setHours test et
        t.setHours(3);
        assertEquals(3, t.getHours());
        assertEquals(30, t.getMinutes()); // dakika değişmemeli

        // setMinutes test et
        t.setMinutes(0);
        assertEquals(3, t.getHours()); // saat değişmemeli
        assertEquals(0, t.getMinutes());

        // setMinutesSinceMidnight test et
        t.setMinutesSinceMidnight(150);
        assertEquals(2, t.getHours());
        assertEquals(30, t.getMinutes());
    }
}