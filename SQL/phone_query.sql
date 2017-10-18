#1 Select all smartphones in the database;
Select *
From smartphone;

#2 Select all smartphones in the database with projection: name, ram, size and cpu;
Select name, ram, size, cpu
From  smartphone;

#3 Select name of smartphones with display resolution equal to 1080x1920;
Select name
From smartphone 
where displayResolution = '1080x1920';

#4 Select name of smartphones with display resolution equal to 1080x1920 and 3Gb ram;
Select name
From smartphone 
where displayResolution = '1080x1920' AND ram='3Gb';

#5 Select all Galaxy smartphones; 
Select name
From smartphone where name like 'Galaxy%';

#6 Select all Galaxy smartphones with dual-core cpu;
Select name
From smartphone where name like 'Galaxy%' AND cpu like '%ual-core%';

#7 Select all smartphones with weight greater than or equal 150 grams;
Select *
From smartphone where weight>=150;

#8 Select all smartphones with weight less than 150 grams;
Select *
From smartphone where weight<150;

#9 Select all smartphones sorted by display ppi;
Select *
From smartphone
Order By displayPpi;

#10 Select all smartphones descendant sorted by display ppi;
Select *
From smartphone
Order By displayPpi Desc;

#11 Select name and brand of all smartphones in the database;
Select s.name as nome, b.name as brand
from smartphone as s inner join brand as b on s.brand=b.id;

#12 Select name and opSys of all smartphones in the database sorted by opSys, name; 
Select s.name as name, o.description as opsys
From Smartphone as s inner join opSys as o on s.opSys=o.id
order by o.id,s.name;

#13 Select name and opSys of all Android smartphones in the database descendant sorted by weight;
Select s.name as name, o.description as opsys
From Smartphone as s inner join opSys as o on s.opSys=o.id
where o.description='Android'
order by s.weight desc;

#14 Select name, brand, country of all smartphones in the database sorted by country, brand, name;
Select s.name as name, b.name as brand, c.name as country
From smartphone as s inner join brand as b on s.brand=b.id 
					inner join country as c on b.country=c.code
Order By c.name,b.name,s.name;


#15 Select count of smartphones in the database with 3Gb ram;
Select Count(id) as conteggio
From smartphone
where ram='3Gb';

#16 Select count of smartphones for each opSys in the database;
Select Count(s.id) as conteggio, o.description as opsys
From smartphone as s inner join opsys as o on s.opsys=o.id
Group By o.description;

#17 Select count of smartphones for each country in the database;
Select Count(s.id) as conteggio, c.name as country
From smartphone as s inner join brand as b on s.brand=b.id
					inner join country as c on b.country=c.code
group by c.name;

