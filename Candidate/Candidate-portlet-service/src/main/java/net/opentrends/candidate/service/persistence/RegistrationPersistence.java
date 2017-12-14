package net.opentrends.candidate.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import net.opentrends.candidate.model.Registration;

/**
 * The persistence interface for the registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationPersistenceImpl
 * @see RegistrationUtil
 * @generated
 */
public interface RegistrationPersistence extends BasePersistence<Registration> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link RegistrationUtil} to access the registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the registrations where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the matching registrations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.candidate.model.Registration> findBygroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.candidate.model.Registration> findBygroupId(
        long groupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.candidate.model.Registration> findBygroupId(
        long groupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first registration in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching registration
    * @throws net.opentrends.candidate.NoSuchRegistrationException if a matching registration could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.candidate.model.Registration findBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.candidate.NoSuchRegistrationException;

    /**
    * Returns the first registration in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching registration, or <code>null</code> if a matching registration could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.candidate.model.Registration fetchBygroupId_First(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last registration in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching registration
    * @throws net.opentrends.candidate.NoSuchRegistrationException if a matching registration could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.candidate.model.Registration findBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.candidate.NoSuchRegistrationException;

    /**
    * Returns the last registration in the ordered set where groupId = &#63;.
    *
    * @param groupId the group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching registration, or <code>null</code> if a matching registration could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.candidate.model.Registration fetchBygroupId_Last(
        long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public net.opentrends.candidate.model.Registration[] findBygroupId_PrevAndNext(
        long id, long groupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.candidate.NoSuchRegistrationException;

    /**
    * Removes all the registrations where groupId = &#63; from the database.
    *
    * @param groupId the group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of registrations where groupId = &#63;.
    *
    * @param groupId the group ID
    * @return the number of matching registrations
    * @throws SystemException if a system exception occurred
    */
    public int countBygroupId(long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the registration in the entity cache if it is enabled.
    *
    * @param registration the registration
    */
    public void cacheResult(
        net.opentrends.candidate.model.Registration registration);

    /**
    * Caches the registrations in the entity cache if it is enabled.
    *
    * @param registrations the registrations
    */
    public void cacheResult(
        java.util.List<net.opentrends.candidate.model.Registration> registrations);

    /**
    * Creates a new registration with the primary key. Does not add the registration to the database.
    *
    * @param id the primary key for the new registration
    * @return the new registration
    */
    public net.opentrends.candidate.model.Registration create(long id);

    /**
    * Removes the registration with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the registration
    * @return the registration that was removed
    * @throws net.opentrends.candidate.NoSuchRegistrationException if a registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.candidate.model.Registration remove(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.candidate.NoSuchRegistrationException;

    public net.opentrends.candidate.model.Registration updateImpl(
        net.opentrends.candidate.model.Registration registration)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the registration with the primary key or throws a {@link net.opentrends.candidate.NoSuchRegistrationException} if it could not be found.
    *
    * @param id the primary key of the registration
    * @return the registration
    * @throws net.opentrends.candidate.NoSuchRegistrationException if a registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.candidate.model.Registration findByPrimaryKey(long id)
        throws com.liferay.portal.kernel.exception.SystemException,
            net.opentrends.candidate.NoSuchRegistrationException;

    /**
    * Returns the registration with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the registration
    * @return the registration, or <code>null</code> if a registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public net.opentrends.candidate.model.Registration fetchByPrimaryKey(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the registrations.
    *
    * @return the registrations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<net.opentrends.candidate.model.Registration> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.candidate.model.Registration> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<net.opentrends.candidate.model.Registration> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the registrations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of registrations.
    *
    * @return the number of registrations
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
