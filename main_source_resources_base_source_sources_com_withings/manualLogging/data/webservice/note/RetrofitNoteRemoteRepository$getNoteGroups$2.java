package com.withings.manualLogging.data.webservice.note;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitNoteRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/manualLogging/data/webservice/note/GetNoteGroupResponse;", "Lcom/withings/manualLogging/data/webservice/note/NoteRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitNoteRemoteRepository$getNoteGroups$2 extends w implements l<NoteRetrofit1Api, GetNoteGroupResponse> {
    final /* synthetic */ Long $lastUpdateInSeconds;
    final /* synthetic */ int $offset;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitNoteRemoteRepository$getNoteGroups$2(long j5, Long l5, int i11) {
        super(1);
        this.$userId = j5;
        this.$lastUpdateInSeconds = l5;
        this.$offset = i11;
    }

    @Override // ym0.l
    public final GetNoteGroupResponse invoke(NoteRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getNoteGroups(this.$userId, this.$lastUpdateInSeconds, this.$offset);
    }
}
