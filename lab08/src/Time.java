public class Time {

    private int myHours;
    private int myMinutes;

    public Time(String s) {
        try {
            int colonPos = s.indexOf(":");
            myHours = Integer.parseInt(s.substring(0, colonPos));
            myMinutes = Integer.parseInt(s.substring(colonPos + 1));
            if (myHours > 24 || myHours < 0 || myMinutes < 0 || myMinutes > 60) {
                throw new SecurityException();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public Time(int hours, int minutes) {
        try {
            if (hours > 24 || hours < 0 || minutes < 0 || minutes > 60) {
                throw new SecurityException();
            }
            myHours = hours;
            myMinutes = minutes;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public boolean equals(Object obj) {
        Time t = (Time) obj;
        return myHours == t.myHours && myMinutes == t.myMinutes;
    }

    public String toString() {
        if (myMinutes < 10) {
            return myHours + ":0" + myMinutes;
        } else {
            return myHours + ":" + myMinutes;
        }
    }
}
