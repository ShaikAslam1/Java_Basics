package com.epamtest;

public class Oracle {
    /*

         aabbcccccddffff

         String input = "aabbccccddffff";
         StringBuilder result  = new StringBuilder();
         char ch = input.charAt[0];
         int count=1;
         int count2=0;

         char ch2;

         for (int i=1; i<input.length(); i++) {

         	if (input.charAt[i] == ch) {
         	count++;
         		}
         	else {
         		if (count > count2) {
         			count2 = count;
         			ch2 = ch;
         		}
         		ch = charAt[i];
         		count = 1;
         	}
         }

         sout(ch2 + " " + count2)


         // employee - emp_id, emp_name, emp_salary

         SELECT emp_name FROM employee
         Order by emp_salary DESC
         LIMIT 1 OFFSET 2-1;

         // location

         // duplicates in emp_id
         /*
         111, Ravi, 1000
         222, Rafiq, 2000
         333, Rakesh, 3000
         222, Akash, 4000
         /*

         SELECT emp_id, count(*) FROM employee
         GROUP BY emp_id HAVING count(*) > 1;
     */
}
