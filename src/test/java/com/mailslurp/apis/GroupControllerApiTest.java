/*
 * MailSlurp API
 * MailSlurp is an API for sending and receiving emails from dynamically allocated email addresses. It's designed for developers and QA teams to test applications, process inbound emails, send templated notifications, attachments, and more.  ## Resources  - [Homepage](https://www.mailslurp.com) - Get an [API KEY](https://app.mailslurp.com/sign-up/) - Generated [SDK Clients](https://docs.mailslurp.com/) - [Examples](https://github.com/mailslurp/examples) repository
 *
 * The version of the OpenAPI document: 6.5.2
 * Contact: contact@mailslurp.dev
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mailslurp.apis;

import com.mailslurp.clients.ApiException;
import com.mailslurp.models.CreateGroupOptions;
import com.mailslurp.models.GroupContactsDto;
import com.mailslurp.models.GroupDto;
import com.mailslurp.models.GroupProjection;
import java.time.OffsetDateTime;
import com.mailslurp.models.PageContactProjection;
import com.mailslurp.models.PageGroupProjection;
import java.util.UUID;
import com.mailslurp.models.UpdateGroupContacts;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GroupControllerApi
 */
@Ignore
public class GroupControllerApiTest {

    private final GroupControllerApi api = new GroupControllerApi();

    
    /**
     * Add contacts to a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addContactsToGroupTest() throws ApiException {
        UUID groupId = null;
        UpdateGroupContacts updateGroupContacts = null;
        GroupContactsDto response = api.addContactsToGroup(groupId, updateGroupContacts);

        // TODO: test validations
    }
    
    /**
     * Create a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createGroupTest() throws ApiException {
        CreateGroupOptions createGroupOptions = null;
        GroupDto response = api.createGroup(createGroupOptions);

        // TODO: test validations
    }
    
    /**
     * Delete group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteGroupTest() throws ApiException {
        UUID groupId = null;
        api.deleteGroup(groupId);

        // TODO: test validations
    }
    
    /**
     * Get all Contact Groups in paginated format
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllGroupsTest() throws ApiException {
        Integer page = null;
        Integer size = null;
        String sort = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        PageGroupProjection response = api.getAllGroups(page, size, sort, since, before);

        // TODO: test validations
    }
    
    /**
     * Get group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupTest() throws ApiException {
        UUID groupId = null;
        GroupDto response = api.getGroup(groupId);

        // TODO: test validations
    }
    
    /**
     * Get group and contacts belonging to it
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupWithContactsTest() throws ApiException {
        UUID groupId = null;
        GroupContactsDto response = api.getGroupWithContacts(groupId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get group and paginated contacts belonging to it
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupWithContactsPaginatedTest() throws ApiException {
        UUID groupId = null;
        Integer page = null;
        Integer size = null;
        String sort = null;
        OffsetDateTime since = null;
        OffsetDateTime before = null;
        PageContactProjection response = api.getGroupWithContactsPaginated(groupId, page, size, sort, since, before);

        // TODO: test validations
    }
    
    /**
     * Get all groups
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGroupsTest() throws ApiException {
        List<GroupProjection> response = api.getGroups();

        // TODO: test validations
    }
    
    /**
     * Remove contacts from a group
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeContactsFromGroupTest() throws ApiException {
        UUID groupId = null;
        UpdateGroupContacts updateGroupContacts = null;
        GroupContactsDto response = api.removeContactsFromGroup(groupId, updateGroupContacts);

        // TODO: test validations
    }
    
}