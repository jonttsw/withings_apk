package com.withings.device.details.wsm;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.wiscale2.C1987R;
import java.util.Locale;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: Wsm02DetailFragment.kt */
/* loaded from: classes3.dex */
final class o extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f37355a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f37356b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, i iVar) {
        super(0);
        this.f37355a = iVar;
        this.f37356b = context;
    }

    @Override // ym0.a
    public final y invoke() {
        String a11;
        i iVar = this.f37355a;
        String string = iVar.getString(C1987R.string.deviceDetailView_homeAutomationWithIFTTT);
        u.i(string, "getString(...)");
        String string2 = iVar.getString(C1987R.string.deviceDetailView_homeAutomationWithIFTTTUrl_formatted, Locale.getDefault().getLanguage());
        u.i(string2, "getString(...)");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        String color = iVar.A1().getColor();
        if (color != null && (a11 = w6.o.a(string2, "?color=", color)) != null) {
            string2 = a11;
        }
        iVar.startActivity(aVar.c(this.f37356b, string, string2));
        return y.f85009a;
    }
}
