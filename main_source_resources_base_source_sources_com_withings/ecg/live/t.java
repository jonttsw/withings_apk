package com.withings.ecg.live;

import android.content.Intent;
import com.withings.ecg.instruction.EcgLostConnectionScreenActivity;
import com.withings.ecg.model.LiveEcgMeasurementRepository;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
final class t extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveEcgActivity f38709a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(LiveEcgActivity liveEcgActivity) {
        super(1);
        this.f38709a = liveEcgActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        if (bool.booleanValue()) {
            int i11 = EcgLostConnectionScreenActivity.f38583a;
            LiveEcgActivity context = this.f38709a;
            kotlin.jvm.internal.u.j(context, "context");
            context.startActivity(new Intent(context, EcgLostConnectionScreenActivity.class).addFlags(268435456));
            LiveEcgMeasurementRepository liveEcgMeasurementRepository = androidx.compose.foundation.lazy.layout.d.f4444c;
            if (liveEcgMeasurementRepository != null) {
                liveEcgMeasurementRepository.onConnectionLost();
                context.finish();
            } else {
                kotlin.jvm.internal.u.s("liveEcgMeasurementRepository");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
