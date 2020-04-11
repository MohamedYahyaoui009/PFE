package com.SeQuorStudent.demo.model;

public class Date
{
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    public Date()
    {
        this(1,1,0);
    }

    public boolean Valide()
    {
        if(this.year>=0 && this.month>0 && this.month<=12 && this.day>0)
        {
            switch(this.month)
            {
                case 2 :
                    if(this.day>29)
                    {
                        return false;
                    }
                    break;
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 12:
                    if(this.day>31)
                    {
                        return false;
                    }
                    break;
                default :
                    if(this.day>30)
                    {
                        return false;
                    }
            }
            return true;
        }
        return false;
    }

    public int Comparer(Date d)
    {
        if(this.year==d.year)
        {
            if(this.month==d.month)
            {
                if(this.day==d.day)
                {
                    return 0;
                }
                else
                {
                    if(this.day>d.day)
                    {
                        return 1;
                    }
                    return -1;
                }
            }
            else
            {
                if(this.month>d.month)
                {
                    return 1;
                }
                return -1;
            }
        }
        else
        {
            if(this.year>d.year)
            {
                return 1;
            }
            return -1;
        }
    }

    public boolean Verifier(Date d)
    {
        return this.year==d.year;
    }

    public String toString()
    {
        String str=new String();
        str=this.day+"/"+this.month+"/"+this.year ;
        return str;
    }
}

