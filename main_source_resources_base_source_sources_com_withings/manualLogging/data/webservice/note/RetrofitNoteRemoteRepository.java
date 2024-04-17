package com.withings.manualLogging.data.webservice.note;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitNoteRemoteRepository.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b8\u00109J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0096@¢\u0006\u0004\b\f\u0010\rJn\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001f\u0010 J \u0010\"\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\"\u0010#J \u0010%\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b%\u0010#J \u0010&\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b&\u0010#J \u0010(\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b(\u0010#J \u0010*\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b*\u0010#J \u0010,\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b,\u0010#J \u0010.\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b.\u0010#J \u0010/\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b/\u0010#R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00106\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u000205038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/withings/manualLogging/data/webservice/note/RetrofitNoteRemoteRepository;", "Lcom/withings/manualLogging/data/webservice/note/NoteRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/manualLogging/data/webservice/note/NoteRemoteRepository;", "", NavigationArguments.USER_ID, "lastUpdateInSeconds", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/manualLogging/data/webservice/note/GetNoteGroupResponse;", "getNoteGroups", "(JLjava/lang/Long;ILqm0/d;)Ljava/lang/Object;", "date", "measureGroupId", "signalId", "cryptPart", "symptoms", "medicines", "texts", "pathList", "", "noSymptom", "Lcom/withings/manualLogging/data/webservice/note/SaveNoteGroupResponse;", "storeNoteGroup", "(JJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "noteGroupId", "updateNoteGroup", "(JJZLqm0/d;)Ljava/lang/Object;", "Lcom/withings/manualLogging/data/webservice/note/DeleteResponse;", "deleteNoteGroup", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/manualLogging/data/webservice/note/StoreNoteResponse;", "storeComments", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "symptomIds", "storeSymptoms", "storeMedicines", "pathLists", "storeImages", "textIds", "deleteComments", "assoSymptomIds", "deleteSymptoms", "assoMedicineIds", "deleteMedicines", "deleteImage", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/manualLogging/data/webservice/note/NoteRetrofit1Api;", "Lcom/withings/manualLogging/data/webservice/note/NoteRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RetrofitNoteRemoteRepository implements NoteRemoteRepository {
    private final b compatWebservicesFactory;
    private final a<NoteRetrofit1Api, NoteRetrofit2Api> compatWs;

    public RetrofitNoteRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWs = compatWebservicesFactory.a(str, NoteRetrofit1Api.class, NoteRetrofit2Api.class);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object deleteComments(long j5, String str, d<? super DeleteResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$deleteComments$2(j5, str), new RetrofitNoteRemoteRepository$deleteComments$3(j5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object deleteImage(long j5, String str, d<? super DeleteResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$deleteImage$2(j5, str), new RetrofitNoteRemoteRepository$deleteImage$3(j5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object deleteMedicines(long j5, String str, d<? super DeleteResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$deleteMedicines$2(j5, str), new RetrofitNoteRemoteRepository$deleteMedicines$3(j5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object deleteNoteGroup(long j5, d<? super DeleteResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$deleteNoteGroup$2(j5), new RetrofitNoteRemoteRepository$deleteNoteGroup$3(j5, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object deleteSymptoms(long j5, String str, d<? super DeleteResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$deleteSymptoms$2(j5, str), new RetrofitNoteRemoteRepository$deleteSymptoms$3(j5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object getNoteGroups(long j5, Long l5, int i11, d<? super GetNoteGroupResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$getNoteGroups$2(j5, l5, i11), new RetrofitNoteRemoteRepository$getNoteGroups$3(j5, l5, i11, null), null, false, dVar, 124);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object storeComments(long j5, String str, d<? super StoreNoteResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$storeComments$2(j5, str), new RetrofitNoteRemoteRepository$storeComments$3(j5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object storeImages(long j5, String str, d<? super StoreNoteResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$storeImages$2(j5, str), new RetrofitNoteRemoteRepository$storeImages$3(j5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object storeMedicines(long j5, String str, d<? super StoreNoteResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$storeMedicines$2(j5, str), new RetrofitNoteRemoteRepository$storeMedicines$3(j5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object storeNoteGroup(long j5, long j11, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, boolean z5, d<? super SaveNoteGroupResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$storeNoteGroup$2(j5, j11, l5, l6, str, str2, str3, str4, str5, z5), new RetrofitNoteRemoteRepository$storeNoteGroup$3(j5, j11, l5, l6, str, str2, str3, str4, str5, z5, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object storeSymptoms(long j5, String str, d<? super StoreNoteResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$storeSymptoms$2(j5, str), new RetrofitNoteRemoteRepository$storeSymptoms$3(j5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public Object updateNoteGroup(long j5, long j11, boolean z5, d<? super SaveNoteGroupResponse> dVar) {
        return a.d(this.compatWs, new RetrofitNoteRemoteRepository$updateNoteGroup$2(j5, j11, z5), new RetrofitNoteRemoteRepository$updateNoteGroup$3(j5, j11, z5, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.note.NoteRemoteRepository
    public NoteRemoteRepository withSyncContext(String str) {
        return new RetrofitNoteRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitNoteRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
