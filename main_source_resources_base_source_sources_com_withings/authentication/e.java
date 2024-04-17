package com.withings.authentication;

import androidx.compose.foundation.layout.e;
import androidx.compose.ui.node.g;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;
import k1.r1;
import m6.x;
import p6.k;
import x1.b;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements k.a {
    public static androidx.compose.ui.layout.l0 a(e.h hVar, androidx.compose.runtime.b bVar, int i11) {
        androidx.compose.ui.layout.l0 a11 = androidx.compose.foundation.layout.n.a(hVar, b.a.k(), bVar);
        bVar.s(i11);
        return a11;
    }

    public static ym0.p b(androidx.compose.runtime.b bVar, androidx.compose.ui.layout.l0 l0Var, androidx.compose.runtime.b bVar2, k1.v0 v0Var) {
        r1.b(bVar, l0Var, g.a.e());
        r1.b(bVar2, v0Var, g.a.g());
        return g.a.b();
    }

    @Override // p6.k.a
    public void invoke(Object obj) {
        ((x.c) obj).K0(ExoPlaybackException.d(new ExoTimeoutException(1), 1003));
    }
}
