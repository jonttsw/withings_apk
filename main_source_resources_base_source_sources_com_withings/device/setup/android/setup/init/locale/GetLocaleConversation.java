package com.withings.device.setup.android.setup.init.locale;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.LocaleSet;
import com.withings.comm.wpp.h;
import kotlin.Metadata;
import nj.a;
import nm0.y;
import x70.b;
import ym0.l;
/* compiled from: GetLocaleConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/locale/GetLocaleConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetLocaleConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final l<LocaleSet, y> f37450f;

    /* JADX WARN: Multi-variable type inference failed */
    public GetLocaleConversation(l<? super LocaleSet, y> lVar) {
        this.f37450f = lVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        l<LocaleSet, y> lVar = this.f37450f;
        try {
            ?? aVar = new a(x());
            aVar.c((short) 324, new h[0]);
            lVar.invoke((LocaleSet) aVar.y(LocaleSet.class));
        } catch (UnsupportedCommandException unused) {
            b.t(this, "Command WPP_LOCALE_GET is not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
            lVar.invoke(null);
        }
    }
}
