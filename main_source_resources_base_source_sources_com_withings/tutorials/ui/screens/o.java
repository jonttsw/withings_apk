package com.withings.tutorials.ui.screens;

import androidx.compose.material3.j5;
import nm0.y;
/* compiled from: SegmentalBodyComposition.kt */
/* loaded from: classes4.dex */
final class o extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f46201a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f46202b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f46203c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r8.n nVar, String str, ym0.a aVar) {
        super(4);
        this.f46201a = aVar;
        this.f46202b = str;
        this.f46203c = nVar;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        g.f45305a.d(3072, 0, aVar, this.f46202b, this.f46201a, new n(this.f46203c));
        return y.f85009a;
    }
}
