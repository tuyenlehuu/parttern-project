CREATE TABLE EMPLOYEE
(
  ID BIGINT NOT NULL,
  NAME CHARACTER VARYING(255) NOT NULL,
  SURNAME CHARACTER VARYING(255) NOT NULL,
  ADDRESS_ID BIGINT,
  DEPARTMENT_ID BIGINT,
  CONSTRAINT EMPLOYEE_PKEY PRIMARY KEY (ID),
  CONSTRAINT FKBEJTWVG9BXUS2MFFSM3SWJ3U9 FOREIGN KEY (DEPARTMENT_ID)
      REFERENCES DEPARTMENT (ID) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT FKGA73HDTPB67TWLR9C1I337TYT FOREIGN KEY (ADDRESS_ID)
      REFERENCES ADDRESS (ID) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
)
WITH (
  OIDS=FALSE
);