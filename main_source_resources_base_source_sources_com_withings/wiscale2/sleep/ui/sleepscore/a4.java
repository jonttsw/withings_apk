package com.withings.wiscale2.sleep.ui.sleepscore;

import com.withings.wiscale2.track.data.Track;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepWeekFragment.kt */
/* loaded from: classes5.dex */
public final class a4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ y3 f60886a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List<Track> f60887b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f60888c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(y3 y3Var, List<Track> list, int i11) {
        super(2);
        this.f60886a = y3Var;
        this.f60887b = list;
        this.f60888c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f60888c | 1);
        y3.s1(this.f60886a, this.f60887b, aVar, g11);
        return nm0.y.f85009a;
    }
}
