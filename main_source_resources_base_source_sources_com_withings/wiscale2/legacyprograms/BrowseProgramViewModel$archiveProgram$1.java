package com.withings.wiscale2.legacyprograms;

import com.withings.programs.api.WellnessRetrofit1Api;
import com.withings.webservices.legacy.Webservices;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: BrowseProgramActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.BrowseProgramViewModel$archiveProgram$1", f = "BrowseProgramActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class BrowseProgramViewModel$archiveProgram$1 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    final /* synthetic */ int $programId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BrowseProgramViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowseProgramViewModel$archiveProgram$1(BrowseProgramViewModel browseProgramViewModel, int i11, qm0.d<? super BrowseProgramViewModel$archiveProgram$1> dVar) {
        super(2, dVar);
        this.this$0 = browseProgramViewModel;
        this.$programId = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        BrowseProgramViewModel$archiveProgram$1 browseProgramViewModel$archiveProgram$1 = new BrowseProgramViewModel$archiveProgram$1(this.this$0, this.$programId, dVar);
        browseProgramViewModel$archiveProgram$1.L$0 = obj;
        return browseProgramViewModel$archiveProgram$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BrowseProgramViewModel browseProgramViewModel = this.this$0;
            try {
                a11 = ((WellnessRetrofit1Api) Webservices.get().getApiForAccount(WellnessRetrofit1Api.class)).archiveProgram(browseProgramViewModel.getUser().q(), this.$programId);
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            BrowseProgramViewModel browseProgramViewModel2 = this.this$0;
            if (!(a11 instanceof k.a)) {
                browseProgramViewModel2.synchronizeEnrolledPrograms("archiveProgram");
            }
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((BrowseProgramViewModel$archiveProgram$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
