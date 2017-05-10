INSERT INTO city (city_id, city_name, city_state, city_country) VALUES 
    (1001, 'São Paulo', 'São Paulo', 'Brasil'),
    (1002, 'São Caetano do Sul', 'São Paulo', 'Brasil'),
    (1003, 'São Bernardo do Campo', 'São Paulo', 'Brasil'),
    (1004, 'Santo André', 'São Paulo', 'Brasil'),
    (1005, 'Diadema', 'São Paulo', 'Brasil');

INSERT INTO user (user_id, user_name, user_email) VALUES 
    (951, 'Victor Silva', 'toedio@yahoo.com.br'),
    (952, 'Alvaro Neves', 'alvaro95@hotmail.com.br'),
    (953, 'Silvano Rodrigues', 'srodr201@gmail.com.br'),
    (954, 'Mariana Bongirno', 'maribong40@bol.com.br'),
    (955, 'Flávia Pires', 'p_fla2010@terra.com.br');

INSERT INTO user_address (address_route, address_street_number, address_additional_info, address_neighborhood, city_id, address_postal_code, user_id) VALUES 
    ('Rua Florida', '1379', 'Casa A', 'Barcelona', 1002, '09551-000', 951),
    ('Rua Flórida', '1379', 'Casa A', 'Barcelona', 1002, '09551-000', 951),
    ('Av. Pres. Kenndy', '958', '', 'Santa Paula', 1002, '09551-050', 951),
    ('Av. Dr. Isaias Salomão', '129', 'Ap. 21', 'Saúde', 1001, '04547-985', 951),
    ('Rua Assunção', '72', '', 'Bela Vista', 1001, '05620-858', 952),
    ('Av. Piraporinha', '85', '', 'Centro', 1005, '08523-658', 953),
    ('Rua Luis Fláquer', '8', 'Bl.03', 'Vila Luzita', 1004, '05689-952', 953),
    ('Av. Jose Anchieta', '5030', '', 'Vl. Assunção', 1003, '04585-854', 955),
    ('Rua das Olveiras', '10', 'Cond. Res I', 'Baeta Neves', 1003, '04585-859', 955);
