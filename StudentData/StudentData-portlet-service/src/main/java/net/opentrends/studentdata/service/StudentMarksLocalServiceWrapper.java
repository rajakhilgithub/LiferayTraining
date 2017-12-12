package net.opentrends.studentdata.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StudentMarksLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see StudentMarksLocalService
 * @generated
 */
public class StudentMarksLocalServiceWrapper implements StudentMarksLocalService,
    ServiceWrapper<StudentMarksLocalService> {
    private StudentMarksLocalService _studentMarksLocalService;

    public StudentMarksLocalServiceWrapper(
        StudentMarksLocalService studentMarksLocalService) {
        _studentMarksLocalService = studentMarksLocalService;
    }

    /**
    * Adds the student marks to the database. Also notifies the appropriate model listeners.
    *
    * @param studentMarks the student marks
    * @return the student marks that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.studentdata.model.StudentMarks addStudentMarks(
        net.opentrends.studentdata.model.StudentMarks studentMarks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentMarksLocalService.addStudentMarks(studentMarks);
    }

    /**
    * Creates a new student marks with the primary key. Does not add the student marks to the database.
    *
    * @param markId the primary key for the new student marks
    * @return the new student marks
    */
    @Override
    public net.opentrends.studentdata.model.StudentMarks createStudentMarks(
        long markId) {
        return _studentMarksLocalService.createStudentMarks(markId);
    }

    /**
    * Deletes the student marks with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param markId the primary key of the student marks
    * @return the student marks that was removed
    * @throws PortalException if a student marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.studentdata.model.StudentMarks deleteStudentMarks(
        long markId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _studentMarksLocalService.deleteStudentMarks(markId);
    }

    /**
    * Deletes the student marks from the database. Also notifies the appropriate model listeners.
    *
    * @param studentMarks the student marks
    * @return the student marks that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.studentdata.model.StudentMarks deleteStudentMarks(
        net.opentrends.studentdata.model.StudentMarks studentMarks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentMarksLocalService.deleteStudentMarks(studentMarks);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _studentMarksLocalService.dynamicQuery();
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
        return _studentMarksLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentMarksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _studentMarksLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentMarksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _studentMarksLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
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
        return _studentMarksLocalService.dynamicQueryCount(dynamicQuery);
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
        return _studentMarksLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public net.opentrends.studentdata.model.StudentMarks fetchStudentMarks(
        long markId) throws com.liferay.portal.kernel.exception.SystemException {
        return _studentMarksLocalService.fetchStudentMarks(markId);
    }

    /**
    * Returns the student marks with the primary key.
    *
    * @param markId the primary key of the student marks
    * @return the student marks
    * @throws PortalException if a student marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.studentdata.model.StudentMarks getStudentMarks(
        long markId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _studentMarksLocalService.getStudentMarks(markId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _studentMarksLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the student markses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentMarksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of student markses
    * @param end the upper bound of the range of student markses (not inclusive)
    * @return the range of student markses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<net.opentrends.studentdata.model.StudentMarks> getStudentMarkses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentMarksLocalService.getStudentMarkses(start, end);
    }

    /**
    * Returns the number of student markses.
    *
    * @return the number of student markses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getStudentMarksesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentMarksLocalService.getStudentMarksesCount();
    }

    /**
    * Updates the student marks in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param studentMarks the student marks
    * @return the student marks that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.studentdata.model.StudentMarks updateStudentMarks(
        net.opentrends.studentdata.model.StudentMarks studentMarks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _studentMarksLocalService.updateStudentMarks(studentMarks);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _studentMarksLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _studentMarksLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _studentMarksLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public StudentMarksLocalService getWrappedStudentMarksLocalService() {
        return _studentMarksLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStudentMarksLocalService(
        StudentMarksLocalService studentMarksLocalService) {
        _studentMarksLocalService = studentMarksLocalService;
    }

    @Override
    public StudentMarksLocalService getWrappedService() {
        return _studentMarksLocalService;
    }

    @Override
    public void setWrappedService(
        StudentMarksLocalService studentMarksLocalService) {
        _studentMarksLocalService = studentMarksLocalService;
    }
}
