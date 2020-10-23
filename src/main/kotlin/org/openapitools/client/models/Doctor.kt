/**
* Swagger UI - Cloud Hospital Api-INT
* Cloud Hospital application with Swagger, Swashbuckle, and API versioning.
*
* The version of the OpenAPI document: 1
* Contact: hyounoosung@icloudhospital.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.Article
import org.openapitools.client.models.AuditableEntity
import org.openapitools.client.models.Award
import org.openapitools.client.models.Device
import org.openapitools.client.models.DoctorAffiliation
import org.openapitools.client.models.DoctorCertificate
import org.openapitools.client.models.DoctorEducation
import org.openapitools.client.models.DoctorPortfolio
import org.openapitools.client.models.DoctorReview
import org.openapitools.client.models.DoctorSpecialty
import org.openapitools.client.models.Gender
import org.openapitools.client.models.Media
import org.openapitools.client.models.QuestionComment
import org.openapitools.client.models.UserLanguage
import org.openapitools.client.models.UserLocation

import com.google.gson.annotations.SerializedName

/**
 * 
 * @param slug 
 * @param startPracticeDate 
 * @param overview 
 * @param consultationEnabled 
 * @param consultationFee 
 * @param doctorReviews 
 * @param doctorEducations 
 * @param doctorPortfolios 
 * @param doctorSpecialties 
 * @param doctorCertificates 
 * @param doctorAffiliations 
 * @param awards 
 * @param medias 
 * @param id 
 * @param userName 
 * @param email 
 * @param firstName 
 * @param lastName 
 * @param normalizedName 
 * @param phone 
 * @param photo 
 * @param photoThumbnail 
 * @param gender 
 * @param dateOfBirth 
 * @param timeZone 
 * @param devices 
 * @param articles 
 * @param questionComments 
 * @param locations 
 * @param languages 
 * @param auditableEntity 
 */

data class Doctor (
    @SerializedName("slug")
    val slug: kotlin.String? = null,
    @SerializedName("startPracticeDate")
    val startPracticeDate: java.time.LocalDateTime? = null,
    @SerializedName("overview")
    val overview: kotlin.String? = null,
    @SerializedName("consultationEnabled")
    val consultationEnabled: kotlin.Boolean? = null,
    @SerializedName("consultationFee")
    val consultationFee: kotlin.Double? = null,
    @SerializedName("doctorReviews")
    val doctorReviews: kotlin.collections.List<DoctorReview>? = null,
    @SerializedName("doctorEducations")
    val doctorEducations: kotlin.collections.List<DoctorEducation>? = null,
    @SerializedName("doctorPortfolios")
    val doctorPortfolios: kotlin.collections.List<DoctorPortfolio>? = null,
    @SerializedName("doctorSpecialties")
    val doctorSpecialties: kotlin.collections.List<DoctorSpecialty>? = null,
    @SerializedName("doctorCertificates")
    val doctorCertificates: kotlin.collections.List<DoctorCertificate>? = null,
    @SerializedName("doctorAffiliations")
    val doctorAffiliations: kotlin.collections.List<DoctorAffiliation>? = null,
    @SerializedName("awards")
    val awards: kotlin.collections.List<Award>? = null,
    @SerializedName("medias")
    val medias: kotlin.collections.List<Media>? = null,
    @SerializedName("id")
    val id: java.util.UUID? = null,
    @SerializedName("userName")
    val userName: kotlin.String? = null,
    @SerializedName("email")
    val email: kotlin.String? = null,
    @SerializedName("firstName")
    val firstName: kotlin.String? = null,
    @SerializedName("lastName")
    val lastName: kotlin.String? = null,
    @SerializedName("normalizedName")
    val normalizedName: kotlin.String? = null,
    @SerializedName("phone")
    val phone: kotlin.String? = null,
    @SerializedName("photo")
    val photo: kotlin.String? = null,
    @SerializedName("photoThumbnail")
    val photoThumbnail: kotlin.String? = null,
    @SerializedName("gender")
    val gender: Gender? = null,
    @SerializedName("dateOfBirth")
    val dateOfBirth: java.time.LocalDateTime? = null,
    @SerializedName("timeZone")
    val timeZone: kotlin.String? = null,
    @SerializedName("devices")
    val devices: kotlin.collections.List<Device>? = null,
    @SerializedName("articles")
    val articles: kotlin.collections.List<Article>? = null,
    @SerializedName("questionComments")
    val questionComments: kotlin.collections.List<QuestionComment>? = null,
    @SerializedName("locations")
    val locations: kotlin.collections.List<UserLocation>? = null,
    @SerializedName("languages")
    val languages: kotlin.collections.List<UserLanguage>? = null,
    @SerializedName("auditableEntity")
    val auditableEntity: AuditableEntity? = null
)
