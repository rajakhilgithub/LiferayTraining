package net.opentrends.candidate.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RegistrationLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see RegistrationLocalService
 * @generated
 */
public class RegistrationLocalServiceWrapper implements RegistrationLocalService,
    ServiceWrapper<RegistrationLocalService> {
    private RegistrationLocalService _registrationLocalService;

    public RegistrationLocalServiceWrapper(
        RegistrationLocalService registrationLocalService) {
        _registrationLocalService = registrationLocalService;
    }

    /**
    * Adds the registration to the database. Also notifies the appropriate model listeners.
    *
    * @param registration the registration
    * @return the registration that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.candidate.model.Registration addRegistration(
        net.opentrends.candidate.model.Registration registration)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _registrationLocalService.addRegistration(registration);
    }

    /**
    * Creates a new registration with the primary key. Does not add the registration to the database.
    *
    * @param id the primary key for the new registration
    * @return the new registration
    */
    @Override
    public net.opentrends.candidate.model.Registration createRegistration(
        long id) {
        return _registrationLocalService.createRegistration(id);
    }

    /**
    * Deletes the registration with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the registration
    * @return the registration that was removed
    * @throws PortalException if a registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.candidate.model.Registration deleteRegistration(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _registrationLocalService.deleteRegistration(id);
    }

    /**
    * Deletes the registration from the database. Also notifies the appropriate model listeners.
    *
    * @param registration the registration
    * @return the registration that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.candidate.model.Registration deleteRegistration(
        net.opentrends.candidate.model.Registration registration)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _registrationLocalService.deleteRegistration(registration);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _registrationLocalService.dynamicQuery();
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
        return _registrationLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.candidate.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _registrationLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link net.opentrends.candidate.model.impl.RegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _registrationLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _registrationLocalService.dynamicQueryCount(dynamicQuery);
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
        return _registrationLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public net.opentrends.candidate.model.Registration fetchRegistration(
        long id) throws com.liferay.portal.kernel.exception.SystemException {
        return _registrationLocalService.fetchRegistration(id);
    }

    /**
    * Returns the registration with the primary key.
    *
    * @param id the primary key of the registration
    * @return the registration
    * @throws PortalException if a registration with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.candidate.model.Registration getRegistration(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _registrationLocalService.getRegistration(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _registrationLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<net.opentrends.candidate.model.Registration> getRegistrations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _registrationLocalService.getRegistrations(start, end);
    }

    /**
    * Returns the number of registrations.
    *
    * @return the number of registrations
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getRegistrationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _registrationLocalService.getRegistrationsCount();
    }

    /**
    * Updates the registration in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param registration the registration
    * @return the registration that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public net.opentrends.candidate.model.Registration updateRegistration(
        net.opentrends.candidate.model.Registration registration)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _registrationLocalService.updateRegistration(registration);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _registrationLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _registrationLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _registrationLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<net.opentrends.candidate.model.Registration> findByGroupId(
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _registrationLocalService.findByGroupId(groupId);
    }

    @Override
    public java.lang.String getImageUrl(
        com.liferay.portal.kernel.repository.model.FileEntry fileEntry,
        com.liferay.portal.theme.ThemeDisplay themeDisplay) {
        return _registrationLocalService.getImageUrl(fileEntry, themeDisplay);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RegistrationLocalService getWrappedRegistrationLocalService() {
        return _registrationLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRegistrationLocalService(
        RegistrationLocalService registrationLocalService) {
        _registrationLocalService = registrationLocalService;
    }

    @Override
    public RegistrationLocalService getWrappedService() {
        return _registrationLocalService;
    }

    @Override
    public void setWrappedService(
        RegistrationLocalService registrationLocalService) {
        _registrationLocalService = registrationLocalService;
    }
}
