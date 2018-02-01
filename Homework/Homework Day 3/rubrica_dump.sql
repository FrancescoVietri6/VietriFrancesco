
# #####################
# DUMPING DATA PHONE 
# #####################

INSERT INTO country (code, name) VALUES
					('KR', 'South Korea'),
					('JP', 'Japan'),
					('CA', 'Canada'),
					('CH', 'China'),
					('SW', 'Sweden'),
					('US', 'United States'),
					('IT', 'Italy'),
                    ('FR', 'France');
                    
INSERT INTO brand (id, name, country) VALUES
				(1, 'SAMSUNG', 'KR'),
				(2, 'ACER', 'KR'),
				(3, 'AMOI', 'CH'),
				(4, 'HTC', 'KR'),
				(5, 'APPLE', 'US'),
				(6, 'HP', 'US'),
				(7, 'LG', 'KR'),
				(8, 'SONY', 'JP'),
				(9, 'MOTOROLA', 'US'),
				(10, 'NOKIA', 'SW'),
				(11, 'BLACKBERRY', 'CA'),
				(12, 'BBK', 'CH'),
				(13, 'WIKO', 'FR');

INSERT INTO OpSys (id, description, company, openSource) VALUES
				(1, 'Android', 'Google', 1),
				(3, 'iOS', 'Apple Inc.', 0),
				(9, 'Windows Phone 8', 'Microsoft', 0),
				(11, 'BlackBerry', 'BlackBerry', 0);

INSERT INTO Smartphone (id, name, ram, cpu, displayPpi, displaySize, displayResolution, size, weight, notes, brand, opSys) VALUES
						(1, 'HTC One M8', '2Gb', '2.3 GHz quad-core CPU', 468, '4.7', '1080x1920', '146x70x9', 160, ' ', 4, 1),
						(2, 'Iphone 5S', '1Gb', '1.3 GHz dual-core CPU', 326, '4', '640x1136', '123x58x8', 112, ' ', 5, 3),
						(3, 'Galaxy Note 3', '3Gb', '2.3 GHz Quad core CPU', 386, '5.7', '1080x1920', '151x79x8', 168, ' ', 1, 1),
						(4, 'Galaxy S4', '2Gb', '1.9 GHz Quad core CPU', 441, '5.0', '1080x1920', '136x69x8', 130, ' ', 1, 1),
						(5, 'Galaxy S5', '2Gb', '2.5 GHz Quad core CPU', 432, '5.1', '1080x1920', '142x72x8', 145, 'Water, Dust resistant', 1, 1),
						(6, 'Galaxy S4 mini', '1.5Gb', '1.7 GHz dual-core CPU', 256, '4.3', '540x960', '125x61x9', 107, ' ', 1, 1),
						(7, 'Moto X', '2Gb', '1.7 GHz dual-core CPU', 326, '4.7', '720x1280', '129x65x6', 130, ' ', 9, 1),
						(8, 'Lumia 1020', '2Gb', '1.5 GHz dual-core CPU', 386, '5.7', '768x1280', '130x71x10', 158, ' ', 10, 1),
						(9, 'Nexus 5', '2Gb', '2.3 GHz Quad core CPU', 445, '4.95', '1080x1920', '138x69x8', 130, ' ', 7, 1),
						(10, 'G2', '2Gb', '2.26 GHz Quad core CPU', 424, '5.2', '1080x1920', '138x71x9', 143, '', 7, 1),
						(11, 'Lumia 930', '2Gb', '2.2 GHz quad-core CPU', 441, '5.0', '1080x1920', '137x71x10', 167, ' ', 10, 9),
						(12, 'Galaxy S III', '2Gb', '1.5 Ghz dual-core', 306, '4.8', '720x1280', '136x70x8', 133, '', 1, 1),
						(13, 'Galaxy S II', '1Gb', '1.2 GHz dual-core', 218, '4.3', '480x800', '123x66x8.5', 116, '', 1, 1),
						(14, 'Blackberry Z30', '2Gb', '1.7 Ghz', 295, '5', '1280x768', '140x72x9.4', 170, '', 11, 11),
						(15, 'Vivo Xplay 3S', '3Gb', '2.3Ghz Quad core', 490, '6.0', '1440x2560', '158x82x8', 172, '', 12, 1),
						(16, 'Lumia 520', '512Mb', '1 GHz dual-core ', 235, '4', '480x800', '119x64x10', 124, '', 10, 9),
						(17, '8S', '512Mb', '1 GHz Dual-core', 233, '4', '480x800', '120x63x10', 113, '', 4, 9),
						(18, 'Ativ S Neo', '1Gb', '1.4 GHz dual-core', 308, '4.77', '720x1280', '135x69x9', 144, '', 1, 9),
						(19, '8X', '1Gb', '1.5 GHz dual-core', 342, '4.3', '720x1280', '32,35 x 66,2 x 10,12', 130, '', 4, 9);

INSERT INTO User (id, name, surname, eta, telNumber, email, smartphone) VALUES
					(1, 'Francesco', 'Vietri', 16, '3408362471', 'Francesco.Vietri@gmail.com', 7),
                    (2, 'Francesco', 'Randillo', 18, '3468315566', 'Francesco.Randillo@outlook.com', 12),
                    (3, 'Francesco', 'Caniglia', 22, '3428446811', 'Francesco.Caniglia@hotmail.it', 19),
                    (4, 'Silverio', 'Vaira', 55, '3284578965', 'Silverio.Vaira@vodafone.it', 19),
                    (5, 'Simona', 'Palumbo', 64, '3298456214', 'Simona.Palumbo@soprasteria.com', 11),
                    (6, 'Antonia', 'Coviello', 25, '3356985741', '', 7),
                    (7, 'Mario', 'Saponara', 26, '3336985471', 'Mario.Saponara@gmail.com', 4),
                    (8, 'Angelo', 'Giordano', 36, '3282211569', 'Angelo.Giordano@libero.it', 5),
                    (9, 'Andrea', 'Di Maso', 80, '3478569951', '', 5),
                    (10, 'Francesca', 'Di Mare', 60, '3256984751', 'Francesca.Di Mare@hotmail.it', 3),
                    (11, 'Francesco', 'Riccardo', 45, '3269541236', '', 7),
                    (12, 'Riccardo', 'Francesco', 49, '3625947851', '', 9),
                    (13, 'Saverio', 'Vietri', 75, '3286314283', 'Saverio.Vietri@hotmail.it', 8),
                    (14, 'Mirella', 'Coppola', 46, '3333323451', 'Mirella.Coppola@outlook.com', 2),
                    (15, 'Romano', 'De ROMA', 28, '3485694852', '', 1),
                    (16, 'Pasquale', 'Settebellezze', 33, '3332333433', 'Pasquale.Settebellezze@hotmail.it', 2),
                    (17, 'Manuela', 'Carminati', 66, '3286594751', '', 2),
                    (18, 'Filippa', 'Ina', 33, '3295694871', 'Filippa.Ina@outlook.com', 4),
                    (19, 'Giuseppe', 'De Nicola', 22, '3402659847', 'Giuseppe.De Nicola@libero.it', 7),
                    (20, 'Michela', 'Dea', 18, '3336985211', 'Michela.Dea@gmail.com', 2);