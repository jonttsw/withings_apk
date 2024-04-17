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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/manualLogging/data/webservice/note/SaveNoteGroupResponse;", "Lcom/withings/manualLogging/data/webservice/note/NoteRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.manualLogging.data.webservice.note.RetrofitNoteRemoteRepository$updateNoteGroup$3", f = "RetrofitNoteRemoteRepository.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitNoteRemoteRepository$updateNoteGroup$3 extends i implements p<NoteRetrofit2Api, d<? super SaveNoteGroupResponse>, Object> {
    final /* synthetic */ long $date;
    final /* synthetic */ boolean $noSymptom;
    final /* synthetic */ long $noteGroupId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitNoteRemoteRepository$updateNoteGroup$3(long j5, long j11, boolean z5, d<? super RetrofitNoteRemoteRepository$updateNoteGroup$3> dVar) {
        super(2, dVar);
        this.$noteGroupId = j5;
        this.$date = j11;
        this.$noSymptom = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitNoteRemoteRepository$updateNoteGroup$3 retrofitNoteRemoteRepository$updateNoteGroup$3 = new RetrofitNoteRemoteRepository$updateNoteGroup$3(this.$noteGroupId, this.$date, this.$noSymptom, dVar);
        retrofitNoteRemoteRepository$updateNoteGroup$3.L$0 = obj;
        return retrofitNoteRemoteRepository$updateNoteGroup$3;
    }

    @Override // ym0.p
    public final Object invoke(NoteRetrofit2Api noteRetrofit2Api, d<? super SaveNoteGroupResponse> dVar) {
        return ((RetrofitNoteRemoteRepository$updateNoteGroup$3) create(noteRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j5 = this.$noteGroupId;
            long j11 = this.$date;
            boolean z5 = this.$noSymptom;
            this.label = 1;
            obj = ((NoteRetrofit2Api) this.L$0).updateNoteGroup(j5, j11, z5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
