insert into public.users(id,name,password) values ('1','binh','$2a$10$KhbSmV./3nNscVlPmqoXpe/lXmKg5OjhC/21D7Y6ZzVBFidrLYWz6');
insert into public.role(id,name) values('1','admin');
insert into public.user_role(user_id,role_id) values('1','1');