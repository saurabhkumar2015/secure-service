package com.utd.secureservice.service;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import com.utd.secureservice.outbound.response.ApiResponse;

import java.security.NoSuchAlgorithmException;

/**
 * This interface provides methods that perform logic of Updating Product Status and Posting Comments
 */
public interface ISecureService {

	/**
	 * This method is used to post Comments
	 * @param commentsRequest {@link CommentsRequest}
	 * @param httpHeaders {@link HttpHeaders}
	 * @return {@link ResponseEntity<Response>}
	 */
	public ResponseEntity<ApiResponse> getEncryptionKey(String userId) throws NoSuchAlgorithmException;

	ResponseEntity<ApiResponse> persistSensitiveInfo(String info, String userId);
}
