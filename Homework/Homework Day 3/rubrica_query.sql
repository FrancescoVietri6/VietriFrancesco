#1 Insert a new user.
INSERT INTO User (id, name, surname, eta, telNumber, email, smartphone) VALUES
					
                    (null, 'Mauro', 'Strada', 38, '3478954471', 'mauro.strada@soprasteria.com', 2);

#2 Shows the anagraphic user information and the model owned by the user.
Select u.name as UserName, u.surname as UserSurname, u.eta as Età, s.name as Model
From user as u inner join smartphone as s on u.smartphone=s.id;

#3 Update of the anagraphic informations where name equals Saverio.

Set sql_safe_updates=0; 	#This command allowds to bypass the code lock for the sefe update, 
							#in this way you can insert inthe where clause parameters that are 
                            #different from primary keys

UPDATE user					
set name='Tizio', surname='Caio',eta=54
where name = 'Saverio';

#4 Update information related to the phone where id equals to the number of the Korean brands.
UPDATE smartphone
set name='Uiip-Phone', ram='16Gb', cpu='2.3 GHz quad-core CPU', displayPpi=556, displaySize='4.7', displayResolution='1080x1920', size='146x70x9', weight=180, brand=5, opSys=9
where id=( Select count(b.id)
		   From brand as b inner join country as c on b.country=c.code
           where c.code='KR');

#5 Shows informations related to the phone.
select s.name as Model, b.name as Brand, c.name as Country, o.description as SistemaOperativo, u.name as UserName, u.surname as UserSurname
From user as u inner join smartphone as s on u.smartphone=s.id
		inner join brand as b on s.brand=b.id
        inner join country as c on b.country=c.code
        inner join opsys as o on s.opsys=o.id;