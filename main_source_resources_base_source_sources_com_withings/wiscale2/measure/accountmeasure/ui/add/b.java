package com.withings.wiscale2.measure.accountmeasure.ui.add;

import androidx.lifecycle.k1;
import com.withings.user.User;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class b implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f58127a;

    public b(a aVar) {
        this.f58127a = aVar;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        a aVar = this.f58127a;
        User user = aVar.getUser();
        fy.p pVar = aVar.A;
        if (pVar != null) {
            return new b1(user, pVar);
        }
        kotlin.jvm.internal.u.s("getMostRecentMeasuresGroup");
        throw null;
    }
}
