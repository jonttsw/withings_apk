package com.withings.wiscale2.heart.heartrate.events;

import java.util.List;
import kotlin.jvm.internal.w;
import nm0.j;
import nm0.y;
import ym0.l;
/* compiled from: HeartRateEventsActivity.kt */
/* loaded from: classes5.dex */
final class a extends w implements l<j<? extends List<? extends ky.d>, ? extends ng0.j>, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeartRateEventsActivity f57638a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HeartRateEventsActivity heartRateEventsActivity) {
        super(1);
        this.f57638a = heartRateEventsActivity;
    }

    @Override // ym0.l
    public final y invoke(j<? extends List<? extends ky.d>, ? extends ng0.j> jVar) {
        j<? extends List<? extends ky.d>, ? extends ng0.j> jVar2 = jVar;
        HeartRateEventsActivity.H3(this.f57638a, jVar2.a().size(), jVar2.b());
        return y.f85009a;
    }
}
