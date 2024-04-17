package com.withings.common.device.conversation;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.LocaleSet;
import com.withings.comm.wpp.h;
import java.io.IOException;
import kotlin.Metadata;
import nm0.y;
import ym0.l;
/* compiled from: GetLocaleConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/common/device/conversation/GetLocaleConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", com.huawei.hms.feature.dynamic.e.b.f28627a, "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetLocaleConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final b f35139f;

    /* compiled from: GetLocaleConversation.kt */
    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<LocaleSet, y> f35140a;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super LocaleSet, y> lVar) {
            this.f35140a = lVar;
        }

        @Override // com.withings.common.device.conversation.GetLocaleConversation.b
        public final void g(LocaleSet localeSet) {
            this.f35140a.invoke(localeSet);
        }
    }

    /* compiled from: GetLocaleConversation.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void g(LocaleSet localeSet) throws IOException, InterruptedException, ConversationException, WaitForInput.CancelException;
    }

    public GetLocaleConversation(b bVar) {
        this.f35139f = bVar;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        b bVar = this.f35139f;
        try {
            ?? aVar = new nj.a(x());
            aVar.c((short) 324, new h[0]);
            LocaleSet localeSet = (LocaleSet) aVar.y(LocaleSet.class);
            if (bVar != null) {
                bVar.g(localeSet);
            }
        } catch (UnsupportedCommandException unused) {
            x70.b.t(this, "Command WPP_LOCALE_GET is not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
            if (bVar != null) {
                bVar.g(null);
            }
        }
    }

    public GetLocaleConversation(l<? super LocaleSet, y> lVar) {
        this(new a(lVar));
    }
}
