package com.withings.manualLogging.data.webservice.note;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitNoteRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/manualLogging/data/webservice/note/StoreNoteResponse;", "Lcom/withings/manualLogging/data/webservice/note/NoteRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.manualLogging.data.webservice.note.RetrofitNoteRemoteRepository$storeImages$3", f = "RetrofitNoteRemoteRepository.kt", l = {ConstantsWs.MEASURE_TYPE_R250KHZ_SEGMENT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitNoteRemoteRepository$storeImages$3 extends i implements p<NoteRetrofit2Api, d<? super StoreNoteResponse>, Object> {
    final /* synthetic */ long $noteGroupId;
    final /* synthetic */ String $pathLists;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitNoteRemoteRepository$storeImages$3(long j5, String str, d<? super RetrofitNoteRemoteRepository$storeImages$3> dVar) {
        super(2, dVar);
        this.$noteGroupId = j5;
        this.$pathLists = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitNoteRemoteRepository$storeImages$3 retrofitNoteRemoteRepository$storeImages$3 = new RetrofitNoteRemoteRepository$storeImages$3(this.$noteGroupId, this.$pathLists, dVar);
        retrofitNoteRemoteRepository$storeImages$3.L$0 = obj;
        return retrofitNoteRemoteRepository$storeImages$3;
    }

    @Override // ym0.p
    public final Object invoke(NoteRetrofit2Api noteRetrofit2Api, d<? super StoreNoteResponse> dVar) {
        return ((RetrofitNoteRemoteRepository$storeImages$3) create(noteRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            String str = this.$pathLists;
            this.label = 1;
            obj = ((NoteRetrofit2Api) this.L$0).storeImages(j5, str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
