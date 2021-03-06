package com.sap.cloud.security.xsuaa.token;

import com.sap.cloud.security.token.Token;

public final class TokenClaims {
	private TokenClaims() {
		throw new IllegalStateException("Utility class");
	}

	public static final String CLAIM_XS_USER_ATTRIBUTES = "xs.user.attributes";
	public static final String CLAIM_SCOPES = "scope";
	/**
	 * @deprecated avoid using directly, make use of Token#getClientId() instead
	 */
	@Deprecated
	public static final String CLAIM_CLIENT_ID = "cid";
	public static final String CLAIM_AUTHORIZATION_PARTY = "azp";
	public static final String CLAIM_USER_NAME = "user_name";
	public static final String CLAIM_GIVEN_NAME = "given_name";
	public static final String CLAIM_FAMILY_NAME = "family_name";
	public static final String CLAIM_EMAIL = "email";
	public static final String CLAIM_ORIGIN = "origin";
	public static final String CLAIM_GRANT_TYPE = "grant_type";
	public static final String CLAIM_ZDN = "zdn";
	public static final String CLAIM_ZONE_ID = "zid";
	public static final String CLAIM_ISSUER = "iss";
	public static final String CLAIM_JKU = "jku";
	public static final String CLAIM_KID = "kid";
}
