public class timeDemo{
    public static void main(String[] arg)
    {
        time t1=new time();
        time t2=new time();

        t1.timeinitialize();
        t2.timeinitialize(3, 54, 22);

        t1.display();
        t2.display();
        t1.timeinitialize(12, 53, 33);
        t1.display();
        System.out.println("The sum of time is \n"+t1.add(t2).hr+":"+t1.add(t2).min+":"+t1.add(t2).sec);
    }
}

class time{
    int hr,min,sec;
    void timeinitialize(){
        hr=0;
        min=0;
        sec=0;
    }
    void timeinitialize(int hr,int min,int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    void display(){
        System.out.println("Time is:\t"+hr+":"+min+":"+sec);
    }
    time add(time t1){
        time t=new time();
        t.sec=this.sec+t1.sec;
        t.min=this.min+t1.min+t.sec/60;
        t.hr=this.hr+t1.hr+t.min/60;

        //managing overflow conditions
        t.sec=t.sec%60;
        t.min=t.min%60;
        //24 hour format
        t.hr=t.hr%24;

        return t;
    }
}
