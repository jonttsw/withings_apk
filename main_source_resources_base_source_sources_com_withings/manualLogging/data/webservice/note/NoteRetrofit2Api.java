package com.withings.manualLogging.data.webservice.note;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.InvalidParamsException;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import fr0.c;
import fr0.e;
import fr0.f;
import fr0.o;
import fr0.t;
import kotlin.Metadata;
import qm0.d;
/* compiled from: NoteRetrofit2Api.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u0082\u0001\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u0019\u001a\u00020\u00152\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\rH§@¢\u0006\u0004\b\u001f\u0010 J$\u0010\"\u001a\u00020\u001e2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\rH§@¢\u0006\u0004\b\"\u0010 J$\u0010#\u001a\u00020\u001e2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\rH§@¢\u0006\u0004\b#\u0010 J$\u0010$\u001a\u00020\u001e2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\rH§@¢\u0006\u0004\b$\u0010 J$\u0010&\u001a\u00020\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\rH§@¢\u0006\u0004\b&\u0010 J$\u0010(\u001a\u00020\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010'\u001a\u00020\rH§@¢\u0006\u0004\b(\u0010 J$\u0010*\u001a\u00020\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020\rH§@¢\u0006\u0004\b*\u0010 J$\u0010+\u001a\u00020\u001b2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\rH§@¢\u0006\u0004\b+\u0010 ¨\u0006,À\u0006\u0003"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/NoteRetrofit2Api;", "", "", NavigationArguments.USER_ID, "lastUpdateInSeconds", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/manualLogging/data/webservice/note/GetNoteGroupResponse;", "getNoteGroups", "(JLjava/lang/Long;ILqm0/d;)Ljava/lang/Object;", "date", "measureGroupId", "signalId", "", "cryptpart", "symptoms", "medicines", "texts", "pathlists", "", "noSymptom", "Lcom/withings/manualLogging/data/webservice/note/SaveNoteGroupResponse;", "storeNoteGroup", "(JJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "noteGroupId", "updateNoteGroup", "(JJZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/manualLogging/data/webservice/note/DeleteResponse;", "deleteNoteGroup", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/manualLogging/data/webservice/note/StoreNoteResponse;", "storeComments", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "symptomids", "storeSymptoms", "storeMedicines", "storeImages", "textids", "deleteComments", "assosymptomids", "deleteSymptoms", "assomedicineids", "deleteMedicines", "deleteImage", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NoteRetrofit2Api {
    @e
    @o("v2/notegrp?action=deletetexts")
    Object deleteComments(@t("notegrpid") long j5, @c("textids") String str, d<? super DeleteResponse> dVar);

    @e
    @o("v2/notegrp?action=deleteimages")
    Object deleteImage(@t("notegrpid") long j5, @c("pathlistids") String str, d<? super DeleteResponse> dVar);

    @e
    @o("v2/notegrp?action=deletemedicines")
    Object deleteMedicines(@t("notegrpid") long j5, @c("assomedicineids") String str, d<? super DeleteResponse> dVar);

    @o("v2/notegrp?action=delete")
    Object deleteNoteGroup(@t("notegrpid") long j5, d<? super DeleteResponse> dVar) throws ObjectNotFoundException;

    @e
    @o("v2/notegrp?action=deletesymptoms")
    Object deleteSymptoms(@t("notegrpid") long j5, @c("assosymptomids") String str, d<? super DeleteResponse> dVar);

    @f("v2/notegrp?action=getbyuserid")
    Object getNoteGroups(@t("userid") long j5, @t("lastupdate") Long l5, @t("offset") int i11, d<? super GetNoteGroupResponse> dVar);

    @e
    @o("v2/notegrp?action=addtexts")
    Object storeComments(@t("notegrpid") long j5, @c("texts") String str, d<? super StoreNoteResponse> dVar);

    @e
    @o("v2/notegrp?action=addimages")
    Object storeImages(@t("notegrpid") long j5, @c("pathlists") String str, d<? super StoreNoteResponse> dVar);

    @e
    @o("v2/notegrp?action=addmedicines")
    Object storeMedicines(@t("notegrpid") long j5, @c("medicines") String str, d<? super StoreNoteResponse> dVar);

    @e
    @o("v2/notegrp?action=create")
    Object storeNoteGroup(@t("userid") long j5, @t("notetime") long j11, @t("grpid") Long l5, @t("signalid") Long l6, @t("cryptpart") String str, @c("symptoms") String str2, @c("medicines") String str3, @c("texts") String str4, @c("pathlists") String str5, @c("no_symptom") boolean z5, d<? super SaveNoteGroupResponse> dVar) throws InvalidParamsException, ObjectNotFoundException, AlreadyExistsException;

    @e
    @o("v2/notegrp?action=addsymptoms")
    Object storeSymptoms(@t("notegrpid") long j5, @c("symptomids") String str, d<? super StoreNoteResponse> dVar);

    @o("v2/notegrp?action=update")
    Object updateNoteGroup(@t("notegrpid") long j5, @t("notetime") long j11, @t("no_symptom") boolean z5, d<? super SaveNoteGroupResponse> dVar);
}
