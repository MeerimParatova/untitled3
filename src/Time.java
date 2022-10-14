public class Time {
    public class Time {
        private int hour;
        private int minutes;
        private int seconds;

        public Time(int hour, int minutes, int seconds) {
            this.hour = hour;
            this.minutes = minutes;
            this.seconds = seconds;
        }
        public void getAllSeconds(){
            System.out.println("seconds= "+hour*3600+minutes*60+seconds);

        }
        public Time (int totalSeconds){
            this.hour = totalSeconds/3600;
            this.minutes = totalSeconds/60%60;
            this.seconds = totalSeconds/1%60;
        }



        public int getHour() {
            return hour;
        }

        public void setHour(int hour) {
            this.hour = hour;
        }

        public int getMinutes() {
            return minutes;
        }

        public void setMinutes(int minutes) {
            this.minutes = minutes;
        }

        public int getSeconds() {
            return seconds;
        }

        public void setSeconds(int seconds) {
            this.seconds = seconds;
        }

        @Override
        public String toString() {
            return "Time{" +
                    "hour=" + hour +
                    ", minutes=" + minutes +
                    ", seconds=" + seconds +
                    '}';
        }
    }
}
