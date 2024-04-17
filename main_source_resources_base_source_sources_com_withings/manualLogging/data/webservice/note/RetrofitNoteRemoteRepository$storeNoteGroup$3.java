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
@e(c = "com.withings.manualLogging.data.webservice.note.RetrofitNoteRemoteRepository$storeNoteGroup$3", f = "RetrofitNoteRemoteRepository.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitNoteRemoteRepository$storeNoteGroup$3 extends i implements p<NoteRetrofit2Api, d<? super SaveNoteGroupResponse>, Object> {
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
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitNoteRemoteRepository$storeNoteGroup$3(long j5, long j11, Long l5, Long l6, String str, String str2, String str3, String str4, String str5, boolean z5, d<? super RetrofitNoteRemoteRepository$storeNoteGroup$3> dVar) {
        super(2, dVar);
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

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitNoteRemoteRepository$storeNoteGroup$3 retrofitNoteRemoteRepository$storeNoteGroup$3 = new RetrofitNoteRemoteRepository$storeNoteGroup$3(this.$userId, this.$date, this.$measureGroupId, this.$signalId, this.$cryptPart, this.$symptoms, this.$medicines, this.$texts, this.$pathList, this.$noSymptom, dVar);
        retrofitNoteRemoteRepository$storeNoteGroup$3.L$0 = obj;
        return retrofitNoteRemoteRepository$storeNoteGroup$3;
    }

    @Override // ym0.p
    public final Object invoke(NoteRetrofit2Api noteRetrofit2Api, d<? super SaveNoteGroupResponse> dVar) {
        return ((RetrofitNoteRemoteRepository$storeNoteGroup$3) create(noteRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l.b(obj);
        long j5 = this.$userId;
        long j11 = this.$date;
        Long l5 = this.$measureGroupId;
        Long l6 = this.$signalId;
        String str = this.$cryptPart;
        String str2 = this.$symptoms;
        String str3 = this.$medicines;
        String str4 = this.$texts;
        String str5 = this.$pathList;
        boolean z5 = this.$noSymptom;
        this.label = 1;
        Object storeNoteGroup = ((NoteRetrofit2Api) this.L$0).storeNoteGroup(j5, j11, l5, l6, str, str2, str3, str4, str5, z5, this);
        if (storeNoteGroup == coroutineSingletons) {
            return coroutineSingletons;
        }
        return storeNoteGroup;
    }
}
