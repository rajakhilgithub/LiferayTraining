package net.opentrends.candidate.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import net.opentrends.candidate.model.Registration;

import java.util.List;

/**
 * The persistence utility for the registration service. This utility wraps {@link RegistrationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationPersistence
 * @see RegistrationPersistenceImpl
 * @generated
 */
public class RegistrationUtil {
    private static RegistrationPersistence _persistence;

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
    public static void clearCache(Registration registration) {
        getPersistence().clearCache(registration);
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
    public static List<Registration> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Registration> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Registration> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Registration update(Registration registration)
        throws SystemException {
        return getPersistence().update(registration);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Registration update(Registration registration,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(registration, serviceContext);
    }

    /**
    * Returns all the registrations where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching registrations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.candidate.model.Registration> findBygroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygroupId(groupId);
    }

    /**
    * Returns a range of all the registrations where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.candidate.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of registrations
    * @param end the upper bound of the range of registrations (not inclusive)
    * @return the range of matching registrations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.candidate.model.Registration> findBygroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBygroupId(groupId, start, end);
    }

    /**
    * Returns an ordered range of all the registrations where groupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.candidate.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param groupId the group ID
    * @param start the lower bound of the range of registrations
    * @param end the upper bound of the range of registrations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching registrations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.candidate.model.Registration> findBygroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBygroupId(groupId, start, end, orderByComparator);
    }

    /**
    * Returns the first registration in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching registration
    * @throws net.opentrends.candidate.NoSuchRegistrationException if a matching registration could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.candidate.model.Registration findBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.candidate.NoSuchRegistrationException {
        return getPersistence().findBygroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the first registration in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching registration, or <code>null</code> if a matching registration could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.candidate.model.Registration fetchBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygroupId_First(groupId, orderByComparator);
    }

    /**
    * Returns the last registration in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching registration
    * @throws net.opentrends.candidate.NoSuchRegistrationException if a matching registration could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.candidate.model.Registration findBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.candidate.NoSuchRegistrationException {
        return getPersistence().findBygroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the last registration in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching registration, or <code>null</code> if a matching registration could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.candidate.model.Registration fetchBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBygroupId_Last(groupId, orderByComparator);
    }

    /**
    * Returns the registrations before and after the current registration in the ordered set where groupId = &#63;.
    *
    * @param id the primary key of the current registration
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next registration
    * @throws net.opentrends.candidate.NoSuchRegistrationException if a registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.candidate.model.Registration[] findBygroupId_PrevAndNext(
        long id, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.candidate.NoSuchRegistrationException {
        return getPersistence()
                   .findBygroupId_PrevAndNext(id, groupId, orderByComparator);
    }

    /**
    * Removes all the registrations where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBygroupId(groupId);
    }

    /**
    * Returns the number of registrations where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching registrations
    * @throws SystemException if a system exception occurred
    */
    public static int countBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBygroupId(groupId);
    }

    /**
    * Caches the registration in the entity cache if it is enabled.
    *
    * @param registration the registration
    */
    public static void cacheResult(
        net.opentrends.candidate.model.Registration registration) {
        getPersistence().cacheResult(registration);
    }

    /**
    * Caches the registrations in the entity cache if it is enabled.
    *
    * @param registrations the registrations
    */
    public static void cacheResult(
        java.util.List<net.opentrends.candidate.model.Registration> registrations) {
        getPersistence().cacheResult(registrations);
    }

    /**
    * Creates a new registration with the primary key. Does not add the registration to the database.
    *
    * @param id the primary key for the new registration
    * @return the new registration
    */
    public static net.opentrends.candidate.model.Registration create(long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the registration with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the registration
    * @return the registration that was removed
    * @throws net.opentrends.candidate.NoSuchRegistrationException if a registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.candidate.model.Registration remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.candidate.NoSuchRegistrationException {
        return getPersistence().remove(id);
    }

    public static net.opentrends.candidate.model.Registration updateImpl(
        net.opentrends.candidate.model.Registration registration)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(registration);
    }

    /**
    * Returns the registration with the primary key or throws a {@link net.opentrends.candidate.NoSuchRegistrationException} if it could not be found.
    *
    * @param id the primary key of the registration
    * @return the registration
    * @throws net.opentrends.candidate.NoSuchRegistrationException if a registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.candidate.model.Registration findByPrimaryKey(
        long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.candidate.NoSuchRegistrationException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the registration with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the registration
    * @return the registration, or <code>null</code> if a registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static net.opentrends.candidate.model.Registration fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the registrations.
    *
    * @return the registrations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.candidate.model.Registration> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the registrations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.candidate.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of registrations
    * @param end the upper bound of the range of registrations (not inclusive)
    * @return the range of registrations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.candidate.model.Registration> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the registrations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.candidate.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of registrations
    * @param end the upper bound of the range of registrations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of registrations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<net.opentrends.candidate.model.Registration> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the registrations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of registrations.
    *
    * @return the number of registrations
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RegistrationPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RegistrationPersistence) PortletBeanLocatorUtil.locate(net.opentrends.candidate.service.ClpSerializer.getServletContextName(),
                    RegistrationPersistence.class.getName());

            ReferenceRegistry.registerReference(RegistrationUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RegistrationPersistence persistence) {
    }
}
