package com.withings.manualLogging.data.webservice.note;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitNoteRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/manualLogging/data/webservice/note/SaveNoteGroupResponse;", "Lcom/withings/manualLogging/data/webservice/note/NoteRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitNoteRemoteRepository$storeNoteGroup$2 extends w implements l<NoteRetrofit1Api, SaveNoteGroupResponse> {
    final /* synthetic */ String $cryptPart;
    final /* synthetic */ long $date;
    final /* synthetic */ Long $measureGroupId;
    final /* synthetic */ String $medicines;
    final /* synthetic */ boolean $noSymptom;
    final /* synthetic */ String $pathList;
    final /* synthetic */ Long $signalId;
    final /* synthetic */ String $symptoms;
    final /* synthetic */ String $texts;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitNoteRemoteRepository$storeNoteGroup$2(long j5, long j11, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, boolean z5) {
        super(1);
        this.$userId = j5;
        this.$date = j11;
        this.$measureGroupId = l5;
        this.$signalId = l6;
        this.$cryptPart = str;
        this.$symptoms = str2;
        this.$medicines = str3;
        this.$texts = str4;
        this.$pathList = str5;
        this.$noSymptom = z5;
    }

    @Override // ym0.l
    public final SaveNoteGroupResponse invoke(NoteRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.storeNoteGroup(this.$userId, this.$date, this.$measureGroupId, this.$signalId, this.$cryptPart, this.$symptoms, this.$medicines, this.$texts, this.$pathList, this.$noSymptom);
    }
}
