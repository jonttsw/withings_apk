package com.withings.wiscale2.device.common.ui.geoloc;

import androidx.compose.foundation.layout.e1;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WeatherAirQualityScreen.kt */
/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53932a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f53933b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, ym0.a aVar) {
        super(3);
        this.f53932a = aVar;
        this.f53933b = str;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h ImageTutorialScreen = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(ImageTutorialScreen, "$this$ImageTutorialScreen");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            nk.a.d(null, ay.b.u(C1987R.string.weatherAirQuality_tutorial_description, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
            androidx.compose.ui.e e11 = e1.e(androidx.compose.ui.e.f8927a, 1.0f);
            ym0.a<nm0.y> aVar3 = this.f53932a;
            fk.q.b(androidx.compose.foundation.h.b(e11, true, aVar3, 6), InputFieldType.f33876d, null, null, this.f53933b, null, ay.b.u(C1987R.string.location_searchBar_placeholder, aVar2), null, s1.b.b(aVar2, 1051824909, new x(aVar3)), null, null, false, null, null, 6, null, false, null, null, aVar2, 100663344, 1597440, 442028);
        }
        return nm0.y.f85009a;
    }
}
