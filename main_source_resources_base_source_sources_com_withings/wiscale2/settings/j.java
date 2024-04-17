package com.withings.wiscale2.settings;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DatabaseInfoActivity.kt */
/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DatabaseInfoActivity f60057a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f60058b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f60059c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f60060d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f60061e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f60062f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DatabaseInfoActivity databaseInfoActivity, String str, int i11, boolean z5, int i12, int i13) {
        super(2);
        this.f60057a = databaseInfoActivity;
        this.f60058b = str;
        this.f60059c = i11;
        this.f60060d = z5;
        this.f60061e = i12;
        this.f60062f = i13;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f60061e | 1);
        int i11 = this.f60059c;
        boolean z5 = this.f60060d;
        DatabaseInfoActivity.z3(this.f60057a, this.f60058b, i11, z5, aVar, g11, this.f60062f);
        return nm0.y.f85009a;
    }
}
