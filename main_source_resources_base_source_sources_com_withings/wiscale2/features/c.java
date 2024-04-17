package com.withings.wiscale2.features;

import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import com.withings.common.compose.component.o;
import com.withings.features.model.FeatureFlagCategory;
import d2.h1;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.q;
/* compiled from: FeatureFlagsActivity.kt */
/* loaded from: classes5.dex */
final class c extends w implements q<s0.b, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FeatureFlagCategory f56108a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(FeatureFlagCategory featureFlagCategory) {
        super(3);
        this.f56108a = featureFlagCategory;
    }

    @Override // ym0.q
    public final y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e b10;
        s0.b stickyHeader = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        u.j(stickyHeader, "$this$stickyHeader");
        if ((intValue & 81) != 16 || !aVar2.h()) {
            b10 = androidx.compose.foundation.c.b(androidx.compose.ui.e.f8927a, ((i1) aVar2.D(j1.e())).O(), h1.a());
            o.g(x0.h(b10, yk.h.o(), 0.0f, 2), null, null, this.f56108a.a(), null, false, false, false, null, null, null, aVar2, 0, 0, 2038);
        } else {
            aVar2.C();
        }
        return y.f85009a;
    }
}
