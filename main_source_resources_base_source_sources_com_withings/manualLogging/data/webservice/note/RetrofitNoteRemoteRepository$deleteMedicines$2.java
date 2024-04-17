package com.withings.manualLogging.data.webservice.note;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitNoteRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/manualLogging/data/webservice/note/DeleteResponse;", "Lcom/withings/manualLogging/data/webservice/note/NoteRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitNoteRemoteRepository$deleteMedicines$2 extends w implements l<NoteRetrofit1Api, DeleteResponse> {
    final /* synthetic */ String $assoMedicineIds;
    final /* synthetic */ long $noteGroupId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitNoteRemoteRepository$deleteMedicines$2(long j5, String str) {
        super(1);
        this.$noteGroupId = j5;
        this.$assoMedicineIds = str;
    }

    @Override // ym0.l
    public final DeleteResponse invoke(NoteRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.deleteMedicines(this.$noteGroupId, this.$assoMedicineIds);
    }
}
