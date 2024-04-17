package com.withings.common.compose.component;

import java.util.ArrayList;
/* compiled from: AdaptableRow.kt */
/* loaded from: classes3.dex */
final class m1 implements k1 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f34059a = new ArrayList();

    @Override // com.withings.common.compose.component.k1
    public final void a(ArrayList items) {
        s1.a aVar = g0.f33800a;
        kotlin.jvm.internal.u.j(items, "items");
        for (Object obj : items) {
            this.f34059a.add(new s1.a(true, -1008233653, new l1(obj)));
        }
    }

    public final ArrayList b() {
        return this.f34059a;
    }
}
