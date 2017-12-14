create table candidate_Registration (
	id_ LONG not null primary key,
	name VARCHAR(75) null,
	email VARCHAR(75) null,
	city VARCHAR(75) null,
	mobileNo VARCHAR(75) null,
	photoFileEntryId LONG,
	resumeFileEntryId LONG,
	userId LONG,
	groupId LONG
);