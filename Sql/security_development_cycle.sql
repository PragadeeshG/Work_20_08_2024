create table if not exists security_development_cycle(
applications varchar(255) not null,
sdl_guide varchar(255) null,
origin_stage varchar(255) null,
target_stage varchar(255) null,
threat_modelling varchar(255) null,
security_testing varchar(255) null,
mandatory_trainings varchar(255) null,
academy_regulatory varchar(255) null,
demo_hackathons varchar(255) null,
status varchar(255) null,
constraint security_development_cycle_pk primary key(applications));