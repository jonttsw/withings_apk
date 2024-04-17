package com.withings.badge.detail;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: BadgeDetailScreen.kt */
/* loaded from: classes3.dex */
final class j extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, y> f32774a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f32775b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, ym0.l lVar) {
        super(0);
        this.f32774a = lVar;
        this.f32775b = str;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f32774a.invoke(this.f32775b);
        return y.f85009a;
    }
}
