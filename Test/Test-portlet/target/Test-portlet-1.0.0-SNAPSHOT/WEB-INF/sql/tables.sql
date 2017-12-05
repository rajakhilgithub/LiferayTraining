create table emp_Employee (
	employeeId LONG not null primary key,
	groupId LONG,
	employeeName VARCHAR(75) null,
	houseName VARCHAR(75) null,
	street VARCHAR(75) null,
	city VARCHAR(75) null,
	district VARCHAR(75) null,
	pincode VARCHAR(75) null,
	phone VARCHAR(75) null,
	department VARCHAR(75) null,
	designation VARCHAR(75) null,
	salary LONG,
	email VARCHAR(75) null,
	adharno VARCHAR(75) null,
	fileEntryId LONG
);