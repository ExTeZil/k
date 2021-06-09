package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Meeting> meetingArrayList = new ArrayList<>();
        meetingArrayList.add(new Meeting(LocalDate.of(2020, 3, 1), "f", 3, "sdfg", "sdfg"));
        int scan;
        do {
            System.out.println("1.Додати лекцію" +
                    "\n2.Вивести всі лекції"+
                    "\n3.Середня кількість учасників на засіданні");
            scan = scanner.nextInt();

                switch (scan) {
                    case 1: {
                        try {
                            Scanner scanner1 = new Scanner(System.in);
                            System.out.println("Введіть тему лекції");
                            String topic = scanner1.next();
                            System.out.println("Введіть рік");
                            int year = scanner.nextInt();
                            System.out.println("Ведіть місяць");
                            int month = scanner1.nextInt();
                            System.out.println("Введіть день");
                            int day = scanner1.nextInt();
                            System.out.println("Введіть кількість студентів");
                            int kilkistOfStuents = scanner1.nextInt();

                            System.out.println("Введіть назву конференції");
                            String title = scanner1.next();
                            System.out.println("Введіть місце проведення");
                            String location = scanner1.next();

                            if (year != 2021)throw new Exception("Неправильно введений рік");
                            if(month<=0||month>12)throw new Exception("Неправильно введений місяць");
                            if(day<=0||day>30)throw new Exception("Неправильно введений день");

                            meetingArrayList.add(new Meeting(LocalDate.of(year,month,day),topic,kilkistOfStuents,location,title));
                        }
                        catch (Exception e){
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                    case 2:
                    {
                        for (var meetig:meetingArrayList) {
                            System.out.println(meetig.toString());
                        }
                    }
                    break;
                    case 3:{
                        int users = 0;
                        for (var k:meetingArrayList) {
                            users = users + k.getNumberOfParticipants();
                        }
                        int rezult = users/meetingArrayList.size();
                        System.out.println("Середня кількість студентів "+ rezult);
                    }
                        break;
                }
            }
        while (scan != 10);
    }
}