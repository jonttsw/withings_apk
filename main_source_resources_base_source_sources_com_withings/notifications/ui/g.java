package com.withings.notifications.ui;

import com.withings.common.compose.component.card.stack.CardTextSize;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationCards.kt */
/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c10.c<?> f42920a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f42921b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42922c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CardTextSize f42923d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f42924e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f42925f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i11, int i12, androidx.compose.ui.e eVar, CardTextSize cardTextSize, c10.c cVar, ym0.a aVar) {
        super(2);
        this.f42920a = cVar;
        this.f42921b = eVar;
        this.f42922c = aVar;
        this.f42923d = cardTextSize;
        this.f42924e = i11;
        this.f42925f = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f42924e | 1);
        h.a(g11, this.f42925f, aVar, this.f42921b, this.f42923d, this.f42920a, this.f42922c);
        return nm0.y.f85009a;
    }
}
