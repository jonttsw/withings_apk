package com.withings.common.device.companion;

import android.companion.CompanionDeviceManager;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;
import com.withings.common.device.companion.DeviceCompanionLinkProvider;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: DeviceCompanionLinkProvider.kt */
/* loaded from: classes3.dex */
public final class n extends CompanionDeviceManager.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceCompanionLinkProvider f35123a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f35124b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(DeviceCompanionLinkProvider deviceCompanionLinkProvider, String str) {
        this.f35123a = deviceCompanionLinkProvider;
        this.f35124b = str;
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    public final void onDeviceFound(IntentSender chooserLauncher) {
        androidx.activity.result.b bVar;
        u.j(chooserLauncher, "chooserLauncher");
        bVar = this.f35123a.f35084a;
        bVar.a(new IntentSenderRequest.a(chooserLauncher).a());
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    public final void onFailure(CharSequence charSequence) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        ym0.l<String, y> a11;
        String str;
        DeviceCompanionLinkProvider deviceCompanionLinkProvider = this.f35123a;
        linkedHashMap = deviceCompanionLinkProvider.f35085b;
        String str2 = this.f35124b;
        DeviceCompanionLinkProvider.a aVar = (DeviceCompanionLinkProvider.a) linkedHashMap.get(str2);
        if (aVar != null && (a11 = aVar.a()) != null) {
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            a11.invoke(str);
        }
        linkedHashMap2 = deviceCompanionLinkProvider.f35085b;
        linkedHashMap2.remove(str2);
    }
}
