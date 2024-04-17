package com.withings.library.authentication.api.account;

import el0.f0;
import el0.g0;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: RemoteAccountApi.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lel0/f0;", "it", "Lnm0/y;", "invoke", "(Lel0/f0;Lel0/f0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class RemoteAccountApi$loginWithExternalProviderAndIdToken$2$1 extends w implements p<f0, f0, y> {
    public static final RemoteAccountApi$loginWithExternalProviderAndIdToken$2$1 INSTANCE = new RemoteAccountApi$loginWithExternalProviderAndIdToken$2$1();

    RemoteAccountApi$loginWithExternalProviderAndIdToken$2$1() {
        super(2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(f0 url, f0 it) {
        u.j(url, "$this$url");
        u.j(it, "it");
        g0.d(url, "/v2/account?action=providerauth");
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ y invoke(f0 f0Var, f0 f0Var2) {
        invoke2(f0Var, f0Var2);
        return y.f85009a;
    }
}
