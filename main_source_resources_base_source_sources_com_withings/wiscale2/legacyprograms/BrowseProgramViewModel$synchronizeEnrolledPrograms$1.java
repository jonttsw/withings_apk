package com.withings.wiscale2.legacyprograms;

import com.withings.webservices.legacy.sync.SyncJob;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import x30.h;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BrowseProgramActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.BrowseProgramViewModel$synchronizeEnrolledPrograms$1", f = "BrowseProgramActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BrowseProgramViewModel$synchronizeEnrolledPrograms$1 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    final /* synthetic */ String $syncContext;
    int label;
    final /* synthetic */ BrowseProgramViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowseProgramViewModel$synchronizeEnrolledPrograms$1(BrowseProgramViewModel browseProgramViewModel, String str, qm0.d<? super BrowseProgramViewModel$synchronizeEnrolledPrograms$1> dVar) {
        super(2, dVar);
        this.this$0 = browseProgramViewModel;
        this.$syncContext = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(BrowseProgramViewModel browseProgramViewModel, SyncJob syncJob, int i11) {
        if (i11 != 2) {
            if (i11 == 3) {
                browseProgramViewModel.getRefreshLiveData().postValue(Boolean.FALSE);
                x70.b.n(new Exception("Failed to sync enrolled programs"));
                return;
            }
            return;
        }
        browseProgramViewModel.getRefreshLiveData().postValue(Boolean.TRUE);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new BrowseProgramViewModel$synchronizeEnrolledPrograms$1(this.this$0, this.$syncContext, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        j30.c cVar;
        h hVar;
        v30.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            long q11 = this.this$0.getUser().q();
            cVar = this.this$0.enrolledRepository;
            hVar = this.this$0.getMostRecentEnrolledProgramLastUpdateUseCase;
            bVar = this.this$0.fetchTasksProgramByIdUseCase;
            b30.d dVar = new b30.d(q11, cVar, hVar, bVar);
            oi0.b h11 = oi0.b.h();
            String str = this.$syncContext;
            final BrowseProgramViewModel browseProgramViewModel = this.this$0;
            h11.j(dVar, str, new SyncJob.Listener() { // from class: com.withings.wiscale2.legacyprograms.a
                @Override // com.withings.webservices.legacy.sync.SyncJob.Listener
                public final void onSyncJobDone(SyncJob syncJob, int i11) {
                    BrowseProgramViewModel$synchronizeEnrolledPrograms$1.invokeSuspend$lambda$0(BrowseProgramViewModel.this, syncJob, i11);
                }
            });
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((BrowseProgramViewModel$synchronizeEnrolledPrograms$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
