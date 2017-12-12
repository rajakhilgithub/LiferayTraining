package net.opentrends.studentdata.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.studentdata.model.StudentMarks;

import java.util.List;

/**
 * The persistence utility for the student marks service. This utility wraps {@link StudentMarksPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentMarksPersistence
 * @see StudentMarksPersistenceImpl
 * @generated
 */
public class StudentMarksUtil {
    private static StudentMarksPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(StudentMarks studentMarks) {
        getPersistence().clearCache(studentMarks);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<StudentMarks> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<StudentMarks> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<StudentMarks> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static StudentMarks update(StudentMarks studentMarks)
        throws SystemException {
        return getPersistence().update(studentMarks);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static StudentMarks update(StudentMarks studentMarks,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(studentMarks, serviceContext);
    }

    /**
    * Returns the student marks where studentId = &#63; or throws a {@link net.opentrends.studentdata.NoSuchStudentMarksException} if it could not be found.
    *
    * @param studentId the student ID
    * @return the matching student marks
    * @throws net.opentrends.studentdata.NoSuchStudentMarksException if a matching student marks could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentMarks findByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentMarksException {
        return getPersistence().findByStudentId(studentId);
    }

    /**
    * Returns the student marks where studentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param studentId the student ID
    * @return the matching student marks, or <code>null</code> if a matching student marks could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentMarks fetchByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStudentId(studentId);
    }

    /**
    * Returns the student marks where studentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param studentId the student ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching student marks, or <code>null</code> if a matching student marks could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentMarks fetchByStudentId(
        long studentId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStudentId(studentId, retrieveFromCache);
    }

    /**
    * Removes the student marks where studentId = &#63; from the database.
    *
    * @param studentId the student ID
    * @return the student marks that was removed
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentMarks removeByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentMarksException {
        return getPersistence().removeByStudentId(studentId);
    }

    /**
    * Returns the number of student markses where studentId = &#63;.
    *
    * @param studentId the student ID
    * @return the number of matching student markses
    * @throws SystemException if a system exception occurred
    */
    public static int countByStudentId(long studentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStudentId(studentId);
    }

    /**
    * Caches the student marks in the entity cache if it is enabled.
    *
    * @param studentMarks the student marks
    */
    public static void cacheResult(
        net.opentrends.studentdata.model.StudentMarks studentMarks) {
        getPersistence().cacheResult(studentMarks);
    }

    /**
    * Caches the student markses in the entity cache if it is enabled.
    *
    * @param studentMarkses the student markses
    */
    public static void cacheResult(
        java.util.List<net.opentrends.studentdata.model.StudentMarks> studentMarkses) {
        getPersistence().cacheResult(studentMarkses);
    }

    /**
    * Creates a new student marks with the primary key. Does not add the student marks to the database.
    *
    * @param markId the primary key for the new student marks
    * @return the new student marks
    */
    public static net.opentrends.studentdata.model.StudentMarks create(
        long markId) {
        return getPersistence().create(markId);
    }

    /**
    * Removes the student marks with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param markId the primary key of the student marks
    * @return the student marks that was removed
    * @throws net.opentrends.studentdata.NoSuchStudentMarksException if a student marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentMarks remove(
        long markId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentMarksException {
        return getPersistence().remove(markId);
    }

    public static net.opentrends.studentdata.model.StudentMarks updateImpl(
        net.opentrends.studentdata.model.StudentMarks studentMarks)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(studentMarks);
    }

    /**
    * Returns the student marks with the primary key or throws a {@link net.opentrends.studentdata.NoSuchStudentMarksException} if it could not be found.
    *
    * @param markId the primary key of the student marks
    * @return the student marks
    * @throws net.opentrends.studentdata.NoSuchStudentMarksException if a student marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentMarks findByPrimaryKey(
        long markId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentMarksException {
        return getPersistence().findByPrimaryKey(markId);
    }

    /**
    * Returns the student marks with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param markId the primary key of the student marks
    * @return the student marks, or <code>null</code> if a student marks with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentMarks fetchByPrimaryKey(
        long markId) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(markId);
    }

    /**
    * Returns all the student markses.
    *
    * @return the student markses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.studentdata.model.StudentMarks> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<net.opentrends.studentdata.model.StudentMarks> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<net.opentrends.studentdata.model.StudentMarks> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the student markses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of student markses.
    *
    * @return the number of student markses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static StudentMarksPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (StudentMarksPersistence) PortletBeanLocatorUtil.locate(net.opentrends.studentdata.service.ClpSerializer.getServletContextName(),
                    StudentMarksPersistence.class.getName());

            ReferenceRegistry.registerReference(StudentMarksUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(StudentMarksPersistence persistence) {
    }
}
