package com.withings.wiscale2.legacyprograms;

import android.app.ProgressDialog;
import androidx.fragment.app.FragmentActivity;
import com.withings.programs.api.WellnessRetrofit1Api;
import com.withings.webservices.legacy.Webservices;
import com.withings.webservices.legacy.sync.SyncJob;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: ProgramOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.ProgramOptionSheetFragment$leaveProgram$1$1$1", f = "ProgramOptionSheetFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ProgramOptionSheetFragment$leaveProgram$1$1$1 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    int label;
    final /* synthetic */ ProgramOptionSheetFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgramOptionSheetFragment$leaveProgram$1$1$1(ProgramOptionSheetFragment programOptionSheetFragment, qm0.d<? super ProgramOptionSheetFragment$leaveProgram$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = programOptionSheetFragment;
    }

    public static /* synthetic */ void a(ProgramOptionSheetFragment programOptionSheetFragment, SyncJob syncJob, int i11) {
        invokeSuspend$lambda$0(programOptionSheetFragment, syncJob, i11);
    }

    public static final void invokeSuspend$lambda$0(ProgramOptionSheetFragment programOptionSheetFragment, SyncJob syncJob, int i11) {
        ProgressDialog progressDialog;
        progressDialog = programOptionSheetFragment.progressDialog;
        if (progressDialog != null) {
            progressDialog.dismiss();
            FragmentActivity activity = programOptionSheetFragment.getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        u.s("progressDialog");
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new ProgramOptionSheetFragment$leaveProgram$1$1$1(this.this$0, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.withings.wiscale2.legacyprograms.d] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j5;
        int i11;
        long j11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            j5 = this.this$0.userId;
            i11 = this.this$0.programId;
            ((WellnessRetrofit1Api) Webservices.get().getApiForAccount(WellnessRetrofit1Api.class)).cancelProgram(j5, i11);
            oi0.b h11 = oi0.b.h();
            j11 = this.this$0.userId;
            final ProgramOptionSheetFragment programOptionSheetFragment = this.this$0;
            h11.q(j11, "programCancelled", new SyncJob.Listener() { // from class: com.withings.wiscale2.legacyprograms.d
                @Override // com.withings.webservices.legacy.sync.SyncJob.Listener
                public final void onSyncJobDone(SyncJob syncJob, int i12) {
                    ProgramOptionSheetFragment$leaveProgram$1$1$1.a(ProgramOptionSheetFragment.this, syncJob, i12);
                }
            });
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((ProgramOptionSheetFragment$leaveProgram$1$1$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
