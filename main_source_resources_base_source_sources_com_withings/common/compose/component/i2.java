package com.withings.common.compose.component;

import java.util.ArrayList;
import java.util.List;
/* compiled from: HorizontalPager.kt */
/* loaded from: classes3.dex */
final class i2 implements g2 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f33859a = new ArrayList();

    @Override // com.withings.common.compose.component.g2
    public final void a(s1.a aVar) {
        this.f33859a.add(aVar);
    }

    @Override // com.withings.common.compose.component.g2
    public final void b(List items, s1.a aVar) {
        kotlin.jvm.internal.u.j(items, "items");
        for (Object obj : items) {
            this.f33859a.add(new s1.a(true, -175677866, new h2(aVar, obj)));
        }
    }

    public final ArrayList c() {
        return this.f33859a;
    }
}
