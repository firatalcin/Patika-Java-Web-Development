/*1 - test veritabanınızda employee isimli sütun bilgileri id(INTEGER), name VARCHAR(50), birthday DATE, email VARCHAR(100) olan bir tablo oluşturalım.*/

CREATE TABLE employee (
	id serial PRIMARY KEY,
	name VARCHAR(50) NOT NULL,
	birthday DATE NOT NULL,
	email VARCHAR(100) NOT NULL
);

/*2 - Oluşturduğumuz employee tablosuna 'Mockaroo' servisini kullanarak 50 adet veri ekleyelim.*/

insert into employee (name, birthday, email) values ('Ajay', '2000-11-21', 'abrothers0@reddit.com');
insert into employee (name, birthday, email) values ('Alexis', '2005-02-23', 'akohtler1@ucsd.edu');
insert into employee (name, birthday, email) values ('Kandace', '2001-04-27', 'ktregent2@photobucket.com');
insert into employee (name, birthday, email) values ('Kimmie', '2004-02-20', 'kmaccolm3@myspace.com');
insert into employee (name, birthday, email) values ('Kyla', '1999-07-16', 'kbarnett4@moonfruit.com');
insert into employee (name, birthday, email) values ('Arluene', '1988-07-02', 'aimos5@shareasale.com');
insert into employee (name, birthday, email) values ('Oswell', '2001-04-12', 'oroma6@mapquest.com');
insert into employee (name, birthday, email) values ('Graham', '1988-08-24', 'gbenez7@eventbrite.com');
insert into employee (name, birthday, email) values ('Bessie', '2007-12-21', 'bmilillo8@yahoo.com');
insert into employee (name, birthday, email) values ('Elnar', '1990-09-14', 'ehelin9@google.co.jp');
insert into employee (name, birthday, email) values ('Pattin', '1990-07-27', 'ptittletrossa@mashable.com');
insert into employee (name, birthday, email) values ('Elfreda', '1973-06-13', 'ewinspareb@mysql.com');
insert into employee (name, birthday, email) values ('Consalve', '1974-05-30', 'cchattc@simplemachines.org');
insert into employee (name, birthday, email) values ('Mahala', '2021-07-03', 'mmccorryd@drupal.org');
insert into employee (name, birthday, email) values ('Allys', '2014-09-28', 'astayte@facebook.com');
insert into employee (name, birthday, email) values ('Lionello', '2020-01-08', 'lglennief@freewebs.com');
insert into employee (name, birthday, email) values ('Goddart', '1993-07-26', 'gheimsg@sitemeter.com');
insert into employee (name, birthday, email) values ('Gaby', '1994-12-14', 'gappleyardh@4shared.com');
insert into employee (name, birthday, email) values ('Neils', '1977-12-28', 'nskentelberyi@patch.com');
insert into employee (name, birthday, email) values ('Abrahan', '1988-10-12', 'aspeirj@liveinternet.ru');
insert into employee (name, birthday, email) values ('Hayyim', '1999-08-19', 'hbevenk@walmart.com');
insert into employee (name, birthday, email) values ('Durand', '2021-01-07', 'dhudghtonl@theguardian.com');
insert into employee (name, birthday, email) values ('Ned', '1982-10-06', 'nbatterm@printfriendly.com');
insert into employee (name, birthday, email) values ('Galvin', '1972-06-19', 'glawlern@reuters.com');
insert into employee (name, birthday, email) values ('Wells', '1987-12-22', 'wbigriggo@blinklist.com');
insert into employee (name, birthday, email) values ('Arlan', '1982-08-05', 'aswornep@google.fr');
insert into employee (name, birthday, email) values ('Adolphe', '1978-06-15', 'afassetq@reuters.com');
insert into employee (name, birthday, email) values ('Eloisa', '2018-02-20', 'escamalr@dmoz.org');
insert into employee (name, birthday, email) values ('Joela', '1993-02-03', 'jwoltons@hibu.com');
insert into employee (name, birthday, email) values ('Jerald', '1977-07-05', 'jjiggenst@purevolume.com');
insert into employee (name, birthday, email) values ('Nada', '1974-06-04', 'nbeedellu@nature.com');
insert into employee (name, birthday, email) values ('Tatum', '2000-06-04', 'tbortoliv@cnn.com');
insert into employee (name, birthday, email) values ('Niels', '1993-11-23', 'nbrownsettw@stanford.edu');
insert into employee (name, birthday, email) values ('Ynez', '1999-03-07', 'yhaversonx@google.es');
insert into employee (name, birthday, email) values ('Callida', '1992-01-14', 'cfawdryy@ft.com');
insert into employee (name, birthday, email) values ('Babbie', '2015-08-20', 'bmcgoldrickz@columbia.edu');
insert into employee (name, birthday, email) values ('Dar', '2006-06-17', 'dcoldwell10@arstechnica.com');
insert into employee (name, birthday, email) values ('Claudie', '2002-08-10', 'chargate11@1688.com');
insert into employee (name, birthday, email) values ('Kerri', '1997-02-22', 'kgoford12@tmall.com');
insert into employee (name, birthday, email) values ('Hedvig', '1998-07-13', 'hhanalan13@godaddy.com');
insert into employee (name, birthday, email) values ('Cayla', '2006-04-25', 'czanardii14@oaic.gov.au');
insert into employee (name, birthday, email) values ('Gregg', '2010-05-23', 'gskyme15@is.gd');
insert into employee (name, birthday, email) values ('Cassy', '1970-10-14', 'cfilyakov16@ox.ac.uk');
insert into employee (name, birthday, email) values ('Adelheid', '1978-07-07', 'ashallcross17@yandex.ru');
insert into employee (name, birthday, email) values ('Camella', '2019-06-27', 'chaggath18@drupal.org');
insert into employee (name, birthday, email) values ('Butch', '1992-05-11', 'bsimms19@netvibes.com');
insert into employee (name, birthday, email) values ('Aloysia', '2021-01-24', 'awellbeloved1a@tiny.cc');
insert into employee (name, birthday, email) values ('Giffy', '1989-07-06', 'ggeffcock1b@ebay.com');
insert into employee (name, birthday, email) values ('Orelee', '1990-11-04', 'ooulett1c@w3.org');
insert into employee (name, birthday, email) values ('Anatol', '1992-04-16', 'abownes1d@constantcontact.com');

/*3 - Sütunların her birine göre diğer sütunları güncelleyecek 5 adet UPDATE işlemi yapalım.*/

UPDATE employee
SET name = 'Fırat', birthday = '1998-04-16', email = 'firatalcin04@gmail.com'
WHERE id = 1

/*4 - Sütunların her birine göre ilgili satırı silecek 5 adet DELETE işlemi yapalım.*/

DELETE FROM employee
WHERE name = 'Anatol'