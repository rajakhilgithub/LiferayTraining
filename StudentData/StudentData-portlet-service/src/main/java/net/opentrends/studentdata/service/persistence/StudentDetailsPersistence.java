package net.opentrends.studentdata.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import net.opentrends.studentdata.model.StudentDetails;

/**
 * The persistence interface for the student details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentDetailsPersistenceImpl
 * @see StudentDetailsUtil
 * @generated
 */
public interface StudentDetailsPersistence extends BasePersistence<StudentDetails> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link StudentDetailsUtil} to access the student details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the student details where studentId = &#63; or throws a {@link net.opentrends.studentdata.NoSuchStudentDetailsException} if it could not be found.
    *
    * @param studentId the student ID
    * @return the matching student details
    * @throws net.opentrends.studentdata.NoSuchStudentDetailsException if a matching student details could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentDetails findByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentDetailsException;

    /**
    * Returns the student details where studentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param studentId the student ID
    * @return the matching student details, or <code>null</code> if a matching student details could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentDetails fetchByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the student details where studentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param studentId the student ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching student details, or <code>null</code> if a matching student details could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentDetails fetchByStudentId(
        long studentId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the student details where studentId = &#63; from the database.
    *
    * @param studentId the student ID
    * @return the student details that was removed
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentDetails removeByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentDetailsException;

    /**
    * Returns the number of student detailses where studentId = &#63;.
    *
    * @param studentId the student ID
    * @return the number of matching student detailses
    * @throws SystemException if a system exception occurred
    */
    public int countByStudentId(long studentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the student details in the entity cache if it is enabled.
    *
    * @param studentDetails the student details
    */
    public void cacheResult(
        net.opentrends.studentdata.model.StudentDetails studentDetails);

    /**
    * Caches the student detailses in the entity cache if it is enabled.
    *
    * @param studentDetailses the student detailses
    */
    public void cacheResult(
        java.util.List<net.opentrends.studentdata.model.StudentDetails> studentDetailses);

    /**
    * Creates a new student details with the primary key. Does not add the student details to the database.
    *
    * @param studentId the primary key for the new student details
    * @return the new student details
    */
    public net.opentrends.studentdata.model.StudentDetails create(
        long studentId);

    /**
    * Removes the student details with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param studentId the primary key of the student details
    * @return the student details that was removed
    * @throws net.opentrends.studentdata.NoSuchStudentDetailsException if a student details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentDetails remove(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentDetailsException;

    public net.opentrends.studentdata.model.StudentDetails updateImpl(
        net.opentrends.studentdata.model.StudentDetails studentDetails)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the student details with the primary key or throws a {@link net.opentrends.studentdata.NoSuchStudentDetailsException} if it could not be found.
    *
    * @param studentId the primary key of the student details
    * @return the student details
    * @throws net.opentrends.studentdata.NoSuchStudentDetailsException if a student details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentDetails findByPrimaryKey(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentDetailsException;

    /**
    * Returns the student details with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param studentId the primary key of the student details
    * @return the student details, or <code>null</code> if a student details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentDetails fetchByPrimaryKey(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the student detailses.
    *
    * @return the student detailses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.studentdata.model.StudentDetails> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.studentdata.model.StudentDetails> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the student detailses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentDetailsModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of student detailses
    * @param end the upper bound of the range of student detailses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of student detailses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.studentdata.model.StudentDetails> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the student detailses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of student detailses.
    *
    * @return the number of student detailses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
