package com.withings.manualLogging.data.webservice.note;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.InvalidParamsException;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;
/* compiled from: NoteApi.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001c\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001c\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u0007H'J\u0012\u0010\u000b\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H'J\u001c\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\r\u001a\u00020\u0007H'J-\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00052\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u0012\u001a\u00020\u0013H'¢\u0006\u0002\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0017\u001a\u00020\u0007H'J\u001c\u0010\u0018\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0019\u001a\u00020\u0007H'J\u001c\u0010\u001a\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u0007H'J\u007f\u0010\u001c\u001a\u00020\u001d2\b\b\u0001\u0010\u0010\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u00052\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010#\u001a\u00020$H'¢\u0006\u0002\u0010%J\u001c\u0010&\u001a\u00020\u00162\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010'\u001a\u00020\u0007H'J&\u0010(\u001a\u00020\u001d2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u001e\u001a\u00020\u00052\b\b\u0001\u0010#\u001a\u00020$H'¨\u0006)À\u0006\u0003"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/NoteApi;", "", "deleteComments", "Lcom/withings/manualLogging/data/webservice/note/DeleteResponse;", "noteGroupId", "", "textids", "", "deleteImage", "deleteMedicines", "assomedicineids", "deleteNoteGroup", "deleteSymptoms", "assosymptomids", "getNoteGroups", "Lcom/withings/manualLogging/data/webservice/note/GetNoteGroupResponse;", NavigationArguments.USER_ID, "lastUpdateInSeconds", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "", "(JLjava/lang/Long;I)Lcom/withings/manualLogging/data/webservice/note/GetNoteGroupResponse;", "storeComments", "Lcom/withings/manualLogging/data/webservice/note/StoreNoteResponse;", "texts", "storeImages", "pathlists", "storeMedicines", "medicines", "storeNoteGroup", "Lcom/withings/manualLogging/data/webservice/note/SaveNoteGroupResponse;", "date", "measureGroupId", "signalId", "cryptpart", "symptoms", "noSymptom", "", "(JJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/withings/manualLogging/data/webservice/note/SaveNoteGroupResponse;", "storeSymptoms", "symptomids", "updateNoteGroup", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface NoteApi {

    /* compiled from: NoteApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ SaveNoteGroupResponse storeNoteGroup$default(NoteApi noteApi, long j5, long j11, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, boolean z5, int i11, Object obj) throws InvalidParamsException, ObjectNotFoundException, AlreadyExistsException {
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        boolean z11;
        if (obj == null) {
            if ((i11 & 16) != 0) {
                str6 = null;
            } else {
                str6 = str;
            }
            if ((i11 & 32) != 0) {
                str7 = null;
            } else {
                str7 = str2;
            }
            if ((i11 & 64) != 0) {
                str8 = null;
            } else {
                str8 = str3;
            }
            if ((i11 & 128) != 0) {
                str9 = null;
            } else {
                str9 = str4;
            }
            if ((i11 & 256) != 0) {
                str10 = null;
            } else {
                str10 = str5;
            }
            if ((i11 & 512) != 0) {
                z11 = false;
            } else {
                z11 = z5;
            }
            return noteApi.storeNoteGroup(j5, j11, l5, l6, str6, str7, str8, str9, str10, z11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: storeNoteGroup");
    }

    @POST("/v2/notegrp?action=deletetexts")
    @FormUrlEncoded
    DeleteResponse deleteComments(@Query("notegrpid") long j5, @Field("textids") String str);

    @POST("/v2/notegrp?action=deleteimages")
    @FormUrlEncoded
    DeleteResponse deleteImage(@Query("notegrpid") long j5, @Field("pathlistids") String str);

    @POST("/v2/notegrp?action=deletemedicines")
    @FormUrlEncoded
    DeleteResponse deleteMedicines(@Query("notegrpid") long j5, @Field("assomedicineids") String str);

    @POST("/v2/notegrp?action=delete")
    DeleteResponse deleteNoteGroup(@Query("notegrpid") long j5) throws ObjectNotFoundException;

    @POST("/v2/notegrp?action=deletesymptoms")
    @FormUrlEncoded
    DeleteResponse deleteSymptoms(@Query("notegrpid") long j5, @Field("assosymptomids") String str);

    @GET("/v2/notegrp?action=getbyuserid")
    GetNoteGroupResponse getNoteGroups(@Query("userid") long j5, @Query("lastupdate") Long l5, @Query("offset") int i11);

    @POST("/v2/notegrp?action=addtexts")
    @FormUrlEncoded
    StoreNoteResponse storeComments(@Query("notegrpid") long j5, @Field("texts") String str);

    @POST("/v2/notegrp?action=addimages")
    @FormUrlEncoded
    StoreNoteResponse storeImages(@Query("notegrpid") long j5, @Field("pathlists") String str);

    @POST("/v2/notegrp?action=addmedicines")
    @FormUrlEncoded
    StoreNoteResponse storeMedicines(@Query("notegrpid") long j5, @Field("medicines") String str);

    @POST("/v2/notegrp?action=create")
    @FormUrlEncoded
    SaveNoteGroupResponse storeNoteGroup(@Query("userid") long j5, @Query("notetime") long j11, @Query("grpid") Long l5, @Query("signalid") Long l6, @Query("cryptpart") String str, @Field("symptoms") String str2, @Field("medicines") String str3, @Field("texts") String str4, @Field("pathlists") String str5, @Field("no_symptom") boolean z5) throws InvalidParamsException, ObjectNotFoundException, AlreadyExistsException;

    @POST("/v2/notegrp?action=addsymptoms")
    @FormUrlEncoded
    StoreNoteResponse storeSymptoms(@Query("notegrpid") long j5, @Field("symptomids") String str);

    @POST("/v2/notegrp?action=update")
    SaveNoteGroupResponse updateNoteGroup(@Query("notegrpid") long j5, @Query("notetime") long j11, @Query("no_symptom") boolean z5);
}
