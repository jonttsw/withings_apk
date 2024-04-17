package com.withings.ecg.player;

import androidx.transition.Transition;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.withings.ecg.player.PlayerView;
import kotlin.jvm.internal.u;
/* compiled from: PlayerView.kt */
/* loaded from: classes3.dex */
public final class a implements Transition.d {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PlayerView f38853a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(PlayerView playerView) {
        this.f38853a = playerView;
    }

    @Override // androidx.transition.Transition.d
    public final void a(Transition transition) {
        u.j(transition, "transition");
    }

    @Override // androidx.transition.Transition.d
    public final void b(Transition transition) {
        u.j(transition, "transition");
    }

    @Override // androidx.transition.Transition.d
    public final void c(Transition transition) {
        u.j(transition, "transition");
    }

    @Override // androidx.transition.Transition.d
    public final void d(Transition transition) {
        PlayerView.a aVar;
        u.j(transition, "transition");
        aVar = this.f38853a.f38841w;
        if (aVar != null) {
            aVar.a();
        } else {
            u.s(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            throw null;
        }
    }

    @Override // androidx.transition.Transition.d
    public final void e(Transition transition) {
        u.j(transition, "transition");
    }
}
