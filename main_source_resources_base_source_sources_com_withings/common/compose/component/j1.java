package com.withings.common.compose.component;

import java.util.ArrayList;
import java.util.List;
/* compiled from: AdaptableHorizontalContent.kt */
/* loaded from: classes3.dex */
final class j1 implements h1 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList f33921a = new ArrayList();

    @Override // com.withings.common.compose.component.h1
    public final void a(s1.a aVar) {
        this.f33921a.add(aVar);
    }

    @Override // com.withings.common.compose.component.h1
    public final void b(List items, s1.a aVar) {
        kotlin.jvm.internal.u.j(items, "items");
        for (Object obj : items) {
            this.f33921a.add(new s1.a(true, -2144702347, new i1(aVar, obj)));
        }
    }

    public final ArrayList c() {
        return this.f33921a;
    }
}
