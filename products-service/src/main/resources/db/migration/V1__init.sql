create table products (
    id              bigserial primary key,
    title           varchar(255)
);

insert into products (title)
values
('Апельсин'),
('Батон'),
('Лимон');