create table physical_attributes
(
    id serial primary key,
    character_id varchar(255) not null references character on delete cascade,
    culture text,
    gender text,
    eye_color text,
    hair_color text,
    height int,
    height_unit text,
);