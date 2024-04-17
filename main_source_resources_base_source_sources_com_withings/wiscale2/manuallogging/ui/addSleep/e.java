package com.withings.wiscale2.manuallogging.ui.addSleep;

import androidx.compose.foundation.layout.x0;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.q;
/* compiled from: AddLogSleepScreen.kt */
/* loaded from: classes5.dex */
final class e extends w implements q<l0.i, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<Track> f58064a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<Track, y> f58065b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(List<Track> list, ym0.l<? super Track, y> lVar) {
        super(3);
        this.f58064a = list;
        this.f58065b = lVar;
    }

    @Override // ym0.q
    public final y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        num.intValue();
        u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        fh0.i.a(64, 0, aVar, x0.i(androidx.compose.ui.e.f8927a, yk.h.o(), yk.h.t(), yk.h.o(), yk.h.B()), this.f58064a, this.f58065b);
        return y.f85009a;
    }
}
