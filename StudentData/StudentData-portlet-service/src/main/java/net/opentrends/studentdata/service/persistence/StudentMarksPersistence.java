package net.opentrends.studentdata.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import net.opentrends.studentdata.model.StudentMarks;

/**
 * The persistence interface for the student marks service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentMarksPersistenceImpl
 * @see StudentMarksUtil
 * @generated
 */
public interface StudentMarksPersistence extends BasePersistence<StudentMarks> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link StudentMarksUtil} to access the student marks persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns the student marks where studentId = &#63; or throws a {@link net.opentrends.studentdata.NoSuchStudentMarksException} if it could not be found.
    *
    * @param studentId the student ID
    * @return the matching student marks
    * @throws net.opentrends.studentdata.NoSuchStudentMarksException if a matching student marks could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentMarks findByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentMarksException;

    /**
    * Returns the student marks where studentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param studentId the student ID
    * @return the matching student marks, or <code>null</code> if a matching student marks could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentMarks fetchByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the student marks where studentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param studentId the student ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching student marks, or <code>null</code> if a matching student marks could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentMarks fetchByStudentId(
        long studentId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the student marks where studentId = &#63; from the database.
    *
    * @param studentId the student ID
    * @return the student marks that was removed
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentMarks removeByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentMarksException;

    /**
    * Returns the number of student markses where studentId = &#63;.
    *
    * @param studentId the student ID
    * @return the number of matching student markses
    * @throws SystemException if a system exception occurred
    */
    public int countByStudentId(long studentId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the student marks in the entity cache if it is enabled.
    *
    * @param studentMarks the student marks
    */
    public void cacheResult(
        net.opentrends.studentdata.model.StudentMarks studentMarks);

    /**
    * Caches the student markses in the entity cache if it is enabled.
    *
    * @param studentMarkses the student markses
    */
    public void cacheResult(
        java.util.List<net.opentrends.studentdata.model.StudentMarks> studentMarkses);

    /**
    * Creates a new student marks with the primary key. Does not add the student marks to the database.
    *
    * @param markId the primary key for the new student marks
    * @return the new student marks
    */
    public net.opentrends.studentdata.model.StudentMarks create(long markId);

    /**
    * Removes the student marks with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param markId the primary key of the student marks
    * @return the student marks that was removed
    * @throws net.opentrends.studentdata.NoSuchStudentMarksException if a student marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentMarks remove(long markId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentMarksException;

    public net.opentrends.studentdata.model.StudentMarks updateImpl(
        net.opentrends.studentdata.model.StudentMarks studentMarks)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the student marks with the primary key or throws a {@link net.opentrends.studentdata.NoSuchStudentMarksException} if it could not be found.
    *
    * @param markId the primary key of the student marks
    * @return the student marks
    * @throws net.opentrends.studentdata.NoSuchStudentMarksException if a student marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentMarks findByPrimaryKey(
        long markId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentMarksException;

    /**
    * Returns the student marks with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param markId the primary key of the student marks
    * @return the student marks, or <code>null</code> if a student marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.studentdata.model.StudentMarks fetchByPrimaryKey(
        long markId) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the student markses.
    *
    * @return the student markses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.studentdata.model.StudentMarks> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.studentdata.model.StudentMarks> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the student markses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.studentdata.model.impl.StudentMarksModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of student markses
    * @param end the upper bound of the range of student markses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of student markses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.studentdata.model.StudentMarks> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the student markses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of student markses.
    *
    * @return the number of student markses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
