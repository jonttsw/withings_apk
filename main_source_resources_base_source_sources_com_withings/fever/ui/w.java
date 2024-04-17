package com.withings.fever.ui;

import org.joda.time.DateTime;
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
final class w extends kotlin.jvm.internal.w implements ym0.l<DateTime, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f39477a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ym0.a<nm0.y> aVar) {
        super(1);
        this.f39477a = aVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(DateTime dateTime) {
        DateTime it = dateTime;
        kotlin.jvm.internal.u.j(it, "it");
        this.f39477a.invoke();
        return nm0.y.f85009a;
    }
}
