package com.withings.tutorials.ui.screens;

import androidx.lifecycle.l0;
/* compiled from: MultipleUsers.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class f implements l0, kotlin.jvm.internal.p {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ym0.l f45304a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(ym0.l lVar) {
        this.f45304a = lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
            return false;
        }
        return kotlin.jvm.internal.u.e(this.f45304a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.p
    public final nm0.d<?> getFunctionDelegate() {
        return this.f45304a;
    }

    public final int hashCode() {
        return this.f45304a.hashCode();
    }

    @Override // androidx.lifecycle.l0
    public final /* synthetic */ void onChanged(Object obj) {
        this.f45304a.invoke(obj);
    }
}
