Втора лабораториска вежба по Софтверско инженерство

Мери Бојчевска, индекс: 173116

Control Flow Graph
(https://github.com/mrbjcvsk/SI_2023_lab2_173116/assets/127840817/71c8e3c7-0541-49dc-8299-7eb90780023c)


Цикломатска комплексност
Цикломатската комплексност на овој код е 6, истата ја добив преку броење на региони.

Тест случаи според критериумот Every statement

[Every statement.pdf](https://github.com/mrbjcvsk/SI_2023_lab2_173116/files/11617435/Every.statement.pdf)

Тест случаи според критериумот Every Branch

[EveryBranch.xlsx](https://github.com/mrbjcvsk/SI_2023_lab2_173116/files/14185796/EveryBranch.xlsx)

Објаснување на напишаните unit tests

Доколку сакаме да го тестираме критериумот 
if(user==null || user.getPassword()==null || user.getEmail()==null), 
тогаш имаме 4 тест случаи. 
1. Кога нема да внесеме само user.
   user = null , user.getPassword != null, user.getEmail != null
2. Кога нема да внесеме само password.
    user != null , user.getPassword = null, user.getEmail != null
3. Кога нема да внесеме само емаил.
    user != null , user.getPassword != null, user.getEmail = null
4. Кога ќе внесеме само user и password.
    user != null , user.getPassword != null, user.getEmail = null
5. Кога ќе внесеме само user и email.
    user != null , user.getPassword = null, user.getEmail != null
6. Кога ќе внесеме само password и email.
     user = null , user.getPassword != null, user.getEmail != null
7. Кога нема да внесеме ништо.
     user = null , user.getPassword = null, user.getEmail = null

