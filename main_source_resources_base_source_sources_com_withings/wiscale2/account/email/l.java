package com.withings.wiscale2.account.email;

import androidx.lifecycle.k0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.sync.ActionSyncJob;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: EmailModificationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.account.email.EmailModificationViewModel$reloadAccount$1", f = "EmailModificationActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGLASTUSEDDATE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class l extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48085a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f48086b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EmailModificationViewModel f48087c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(EmailModificationViewModel emailModificationViewModel, qm0.d<? super l> dVar) {
        super(2, dVar);
        this.f48087c = emailModificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        l lVar = new l(this.f48087c, dVar);
        lVar.f48086b = obj;
        return lVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        t00.d dVar;
        lg.a aVar;
        EmailModificationViewModel emailModificationViewModel;
        k0 k0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48085a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    emailModificationViewModel = (EmailModificationViewModel) this.f48086b;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f48086b;
                EmailModificationViewModel emailModificationViewModel2 = this.f48087c;
                dVar = emailModificationViewModel2.f48041d;
                aVar = emailModificationViewModel2.f48040c;
                ActionSyncJob a11 = aVar.a(true);
                this.f48086b = emailModificationViewModel2;
                this.f48085a = 1;
                if (t00.g.a(dVar, a11, "reload_account_after_email_update", this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                emailModificationViewModel = emailModificationViewModel2;
            }
            k0Var = emailModificationViewModel.f48043f;
            k0Var.setValue(new Long(System.currentTimeMillis()));
            y yVar = y.f85009a;
        } catch (Throwable th2) {
            nm0.l.a(th2);
        }
        return y.f85009a;
    }
}
