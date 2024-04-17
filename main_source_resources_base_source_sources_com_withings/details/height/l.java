package com.withings.details.height;

import androidx.compose.material3.a9;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
final class l extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f36619a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str) {
        super(3);
        this.f36619a = str;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b stickyHeader = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(stickyHeader, "$this$stickyHeader");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            a9.a(null, null, 0L, 0L, 0.0f, 1, null, s1.b.b(aVar2, -353860454, new k(this.f36619a)), aVar2, 12779520, 95);
        }
        return nm0.y.f85009a;
    }
}
