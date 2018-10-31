package ua.sumdu.j2se.Birintsev;

public class Hobby {

    /**
     * daysPerWeek - количество дней в неделе, когда уделяется время хобби
     * years - количество лет, прошедших с начала активности
     * hoursPerDay - количество часов, уделяемых хобби в день
     * totalHours - всего времени, которое было уделено занятию
     * averageValue - значение рабочего веса спортсмена/средний улов за день рыбака/
     *                время преодоления дистанции легкоатлета/
     *                любая другая средняя величина, характеризующая увлечение
     * recordValue - рекордное значение averageValue
     * isRegular - является ли занятие регулярным
     * teamSymbol - символ команды (например первая буква названия), если человек является членом таковой (спорт/рыбалка/пейнтбол и т.д.)
     * *
     */

    private byte daysPerWeek;

    private short years;

    private int hoursPerDay;

    private long totalHours;

    private float averageValue;

    private double recordValue;

    private boolean isRegular;

    private char teamSymbol;

    private String name;

    public Hobby() {
    }

    Hobby(String name, boolean isRegular, float averageValue, double recordValue){

        this.name = name;

        this.isRegular = isRegular;

        this.averageValue = averageValue;

        this.recordValue = recordValue;

    }

    Hobby(String name, boolean isRegular, float averageValue){

        this.name = name;

        this.isRegular = isRegular;

        this.averageValue = averageValue;

    }

    Hobby(String name, int hoursPerDay){

        this.name = name;

        this.hoursPerDay = hoursPerDay;

    }

    Hobby(String name){

        this.name = name;

    }

    public byte getDaysPerWeek() {

        return daysPerWeek;

    }

    public void setDaysPerWeek(byte daysPerWeek) {

        this.daysPerWeek = daysPerWeek;

    }

    public short getYears() {

        return years;

    }

    public void setYears(short years) {

        this.years = years;

    }

    public int getHoursPerDay() {

        return hoursPerDay;

    }

    public void setHoursPerDay(int hoursPerDay) {

        this.hoursPerDay = hoursPerDay;

    }

    public long getTotalHours() {

        return totalHours;

    }

    public void setTotalHours(long totalHours) {

        this.totalHours = totalHours;

    }

    public float getAverageValue() {

        return averageValue;

    }

    public void setAverageValue(float averageValue) {

        this.averageValue = averageValue;

    }

    public double getRecordValue() {

        return recordValue;

    }

    public void setRecordValue(double recordValue) {

        this.recordValue = recordValue;

    }

    public boolean isRegular() {

        return isRegular;

    }

    public void setRegular(boolean regular) {

        isRegular = regular;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void tellAboutHobby(){

        if(name == null){

            return;

        }

        String info = new String("Hobby: " + name);

        info += "\nRegular: " + isRegular;

        if(daysPerWeek != 0){

            info += "\nActivities per week: " + daysPerWeek + " times";

        }

        if(years != 0){

            info += "\nExperience: " + years + " years";

        }

        if(hoursPerDay != 0){

            info += "\nDuration of an activity: " + hoursPerDay + " hours";

        }

        if(totalHours != 0){

            info += "\nTotal spent hours: " + totalHours + " hours";

        }

        if(averageValue != 0){

            info += "\nAverage value: " + averageValue + " units";

        }

        if(recordValue != 0){

            info += "\nRecord value: " + recordValue + " units";

        }

        System.out.println(info + '\n');

    }

    @Override
    public String toString() {

        return name;

    }



}
