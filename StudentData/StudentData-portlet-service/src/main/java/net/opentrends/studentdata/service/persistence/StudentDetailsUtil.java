package net.opentrends.studentdata.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.studentdata.model.StudentDetails;

import java.util.List;

/**
 * The persistence utility for the student details service. This utility wraps {@link StudentDetailsPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StudentDetailsPersistence
 * @see StudentDetailsPersistenceImpl
 * @generated
 */
public class StudentDetailsUtil {
    private static StudentDetailsPersistence _persistence;

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
    public static void clearCache(StudentDetails studentDetails) {
        getPersistence().clearCache(studentDetails);
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
    public static List<StudentDetails> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<StudentDetails> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<StudentDetails> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static StudentDetails update(StudentDetails studentDetails)
        throws SystemException {
        return getPersistence().update(studentDetails);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static StudentDetails update(StudentDetails studentDetails,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(studentDetails, serviceContext);
    }

    /**
    * Returns the student details where studentId = &#63; or throws a {@link net.opentrends.studentdata.NoSuchStudentDetailsException} if it could not be found.
    *
    * @param studentId the student ID
    * @return the matching student details
    * @throws net.opentrends.studentdata.NoSuchStudentDetailsException if a matching student details could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentDetails findByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentDetailsException {
        return getPersistence().findByStudentId(studentId);
    }

    /**
    * Returns the student details where studentId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param studentId the student ID
    * @return the matching student details, or <code>null</code> if a matching student details could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentDetails fetchByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStudentId(studentId);
    }

    /**
    * Returns the student details where studentId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param studentId the student ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching student details, or <code>null</code> if a matching student details could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentDetails fetchByStudentId(
        long studentId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByStudentId(studentId, retrieveFromCache);
    }

    /**
    * Removes the student details where studentId = &#63; from the database.
    *
    * @param studentId the student ID
    * @return the student details that was removed
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentDetails removeByStudentId(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentDetailsException {
        return getPersistence().removeByStudentId(studentId);
    }

    /**
    * Returns the number of student detailses where studentId = &#63;.
    *
    * @param studentId the student ID
    * @return the number of matching student detailses
    * @throws SystemException if a system exception occurred
    */
    public static int countByStudentId(long studentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByStudentId(studentId);
    }

    /**
    * Caches the student details in the entity cache if it is enabled.
    *
    * @param studentDetails the student details
    */
    public static void cacheResult(
        net.opentrends.studentdata.model.StudentDetails studentDetails) {
        getPersistence().cacheResult(studentDetails);
    }

    /**
    * Caches the student detailses in the entity cache if it is enabled.
    *
    * @param studentDetailses the student detailses
    */
    public static void cacheResult(
        java.util.List<net.opentrends.studentdata.model.StudentDetails> studentDetailses) {
        getPersistence().cacheResult(studentDetailses);
    }

    /**
    * Creates a new student details with the primary key. Does not add the student details to the database.
    *
    * @param studentId the primary key for the new student details
    * @return the new student details
    */
    public static net.opentrends.studentdata.model.StudentDetails create(
        long studentId) {
        return getPersistence().create(studentId);
    }

    /**
    * Removes the student details with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param studentId the primary key of the student details
    * @return the student details that was removed
    * @throws net.opentrends.studentdata.NoSuchStudentDetailsException if a student details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentDetails remove(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentDetailsException {
        return getPersistence().remove(studentId);
    }

    public static net.opentrends.studentdata.model.StudentDetails updateImpl(
        net.opentrends.studentdata.model.StudentDetails studentDetails)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(studentDetails);
    }

    /**
    * Returns the student details with the primary key or throws a {@link net.opentrends.studentdata.NoSuchStudentDetailsException} if it could not be found.
    *
    * @param studentId the primary key of the student details
    * @return the student details
    * @throws net.opentrends.studentdata.NoSuchStudentDetailsException if a student details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentDetails findByPrimaryKey(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.studentdata.NoSuchStudentDetailsException {
        return getPersistence().findByPrimaryKey(studentId);
    }

    /**
    * Returns the student details with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param studentId the primary key of the student details
    * @return the student details, or <code>null</code> if a student details with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.studentdata.model.StudentDetails fetchByPrimaryKey(
        long studentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(studentId);
    }

    /**
    * Returns all the student detailses.
    *
    * @return the student detailses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.studentdata.model.StudentDetails> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<net.opentrends.studentdata.model.StudentDetails> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

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
    public static java.util.List<net.opentrends.studentdata.model.StudentDetails> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the student detailses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of student detailses.
    *
    * @return the number of student detailses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static StudentDetailsPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (StudentDetailsPersistence) PortletBeanLocatorUtil.locate(net.opentrends.studentdata.service.ClpSerializer.getServletContextName(),
                    StudentDetailsPersistence.class.getName());

            ReferenceRegistry.registerReference(StudentDetailsUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(StudentDetailsPersistence persistence) {
    }
}
