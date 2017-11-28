package net.opentrends.training.service.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.training.service.model.Employee;

import java.util.List;

/**
 * The persistence utility for the employee service. This utility wraps {@link EmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeePersistence
 * @see EmployeePersistenceImpl
 * @generated
 */
public class EmployeeUtil {
    private static EmployeePersistence _persistence;

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
    public static void clearCache(Employee employee) {
        getPersistence().clearCache(employee);
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
    public static List<Employee> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Employee> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Employee> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Employee update(Employee employee) throws SystemException {
        return getPersistence().update(employee);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Employee update(Employee employee,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(employee, serviceContext);
    }

    /**
    * Returns the employee where employeeId = &#63; or throws a {@link net.opentrends.training.service.NoSuchEmployeeException} if it could not be found.
    *
    * @param employeeId the employee ID
    * @return the matching employee
    * @throws net.opentrends.training.service.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee findByEmployeeId(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployeeException {
        return getPersistence().findByEmployeeId(employeeId);
    }

    /**
    * Returns the employee where employeeId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param employeeId the employee ID
    * @return the matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee fetchByEmployeeId(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByEmployeeId(employeeId);
    }

    /**
    * Returns the employee where employeeId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param employeeId the employee ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee fetchByEmployeeId(
        long employeeId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByEmployeeId(employeeId, retrieveFromCache);
    }

    /**
    * Removes the employee where employeeId = &#63; from the database.
    *
    * @param employeeId the employee ID
    * @return the employee that was removed
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee removeByEmployeeId(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployeeException {
        return getPersistence().removeByEmployeeId(employeeId);
    }

    /**
    * Returns the number of employees where employeeId = &#63;.
    *
    * @param employeeId the employee ID
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByEmployeeId(long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByEmployeeId(employeeId);
    }

    /**
    * Returns the employee where employeeName = &#63; or throws a {@link net.opentrends.training.service.NoSuchEmployeeException} if it could not be found.
    *
    * @param employeeName the employee name
    * @return the matching employee
    * @throws net.opentrends.training.service.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee findByEmployeeName(
        java.lang.String employeeName)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployeeException {
        return getPersistence().findByEmployeeName(employeeName);
    }

    /**
    * Returns the employee where employeeName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param employeeName the employee name
    * @return the matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee fetchByEmployeeName(
        java.lang.String employeeName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByEmployeeName(employeeName);
    }

    /**
    * Returns the employee where employeeName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param employeeName the employee name
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee fetchByEmployeeName(
        java.lang.String employeeName, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByEmployeeName(employeeName, retrieveFromCache);
    }

    /**
    * Removes the employee where employeeName = &#63; from the database.
    *
    * @param employeeName the employee name
    * @return the employee that was removed
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee removeByEmployeeName(
        java.lang.String employeeName)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployeeException {
        return getPersistence().removeByEmployeeName(employeeName);
    }

    /**
    * Returns the number of employees where employeeName = &#63;.
    *
    * @param employeeName the employee name
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByEmployeeName(java.lang.String employeeName)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByEmployeeName(employeeName);
    }

    /**
    * Caches the employee in the entity cache if it is enabled.
    *
    * @param employee the employee
    */
    public static void cacheResult(
        net.opentrends.training.service.model.Employee employee) {
        getPersistence().cacheResult(employee);
    }

    /**
    * Caches the employees in the entity cache if it is enabled.
    *
    * @param employees the employees
    */
    public static void cacheResult(
        java.util.List<net.opentrends.training.service.model.Employee> employees) {
        getPersistence().cacheResult(employees);
    }

    /**
    * Creates a new employee with the primary key. Does not add the employee to the database.
    *
    * @param employeeId the primary key for the new employee
    * @return the new employee
    */
    public static net.opentrends.training.service.model.Employee create(
        long employeeId) {
        return getPersistence().create(employeeId);
    }

    /**
    * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employeeId the primary key of the employee
    * @return the employee that was removed
    * @throws net.opentrends.training.service.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee remove(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployeeException {
        return getPersistence().remove(employeeId);
    }

    public static net.opentrends.training.service.model.Employee updateImpl(
        net.opentrends.training.service.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(employee);
    }

    /**
    * Returns the employee with the primary key or throws a {@link net.opentrends.training.service.NoSuchEmployeeException} if it could not be found.
    *
    * @param employeeId the primary key of the employee
    * @return the employee
    * @throws net.opentrends.training.service.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee findByPrimaryKey(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.training.service.NoSuchEmployeeException {
        return getPersistence().findByPrimaryKey(employeeId);
    }

    /**
    * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employeeId the primary key of the employee
    * @return the employee, or <code>null</code> if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.training.service.model.Employee fetchByPrimaryKey(
        long employeeId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(employeeId);
    }

    /**
    * Returns all the employees.
    *
    * @return the employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.service.model.Employee> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.service.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.service.model.Employee> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.training.service.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.training.service.model.Employee> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the employees from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of employees.
    *
    * @return the number of employees
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EmployeePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EmployeePersistence) PortletBeanLocatorUtil.locate(net.opentrends.training.service.service.ClpSerializer.getServletContextName(),
                    EmployeePersistence.class.getName());

            ReferenceRegistry.registerReference(EmployeeUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EmployeePersistence persistence) {
    }
}
