package com.withings.notifications.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
public final class a0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f42849a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f42850b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42851c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.compose.ui.e eVar, int i11, int i12) {
        super(2);
        this.f42849a = eVar;
        this.f42850b = i11;
        this.f42851c = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f42850b | 1);
        int i11 = this.f42851c;
        z.f(this.f42849a, aVar, g11, i11);
        return nm0.y.f85009a;
    }
}
