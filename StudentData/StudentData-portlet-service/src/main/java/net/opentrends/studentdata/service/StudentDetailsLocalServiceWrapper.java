package net.opentrends.studentdata.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StudentDetailsLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StudentDetailsLocalService
 * @generated
 */
public class StudentDetailsLocalServiceWrapper
    implements StudentDetailsLocalService,
        ServiceWrapper<StudentDetailsLocalService> {
    private StudentDetailsLocalService _studentDetailsLocalService;

    public StudentDetailsLocalServiceWrapper(
        StudentDetailsLocalService studentDetailsLocalService) {
        _studentDetailsLocalService = studentDetailsLocalService;
    }

    /**
    * Adds the student details to the database. Also notifies the appropriate model listeners.
    *
    * @param studentDetails the student details
    * @return the student details that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.studentdata.model.StudentDetails addStudentDetails(
        net.opentrends.studentdata.model.StudentDetails studentDetails)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.addStudentDetails(studentDetails);
    }

    /**
    * Creates a new student details with the primary key. Does not add the student details to the database.
    *
    * @param studentId the primary key for the new student details
    * @return the new student details
    */
    @Override
    public net.opentrends.studentdata.model.StudentDetails createStudentDetails(
        long studentId) {
        return _studentDetailsLocalService.createStudentDetails(studentId);
    }

    /**
    * Deletes the student details with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param studentId the primary key of the student details
    * @return the student details that was removed
    * @throws PortalException if a student details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.studentdata.model.StudentDetails deleteStudentDetails(
        long studentId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.deleteStudentDetails(studentId);
    }

    /**
    * Deletes the student details from the database. Also notifies the appropriate model listeners.
    *
    * @param studentDetails the student details
    * @return the student details that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.studentdata.model.StudentDetails deleteStudentDetails(
        net.opentrends.studentdata.model.StudentDetails studentDetails)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.deleteStudentDetails(studentDetails);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _studentDetailsLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public net.opentrends.studentdata.model.StudentDetails fetchStudentDetails(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.fetchStudentDetails(studentId);
    }

    /**
    * Returns the student details with the primary key.
    *
    * @param studentId the primary key of the student details
    * @return the student details
    * @throws PortalException if a student details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.studentdata.model.StudentDetails getStudentDetails(
        long studentId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.getStudentDetails(studentId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the student detailses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of student detailses
    * @param end the upper bound of the range of student detailses (not inclusive)
    * @return the range of student detailses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<net.opentrends.studentdata.model.StudentDetails> getStudentDetailses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.getStudentDetailses(start, end);
    }

    /**
    * Returns the number of student detailses.
    *
    * @return the number of student detailses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getStudentDetailsesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.getStudentDetailsesCount();
    }

    /**
    * Updates the student details in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param studentDetails the student details
    * @return the student details that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.studentdata.model.StudentDetails updateStudentDetails(
        net.opentrends.studentdata.model.StudentDetails studentDetails)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentDetailsLocalService.updateStudentDetails(studentDetails);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _studentDetailsLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _studentDetailsLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _studentDetailsLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public StudentDetailsLocalService getWrappedStudentDetailsLocalService() {
        return _studentDetailsLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStudentDetailsLocalService(
        StudentDetailsLocalService studentDetailsLocalService) {
        _studentDetailsLocalService = studentDetailsLocalService;
    }

    @Override
    public StudentDetailsLocalService getWrappedService() {
        return _studentDetailsLocalService;
    }

    @Override
    public void setWrappedService(
        StudentDetailsLocalService studentDetailsLocalService) {
        _studentDetailsLocalService = studentDetailsLocalService;
    }
}