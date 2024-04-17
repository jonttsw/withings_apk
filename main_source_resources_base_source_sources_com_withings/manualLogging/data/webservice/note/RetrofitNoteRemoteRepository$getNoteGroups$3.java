package com.withings.manualLogging.data.webservice.note;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitNoteRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/manualLogging/data/webservice/note/GetNoteGroupResponse;", "Lcom/withings/manualLogging/data/webservice/note/NoteRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.manualLogging.data.webservice.note.RetrofitNoteRemoteRepository$getNoteGroups$3", f = "RetrofitNoteRemoteRepository.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitNoteRemoteRepository$getNoteGroups$3 extends i implements p<NoteRetrofit2Api, d<? super GetNoteGroupResponse>, Object> {
    final /* synthetic */ Long $lastUpdateInSeconds;
    final /* synthetic */ int $offset;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitNoteRemoteRepository$getNoteGroups$3(long j5, Long l5, int i11, d<? super RetrofitNoteRemoteRepository$getNoteGroups$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$lastUpdateInSeconds = l5;
        this.$offset = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitNoteRemoteRepository$getNoteGroups$3 retrofitNoteRemoteRepository$getNoteGroups$3 = new RetrofitNoteRemoteRepository$getNoteGroups$3(this.$userId, this.$lastUpdateInSeconds, this.$offset, dVar);
        retrofitNoteRemoteRepository$getNoteGroups$3.L$0 = obj;
        return retrofitNoteRemoteRepository$getNoteGroups$3;
    }

    @Override // ym0.p
    public final Object invoke(NoteRetrofit2Api noteRetrofit2Api, d<? super GetNoteGroupResponse> dVar) {
        return ((RetrofitNoteRemoteRepository$getNoteGroups$3) create(noteRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            long j5 = this.$userId;
            Long l5 = this.$lastUpdateInSeconds;
            int i12 = this.$offset;
            this.label = 1;
            obj = ((NoteRetrofit2Api) this.L$0).getNoteGroups(j5, l5, i12, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
