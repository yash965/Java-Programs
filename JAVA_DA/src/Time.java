class Time {
    int hours;
    long minutes;
    long seconds;
    Time() {
    hours = 0;
    minutes = 0;
    seconds = 0;
    }
    Time(int hours) {
    this.hours = hours;
    minutes = 0;
    seconds = 0;
    }
    Time(int hours, long minutes) {
    this.hours = hours;
    this.minutes = minutes;
    seconds = 0;
    }
    Time(int hours, long minutes, long seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
    }
    void Print() {
    System.out.println("Hours - " + hours);
    System.out.println("Minutes - " + minutes);
    System.out.println("seconds - " + seconds);
    }
    Time AddTwoTimes(Time t1, Time t2) {
        Time Total = new Time();
        Total.hours = t1.hours+t2.hours;
        Total.minutes = t1.minutes+t2.minutes;
        Total.seconds = t1.seconds+t2.seconds;
        if(Total.seconds >= 60) {
        Total.minutes += Total.seconds/60;
        Total.seconds = Total.seconds%60;
        }
        if(Total.minutes >= 60) {
        Total.hours += Total.minutes/60;
        Total.minutes = Total.minutes%60;
        }return Total;
    }
    Time SubtractTwoTimes(Time t1, Time t2) {
    Time Total = new Time();
    if(t1.hours > t2.hours) {
    Total.hours = t1.hours-t2.hours;
    if(t1.minutes < t2.minutes)
    {
    Total.hours--;
    Total.minutes = 60 - (t2.minutes - t1.minutes);
    } else {
    Total.minutes = t1.minutes-t2.minutes;
    }
    if(t1.seconds < t2.seconds) {
    Total.minutes--;
    Total.seconds = 60 - (t2.seconds - t1.seconds);
    } else {
    Total.seconds = t1.seconds-t2.seconds;
    }
    } else {
    if(t1.hours < t2.hours) {
    Total.hours = t2.hours-t1.hours;
    if(t1.minutes > t2.minutes)
    {
    Total.hours--;
    Total.minutes = 60 - (t1.minutes - t2.minutes);
    } else {
    Total.minutes = t2.minutes-t1.minutes;
    }
    //seconds
    if(t1.seconds > t2.seconds) {
    Total.minutes--;
    Total.seconds = 60 - (t1.seconds - t2.seconds);
    } else {
    Total.seconds = t2.seconds-t1.seconds;
    }
    }
    }
    return Total;
    }
    public static void main(String[] args) {
    Time ti1 = new Time(16);
    Time ti2 = new Time(9,40,20);ti1.Print();
    ti2.Print();
    Time Total = new Time();
    System.out.println("Subtraction of two above times - ");
    Total = Total.SubtractTwoTimes(ti1, ti2);
    Total.Print();
    Time ti3 = new Time(15, 55, 20);
    Time ti4 = new Time(5, 6, 40);
    ti3.Print();
    ti4.Print();
    System.out.println("Addition of two above times - ");
    Total = Total.AddTwoTimes(ti3, ti4);
    Total.Print();
    }
    }