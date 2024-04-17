package com.withings.wiscale2.account.password;

import androidx.lifecycle.l0;
import kotlin.jvm.internal.u;
/* compiled from: PasswordEditionFragment.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class m implements l0, kotlin.jvm.internal.p {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ym0.l f48175a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(ym0.l lVar) {
        this.f48175a = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
            return false;
        }
        return u.e(this.f48175a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.p
    public final nm0.d<?> getFunctionDelegate() {
        return this.f48175a;
    }

    public final int hashCode() {
        return this.f48175a.hashCode();
    }

    @Override // androidx.lifecycle.l0
    public final /* synthetic */ void onChanged(Object obj) {
        this.f48175a.invoke(obj);
    }
}
