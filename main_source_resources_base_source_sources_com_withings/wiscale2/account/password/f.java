package com.withings.wiscale2.account.password;

import com.withings.account.network.ws.AccountRemoteRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LinkForPasswordSentActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.account.password.LinkForPasswordSentActivity$sendEmailAgain$1", f = "LinkForPasswordSentActivity.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48143a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LinkForPasswordSentActivity f48144b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(LinkForPasswordSentActivity linkForPasswordSentActivity, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f48144b = linkForPasswordSentActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f48144b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48143a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            LinkForPasswordSentActivity linkForPasswordSentActivity = this.f48144b;
            AccountRemoteRepository accountRemoteRepository = linkForPasswordSentActivity.f48122g;
            if (accountRemoteRepository != null) {
                String A3 = LinkForPasswordSentActivity.A3(linkForPasswordSentActivity);
                this.f48143a = 1;
                if (accountRemoteRepository.requestNewPassword(A3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                u.s("accountRemoteRepository");
                throw null;
            }
        }
        return y.f85009a;
    }
}
