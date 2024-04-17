package com.withings.wiscale2.device.common.feature.ecg;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.lifecycle.Lifecycle;
import androidx.media3.ui.PlayerView;
import com.withings.wiscale2.device.common.feature.ecg.f2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class f2 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f51325a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f51326b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51327c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ androidx.media3.exoplayer.g f51328d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.l0 f51329e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.n0 f51330f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.o0 f51331g;

    /* compiled from: EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f51332a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51332a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(androidx.compose.ui.e eVar, Context context, EcgActivationActivity ecgActivationActivity, androidx.media3.exoplayer.g gVar, kotlin.jvm.internal.l0 l0Var, kotlin.jvm.internal.n0 n0Var, kotlin.jvm.internal.o0 o0Var) {
        super(3);
        this.f51325a = eVar;
        this.f51326b = context;
        this.f51327c = ecgActivationActivity;
        this.f51328d = gVar;
        this.f51329e = l0Var;
        this.f51330f = n0Var;
        this.f51331g = o0Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        aVar2.s(-1322031206);
        Object t11 = aVar2.t();
        PlayerView playerView = t11;
        if (t11 == a.C0060a.a()) {
            final PlayerView playerView2 = new PlayerView(this.f51326b, null);
            playerView2.setUseController(false);
            playerView2.setResizeMode(4);
            Lifecycle lifecycle = this.f51327c.getLifecycle();
            final androidx.media3.exoplayer.g gVar = this.f51328d;
            final kotlin.jvm.internal.l0 l0Var = this.f51329e;
            final kotlin.jvm.internal.n0 n0Var = this.f51330f;
            final kotlin.jvm.internal.o0 o0Var = this.f51331g;
            lifecycle.a(new androidx.lifecycle.b0() { // from class: com.withings.wiscale2.device.common.feature.ecg.d2
                @Override // androidx.lifecycle.b0
                public final void d(androidx.lifecycle.d0 d0Var, Lifecycle.Event event) {
                    PlayerView playerView3 = PlayerView.this;
                    kotlin.jvm.internal.u.j(playerView3, "$playerView");
                    androidx.media3.exoplayer.g player = gVar;
                    kotlin.jvm.internal.u.j(player, "$player");
                    kotlin.jvm.internal.l0 autoPlay = l0Var;
                    kotlin.jvm.internal.u.j(autoPlay, "$autoPlay");
                    kotlin.jvm.internal.n0 window = n0Var;
                    kotlin.jvm.internal.u.j(window, "$window");
                    kotlin.jvm.internal.o0 position = o0Var;
                    kotlin.jvm.internal.u.j(position, "$position");
                    int i11 = f2.a.f51332a[event.ordinal()];
                    if (i11 != 1) {
                        if (i11 == 2) {
                            fn0.k<Object>[] kVarArr = EcgActivationActivity.f51062k;
                            autoPlay.f76251a = player.C();
                            window.f76254a = player.V();
                            position.f76256a = en0.r.c(0L, player.Q());
                            playerView3.t();
                            player.n(false);
                            return;
                        }
                        return;
                    }
                    playerView3.u();
                    player.n(autoPlay.f76251a);
                }
            });
            aVar2.n(playerView2);
            playerView = playerView2;
        }
        aVar2.J();
        androidx.compose.ui.viewinterop.d.a(new e2((PlayerView) playerView, this.f51328d), this.f51325a, null, aVar2, 0, 4);
        return nm0.y.f85009a;
    }
}
