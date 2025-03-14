package Telephony_05;

import java.util.List;
import java.util.stream.Collectors;

public class Smartphone implements Callable, Browsable{
    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls){
        this.numbers=numbers;
        this.urls=urls;
    }


    @Override
    public String browse() {
        StringBuilder sb=new StringBuilder();
        this.urls.stream().
                forEach(url->{
                    if(isValidURL(url)){
                        sb.append("Browsing: ").append(url).append("!").append(System.lineSeparator());
                    }else {
                        sb.append("Invalid URL!");
                    }
                });
        return sb.toString();
    }

    @Override
    public String call() {
        StringBuilder sb=new StringBuilder();
        this.numbers.stream()
                .forEach(numbers->{
                    if(isValidNumber(numbers)){
                        sb.append("Calling... ")
                                .append(numbers).append(System.lineSeparator());
                    }else {
                        sb.append("Invalid number!");
                    }
                });
        return sb.toString();
    }

    private  boolean isValidNumber(String number){
        for (int i = 0; i < number.length(); i++) {
            if(Character.isLetter(number.charAt(i))){
                return false;
            }
        }
        return true;
    }

    private boolean isValidURL(String url){
        for (int i = 0; i < url.length(); i++) {
            if(Character.isDigit(url.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
