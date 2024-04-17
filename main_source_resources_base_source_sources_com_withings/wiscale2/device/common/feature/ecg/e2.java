package com.withings.wiscale2.device.common.feature.ecg;

import android.content.Context;
import androidx.media3.ui.PlayerView;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class e2 extends kotlin.jvm.internal.w implements ym0.l<Context, PlayerView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PlayerView f51293a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.media3.exoplayer.g f51294b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(PlayerView playerView, androidx.media3.exoplayer.g gVar) {
        super(1);
        this.f51293a = playerView;
        this.f51294b = gVar;
    }

    @Override // ym0.l
    public final PlayerView invoke(Context context) {
        Context it = context;
        kotlin.jvm.internal.u.j(it, "it");
        PlayerView playerView = this.f51293a;
        playerView.setPlayer(this.f51294b);
        return playerView;
    }
}
