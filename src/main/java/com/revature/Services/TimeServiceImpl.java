package com.revature.Services;

import org.springframework.stereotype.Service;

@Service
public class TimeServiceImpl implements TimeService {

	@Override
	public String getTimeInWords(int h, int m) {
		String str;
        int tempMin = 0, tempHour = h;
        
        if (m == 0) {
            str = " o' clock";
        } else if (m < 30 && m > 0) {
            tempMin = m;
            str = " past ";
        } else if (m == 30) {
        	tempMin = 30;
            str = "half past ";
        } else if (m > 30 && m < 60) {
            tempMin = 60 - m;
            tempHour++;
            str = " to ";
        } else {
            return "I don't know what you've done, but it's broken now.";
        }
        
        switch(tempHour) {
            case 1:
                if (tempMin == 0) {
                    str = "one" + str;
                } else {
                    str = str + "one";
                }
                break;
            case 2:
                if (tempMin == 0) {
                    str = "two" + str;
                } else {
                    str = str + "two";
                }
                break;
            case 3:
                if (tempMin == 0) {
                    str = "three" + str;
                } else {
                    str = str + "three";
                }
                break;
            case 4:
                if (tempMin == 0) {
                    str = "four" + str;
                } else {
                    str = str + "four";
                }
                break;
            case 5:
                if (tempMin == 0) {
                    str = "five" + str;
                } else {
                    str = str + "five";
                }
                break;
            case 6:
                if (tempMin == 0) {
                    str = "six" + str;
                } else {
                    str = str + "six";
                }
                break;
            case 7:
                if (tempMin == 0) {
                    str = "seven" + str;
                } else {
                    str = str + "seven";
                }
                break;
            case 8:
                if (tempMin == 0) {
                    str = "eight" + str;
                } else {
                    str = str + "eight";
                }
                break;
            case 9:
                if (tempMin == 0) {
                    str = "nine" + str;
                } else {
                    str = str + "nine";
                }
                break;
            case 10:
                if (tempMin == 0) {
                    str = "ten" + str;
                } else {
                    str = str + "ten";
                }
                break;
            case 11:
                if (tempMin == 0) {
                    str = "eleven" + str;
                } else {
                    str = str + "eleven";
                }
                break;
            case 12:
                if (tempMin == 0) {
                    str = "twelve" + str;
                } else {
                    str = str + "twelve";
                }
                break;
            default:
                return "I don't know what you've done, but it's broken now.";
        }
        
        switch(tempMin) {
            case 1:
                str = "one minute" + str;
                break;
            case 2:
                str = "two minutes" + str;
                break;
            case 3:
                str = "three minutes" + str;
                break;
            case 4:
                str = "four minutes" + str;
                break;
            case 5:
                str = "five minutes" + str;
                break;
            case 6:
                str = "six minutes" + str;
                break;
            case 7:
                str = "seven minutes" + str;
                break;
            case 8:
                str = "eight minutes" + str;
                break;
            case 9:
                str = "nine minutes" + str;
                break;
            case 10:
                str = "ten minutes" + str;
                break;
            case 11:
                str = "eleven minutes" + str;
                break;
            case 12:
                str = "twelve minutes" + str;
                break;
            case 13:
                str = "thirteen minutes" + str;
                break;
            case 14:
                str = "fourteen minutes" + str;
                break;
            case 15:
                str = "quarter" + str;
                break;
            case 16:
                str = "sixteen minutes" + str;
                break;
            case 17:
                str = "seventeen minutes" + str;
                break;
            case 18:
                str = "eighteen minutes" + str;
                break;
            case 19:
                str = "nineteen minutes" + str;
                break;
            case 20:
                str = "twenty minutes" + str;
                break;
            case 21:
                str = "twenty one minutes" + str;
                break;
            case 22:
                str = "twenty two minutes" + str;
                break;
            case 23:
                str = "twenty three minutes" + str;
                break;
            case 24:
                str = "twenty four minutes" + str;
                break;
            case 25:
                str = "twenty five minutes" + str;
                break;
            case 26:
                str = "twenty six minutes" + str;
                break;
            case 27:
                str = "twenty seven minutes" + str;
                break;
            case 28:
                str = "twenty eight minutes" + str;
                break;
            case 29:
                str = "twenty nine minutes" + str;
                break;
        }
        
        return str;
	}

}
