package com.withings.note.model;

import androidx.lifecycle.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.u;
import nm0.d;
import ym0.l;
/* compiled from: NoteLiveData.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class NoteLiveData$sam$androidx_lifecycle_Observer$0 implements l0, p {
    private final /* synthetic */ l function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NoteLiveData$sam$androidx_lifecycle_Observer$0(l function) {
        u.j(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0) || !(obj instanceof p)) {
            return false;
        }
        return u.e(getFunctionDelegate(), ((p) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.p
    public final d<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.l0
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
