package com.withings.notifications.ui;

import com.withings.common.compose.component.card.stack.CardTextSize;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationCards.kt */
/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c10.c<?> f42954a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42955b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f42956c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CardTextSize f42957d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42958e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42959f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i11, int i12, androidx.compose.ui.e eVar, CardTextSize cardTextSize, c10.c cVar, ym0.a aVar) {
        super(2);
        this.f42954a = cVar;
        this.f42955b = aVar;
        this.f42956c = eVar;
        this.f42957d = cardTextSize;
        this.f42958e = i11;
        this.f42959f = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f42958e | 1);
        h.b(g11, this.f42959f, aVar, this.f42956c, this.f42957d, this.f42954a, this.f42955b);
        return nm0.y.f85009a;
    }
}
