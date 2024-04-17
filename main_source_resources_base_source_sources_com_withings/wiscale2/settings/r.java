package com.withings.wiscale2.settings;

import com.withings.wiscale2.settings.DatabaseInfoActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseInfoActivity.kt */
/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity f60271a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity.a f60272b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f60273c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(DatabaseInfoActivity databaseInfoActivity, DatabaseInfoActivity.a aVar, int i11) {
        super(2);
        this.f60271a = databaseInfoActivity;
        this.f60272b = aVar;
        this.f60273c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f60273c | 1);
        DatabaseInfoActivity.A3(this.f60271a, this.f60272b, aVar, g11);
        return nm0.y.f85009a;
    }
}
