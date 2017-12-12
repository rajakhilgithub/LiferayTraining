create table StudentData_StudentDetails (
	studentId LONG not null primary key,
	studentName VARCHAR(75) null,
	department VARCHAR(75) null,
	semester LONG,
	groupId LONG
);

create table StudentData_StudentMarks (
	markId LONG not null primary key,
	studentId LONG,
	mark1 LONG,
	mark2 LONG,
	mark3 LONG,
	mark4 LONG,
	mark5 LONG,
	total LONG,
	groupId LONG
);