package com.withings.common.compose.component;

import java.util.ArrayList;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ScrollableTabRow.kt */
/* loaded from: classes3.dex */
final class m3 {

    /* renamed from: a  reason: collision with root package name */
    private final n0.z0 f34069a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineScope f34070b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f34071c;

    public m3(n0.z0 scrollState, CoroutineScope coroutineScope) {
        kotlin.jvm.internal.u.j(scrollState, "scrollState");
        kotlin.jvm.internal.u.j(coroutineScope, "coroutineScope");
        this.f34069a = scrollState;
        this.f34070b = coroutineScope;
    }

    public final void b(androidx.compose.ui.layout.p1 density, int i11, ArrayList arrayList, int i12) {
        kotlin.jvm.internal.u.j(density, "density");
        Integer num = this.f34071c;
        if (num == null || num.intValue() != i12) {
            this.f34071c = Integer.valueOf(i12);
            s4 s4Var = (s4) kotlin.collections.x.N(i12, arrayList);
            if (s4Var != null) {
                int m02 = density.m0(((s4) kotlin.collections.x.T(arrayList)).b()) + i11;
                int l5 = m02 - this.f34069a.l();
                int m03 = density.m0(s4Var.a()) - ((l5 / 2) - (density.m0(s4Var.c()) / 2));
                int i13 = m02 - l5;
                if (i13 < 0) {
                    i13 = 0;
                }
                BuildersKt__Builders_commonKt.launch$default(this.f34070b, null, null, new l3(this, en0.r.j(m03, 0, i13), null), 3, null);
            }
        }
    }
}
