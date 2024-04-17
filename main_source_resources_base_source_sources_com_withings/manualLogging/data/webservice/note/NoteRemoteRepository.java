package com.withings.manualLogging.data.webservice.note;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import kotlin.Metadata;
import qm0.d;
/* compiled from: NoteRemoteRepository.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJz\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u001f\u0010 J \u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002H¦@¢\u0006\u0004\b\"\u0010#J \u0010%\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0002H¦@¢\u0006\u0004\b%\u0010#J \u0010&\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H¦@¢\u0006\u0004\b&\u0010#J \u0010(\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0002H¦@¢\u0006\u0004\b(\u0010#J \u0010*\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0002H¦@¢\u0006\u0004\b*\u0010#J \u0010,\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0002H¦@¢\u0006\u0004\b,\u0010#J \u0010.\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0002H¦@¢\u0006\u0004\b.\u0010#J \u0010/\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0002H¦@¢\u0006\u0004\b/\u0010#¨\u00060À\u0006\u0003"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/NoteRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/manualLogging/data/webservice/note/NoteRemoteRepository;", "", NavigationArguments.USER_ID, "lastUpdateInSeconds", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/manualLogging/data/webservice/note/GetNoteGroupResponse;", "getNoteGroups", "(JLjava/lang/Long;ILqm0/d;)Ljava/lang/Object;", "date", "measureGroupId", "signalId", "cryptPart", "symptoms", "medicines", "texts", "pathList", "", "noSymptom", "Lcom/withings/manualLogging/data/webservice/note/SaveNoteGroupResponse;", "storeNoteGroup", "(JJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "noteGroupId", "updateNoteGroup", "(JJZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/manualLogging/data/webservice/note/DeleteResponse;", "deleteNoteGroup", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/manualLogging/data/webservice/note/StoreNoteResponse;", "storeComments", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "symptomIds", "storeSymptoms", "storeMedicines", "pathLists", "storeImages", "textIds", "deleteComments", "assoSymptomIds", "deleteSymptoms", "assoMedicineIds", "deleteMedicines", "deleteImage", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface NoteRemoteRepository {

    /* compiled from: NoteRemoteRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object storeNoteGroup$default(NoteRemoteRepository noteRemoteRepository, long j5, long j11, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, boolean z5, d dVar, int i11, Object obj) {
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
            return noteRemoteRepository.storeNoteGroup(j5, j11, l5, l6, str6, str7, str8, str9, str10, z11, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: storeNoteGroup");
    }

    Object deleteComments(long j5, String str, d<? super DeleteResponse> dVar);

    Object deleteImage(long j5, String str, d<? super DeleteResponse> dVar);

    Object deleteMedicines(long j5, String str, d<? super DeleteResponse> dVar);

    Object deleteNoteGroup(long j5, d<? super DeleteResponse> dVar);

    Object deleteSymptoms(long j5, String str, d<? super DeleteResponse> dVar);

    Object getNoteGroups(long j5, Long l5, int i11, d<? super GetNoteGroupResponse> dVar);

    Object storeComments(long j5, String str, d<? super StoreNoteResponse> dVar);

    Object storeImages(long j5, String str, d<? super StoreNoteResponse> dVar);

    Object storeMedicines(long j5, String str, d<? super StoreNoteResponse> dVar);

    Object storeNoteGroup(long j5, long j11, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, boolean z5, d<? super SaveNoteGroupResponse> dVar);

    Object storeSymptoms(long j5, String str, d<? super StoreNoteResponse> dVar);

    Object updateNoteGroup(long j5, long j11, boolean z5, d<? super SaveNoteGroupResponse> dVar);

    NoteRemoteRepository withSyncContext(String str);
}
