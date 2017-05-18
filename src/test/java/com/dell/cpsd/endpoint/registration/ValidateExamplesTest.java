/**
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries.  All Rights Reserved.
 * Dell EMC Confidential/Proprietary Information
 */

package com.dell.cpsd.endpoint.registration;

import org.junit.Test;

import static com.dell.cpsd.common.json.utils.JsonSchemaValidation.validateSchema;
import static org.junit.Assert.assertNull;

/**
 * This is the schema validation test, this validates json messages
 * conforms to the API.
 * <p>
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries.  All Rights Reserved.
 * Dell EMC Confidential/Proprietary Information
 * </p>
 *
 * @version 1.0
 * @since 1.0
 */
public class ValidateExamplesTest
{
    public static final String SCHEMA_DIR   = "/virtualization-capabilities-api/schema/json/";
    public static final String EXAMPLE_DIR  = "/virtualization-capabilities-api/schema/example/";


    @Test
    public void vcenterDiscoveryRequestInfoTest() throws Exception
    {
        String jsdName = "DiscoveryRequestInfoMessage";
        String jsonName = "VCenterDiscoverRequestMessage";
        String errors = validateSchema(SCHEMA_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", SCHEMA_DIR);
        assertNull(errors, errors);
    }


    @Test
    public void consulRegistrationInfoTest() throws Exception
    {
        String jsdName = "ConsulRegisterRequestMessage";
        String jsonName = "ConsulRegisterRequestMessage";
        String errors = validateSchema(SCHEMA_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", SCHEMA_DIR);
        assertNull(errors, errors);
    }


    @Test
    public void HostMaintenanceModeTest() throws Exception
    {
        String jsdName = "HostMaintenanceModeRequestMessage";
        String jsonName = "HostMaintenanceModeRequestMessage";
        String errors = validateSchema(SCHEMA_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", SCHEMA_DIR);
        assertNull(errors, errors);


        jsdName = "HostMaintenanceModeResponseMessage";
        jsonName = "HostMaintenanceModeResponseMessage";
        errors = validateSchema(SCHEMA_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", SCHEMA_DIR);
        assertNull(errors, errors);
    }


    @Test
    public void HostPowerOperationTest() throws Exception
    {
        String jsdName = "HostPowerOperationRequestMessage";
        String jsonName = "HostPowerOperationRequestMessage";
        String errors = validateSchema(SCHEMA_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", SCHEMA_DIR);
        assertNull(errors, errors);


        jsdName = "HostPowerOperationResponseMessage";
        jsonName = "HostPowerOperationResponseMessage";
        errors = validateSchema(SCHEMA_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", SCHEMA_DIR);
        assertNull(errors, errors);
    }

    @Test
    public void ClusterOperationTest() throws Exception
    {
        String jsdName = "ClusterOperationRequestMessage";
        String jsonName = "ClusterOperationRequestMessage";
        String errors = validateSchema(SCHEMA_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", SCHEMA_DIR);
        assertNull(errors, errors);


        jsdName = "ClusterOperationResponseMessage";
        jsonName = "ClusterOperationResponseMessage";
        errors = validateSchema(SCHEMA_DIR + jsdName + ".jsd", EXAMPLE_DIR + jsonName + ".json", SCHEMA_DIR);
        assertNull(errors, errors);
    }
}
