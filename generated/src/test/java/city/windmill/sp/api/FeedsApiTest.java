/*
 * Selling Partner API for Feeds
 * The Selling Partner API for Feeds lets you upload data to Amazon on behalf of a selling partner.
 *
 * OpenAPI spec version: 2020-09-04
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package city.windmill.sp.api;

import city.windmill.sp.ApiException;
import city.windmill.sp.model.CancelFeedResponse;
import city.windmill.sp.model.CreateFeedDocumentResponse;
import city.windmill.sp.model.CreateFeedDocumentSpecification;
import city.windmill.sp.model.CreateFeedResponse;
import city.windmill.sp.model.CreateFeedSpecification;
import city.windmill.sp.model.GetFeedDocumentResponse;
import city.windmill.sp.model.GetFeedResponse;
import city.windmill.sp.model.GetFeedsResponse;
import java.time.OffsetDateTime;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeedsApi
 */
@Ignore
public class FeedsApiTest {

    private final FeedsApi api = new FeedsApi();

    
    /**
     * 
     *
     * Cancels the feed that you specify. Only feeds with processingStatus&#x3D;IN_QUEUE can be cancelled. Cancelled feeds are returned in subsequent calls to the getFeed and getFeeds operations.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelFeedTest() throws ApiException {
        String feedId = null;
        CancelFeedResponse response = api.cancelFeed(feedId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a feed. Encrypt and upload the contents of the feed document before calling this operation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0083 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFeedTest() throws ApiException {
        CreateFeedSpecification body = null;
        CreateFeedResponse response = api.createFeed(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Creates a feed document for the feed type that you specify. This operation returns encryption details for encrypting the contents of the document, as well as a presigned URL for uploading the encrypted feed document contents. It also returns a feedDocumentId value that you can pass in with a subsequent call to the createFeed operation.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0083 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFeedDocumentTest() throws ApiException {
        CreateFeedDocumentSpecification body = null;
        CreateFeedDocumentResponse response = api.createFeedDocument(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns feed details (including the resultDocumentId, if available) for the feed that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 2.0 | 15 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeedTest() throws ApiException {
        String feedId = null;
        GetFeedResponse response = api.getFeed(feedId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns the information required for retrieving a feed document&#39;s contents. This includes a presigned URL for the feed document as well as the information required to decrypt the document&#39;s contents.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeedDocumentTest() throws ApiException {
        String feedDocumentId = null;
        GetFeedDocumentResponse response = api.getFeedDocument(feedDocumentId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns feed details for the feeds that match the filters that you specify.  **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 0.0222 | 10 |  For more information, see \&quot;Usage Plans and Rate Limits\&quot; in the Selling Partner API documentation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeedsTest() throws ApiException {
        List<String> feedTypes = null;
        List<String> marketplaceIds = null;
        Integer pageSize = null;
        List<String> processingStatuses = null;
        OffsetDateTime createdSince = null;
        OffsetDateTime createdUntil = null;
        String nextToken = null;
        GetFeedsResponse response = api.getFeeds(feedTypes, marketplaceIds, pageSize, processingStatuses, createdSince, createdUntil, nextToken);

        // TODO: test validations
    }
    
}
