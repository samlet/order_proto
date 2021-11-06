package com.bluecc.bluesrv.common;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public enum RoleType {
    MAIN_ROLE("MAIN_ROLE", "", "Main Role"),
    ACCOUNT_LEAD("ACCOUNT_LEAD", "", "Account Lead"),
    ADMIN("ADMIN", "", "Administrator"),
    AGENT("AGENT", "", "Agent"),
    AUTOMATED_AGENT_ROLE("AUTOMATED_AGENT_ROLE", "", "Automated Agent"),
    CALENDAR_ROLE("CALENDAR_ROLE", "", "Calendar"),
    CLIENT("CLIENT", "", "Client"),
    COMMEVENT_ROLE("COMMEVENT_ROLE", "", "Communication Participant"),
    CONSUMER("CONSUMER", "", "Consumer"),
    CONTRACTOR("CONTRACTOR", "", "Contractor"),
    CUSTOMER("CUSTOMER", "", "Customer"),
    DISTRIBUTION_CHANNEL("DISTRIBUTION_CHANNEL", "", "Distribution Channel"),
    ISP("ISP", "", "ISP"),
    HOSTING_SERVER("HOSTING_SERVER", "", "Hosting Server"),
    MANUFACTURER("MANUFACTURER", "", "Manufacturer"),
    _NA_("_NA_", "", "Not Applicable"),
    ORGANIZATION_ROLE("ORGANIZATION_ROLE", "MAIN_ROLE", "Organization"),
    OWNER("OWNER", "", "Owner"),
    PROSPECT("PROSPECT", "", "Prospect"),
    PERSON_ROLE("PERSON_ROLE", "", "Person"),
    REFERRER("REFERRER", "", "Referrer"),
    REQUEST_ROLE("REQUEST_ROLE", "", "Request Role"),
    REQ_MANAGER("REQ_MANAGER", "REQUEST_ROLE", "Request Manager"),
    REQ_REQUESTER("REQ_REQUESTER", "REQUEST_ROLE", "Requesting Party"),
    REQ_TAKER("REQ_TAKER", "REQUEST_ROLE", "Request Taker"),
    REQ_RESPOND("REQ_RESPOND", "REQUEST_ROLE", "Request Respondent"),
    SFA_ROLE("SFA_ROLE", "MAIN_ROLE", "Sales Force Autm."),
    SHAREHOLDER("SHAREHOLDER", "", "Shareholder"),
    SUBSCRIBER("SUBSCRIBER", "", "Subscriber"),
    VENDOR("VENDOR", "", "Vendor"),
    VISITOR("VISITOR", "", "Visitor"),
    WEB_MASTER("WEB_MASTER", "", "Web Master"),
    WORKFLOW_ROLE("WORKFLOW_ROLE", "", "Workflow"),
    ACCOUNTANT("ACCOUNTANT", "", "Accountant"),
    ACCOUNT("ACCOUNT", "SFA_ROLE", "Account"),
    ADDRESSEE("ADDRESSEE", "COMMEVENT_ROLE", "Addressee"),
    ASSOCIATION("ASSOCIATION", "ORGANIZATION_ROLE", "Association"),
    BILL_FROM_VENDOR("BILL_FROM_VENDOR", "VENDOR", "Bill-From Vendor"),
    BILL_TO_CUSTOMER("BILL_TO_CUSTOMER", "CUSTOMER", "Bill-To Customer"),
    BCC("BCC", "COMMEVENT_ROLE", "Blind Copy"),
    BULK_CUSTOMER("BULK_CUSTOMER", "CUSTOMER", "Bulk Customer"),
    CAL_ATTENDEE("CAL_ATTENDEE", "CALENDAR_ROLE", "Calendar Attendee"),
    CAL_DELEGATE("CAL_DELEGATE", "CALENDAR_ROLE", "Calendar Delegate"),
    CAL_HOST("CAL_HOST", "CALENDAR_ROLE", "Calendar Host"),
    CAL_ORGANIZER("CAL_ORGANIZER", "CALENDAR_ROLE", "Calendar Organizer"),
    CAL_OWNER("CAL_OWNER", "CALENDAR_ROLE", "Calendar Owner"),
    CARRIER("CARRIER", "ORGANIZATION_ROLE", "Carrier"),
    COMPETITOR("COMPETITOR", "ORGANIZATION_ROLE", "Competitor"),
    CONTACT("CONTACT", "SFA_ROLE", "Contact"),
    CC("CC", "COMMEVENT_ROLE", "Carbon Copy"),
    ORIGINATOR("ORIGINATOR", "COMMEVENT_ROLE", "Originator"),
    DISTRIBUTOR("DISTRIBUTOR", "DISTRIBUTION_CHANNEL", "Distributor"),
    EMPLOYEE("EMPLOYEE", "PERSON_ROLE", "Employee"),
    END_USER_CUSTOMER("END_USER_CUSTOMER", "CUSTOMER", "End-User Customer"),
    HOUSEHOLD("HOUSEHOLD", "ORGANIZATION_ROLE", "Household"),
    INTERNAL_ORGANIZATIO("INTERNAL_ORGANIZATIO", "ORGANIZATION_ROLE", "Internal Organization"),
    LEAD("LEAD", "SFA_ROLE", "Lead"),
    LTD_ADMIN("LTD_ADMIN", "ADMIN", "Limited Administrator"),
    ORGANIZATION_UNIT("ORGANIZATION_UNIT", "ORGANIZATION_ROLE", "Organization Unit"),
    PARTNER("PARTNER", "ORGANIZATION_ROLE", "Partner"),
    PLACING_CUSTOMER("PLACING_CUSTOMER", "CUSTOMER", "Placing Customer"),
    REGULATORY_AGENCY("REGULATORY_AGENCY", "ORGANIZATION_ROLE", "Regulatory Agency"),
    SALES_REP("SALES_REP", "PERSON_ROLE", "Sales Representative"),
    SHIP_FROM_VENDOR("SHIP_FROM_VENDOR", "VENDOR", "Ship-From Vendor"),
    SHIP_TO_CUSTOMER("SHIP_TO_CUSTOMER", "CUSTOMER", "Ship-To Customer"),
    SPONSOR("SPONSOR", "PERSON_ROLE", "Sponsor"),
    SPOUSE("SPOUSE", "PERSON_ROLE", "Spouse"),
    SUPPLIER_AGENT("SUPPLIER_AGENT", "PERSON_ROLE", "Supplier Agent"),
    SUPPLIER("SUPPLIER", "ORGANIZATION_ROLE", "Supplier"),
    TAX_AUTHORITY("TAX_AUTHORITY", "ORGANIZATION_ROLE", "Tax Authority"),
    UNION("UNION", "ORGANIZATION_ROLE", "Union"),
    WF_OWNER("WF_OWNER", "WORKFLOW_ROLE", "Workflow Owner"),
    GOV_AGENCY("GOV_AGENCY", "ORGANIZATION_ROLE", "Government Agency"),
    AFFILIATE("AFFILIATE", "SALES_REP", "Affiliate"),
    BUYER("BUYER", "EMPLOYEE", "Buyer"),
    CASHIER("CASHIER", "EMPLOYEE", "Cashier"),
    DEPARTMENT("DEPARTMENT", "ORGANIZATION_UNIT", "Department"),
    DIVISION("DIVISION", "ORGANIZATION_UNIT", "Division"),
    FAMILY_MEMBER("FAMILY_MEMBER", "PERSON_ROLE", "Family Member"),
    MANAGER("MANAGER", "EMPLOYEE", "Manager"),
    ORDER_CLERK("ORDER_CLERK", "EMPLOYEE", "Order Clerk"),
    OTHER_INTERNAL_ORGAN("OTHER_INTERNAL_ORGAN", "INTERNAL_ORGANIZATIO", "Other Internal"),
    OTHER_ORGANIZATION_U("OTHER_ORGANIZATION_U", "ORGANIZATION_UNIT", "Other Organization Unit"),
    PARENT_ORGANIZATION("PARENT_ORGANIZATION", "ORGANIZATION_UNIT", "Parent Organization"),
    PACKER("PACKER", "EMPLOYEE", "Packer"),
    PICKER("PICKER", "EMPLOYEE", "Picker"),
    RECEIVER("RECEIVER", "EMPLOYEE", "Receiver"),
    SHIPMENT_CLERK("SHIPMENT_CLERK", "EMPLOYEE", "Shipment Clerk"),
    STOCKER("STOCKER", "EMPLOYEE", "Stocker"),
    SUBSIDIARY("SUBSIDIARY", "ORGANIZATION_UNIT", "Subsidiary"),
    WORKER("WORKER", "EMPLOYEE", "Worker"),
    EMAIL_ADMIN("EMAIL_ADMIN", "PERSON_ROLE", "Email Administrator")
    ;

    private static final Map<String, RoleType> BY_TYPE = new HashMap<>();
    private static final Multimap<String, RoleType> BY_PARENT_TYPE = ArrayListMultimap.create();

    static {
        for (RoleType e : values()) {
            BY_TYPE.put(e.typeId, e);
            BY_PARENT_TYPE.put(e.parentType, e);
        }
    }

    public final String typeId;
    public final String parentType;
    public final String description;

    private RoleType(String typeId, String parentType, String description) {
        this.typeId = typeId;
        this.parentType = parentType;
        this.description = description;
    }

    public static RoleType valueOfType(String typeId) {
        return BY_TYPE.get(typeId);
    }

    public static Collection<RoleType> childTypes(String typeId) {
        return BY_PARENT_TYPE.get(typeId);
    }
    public Collection<RoleType> childTypes(){
        return childTypes(this.typeId);
    }
}

