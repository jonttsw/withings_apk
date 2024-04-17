package com.withings.wiscale2.device.scale.conversation;

import ah.o;
import android.content.Context;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.e;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.common.device.conversation.FeatureTagsConversation;
import com.withings.common.device.conversation.GetAndStoreBatteryStateConversation;
import com.withings.common.device.conversation.SendSessionConversation;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.wiscale2.device.common.conversation.GetScreenSettingsAndSendScreensConversation;
import com.withings.wiscale2.device.common.conversation.SendUserUnitsConversation;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ScaleInitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/scale/conversation/ScaleInitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ScaleInitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f54637f;

    public ScaleInitConversation(boolean z5) {
        this.f54637f = z5;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        E(new GetAndStoreBatteryStateConversation());
        E(new SendSessionConversation(this.f54637f));
        E(new SendUserUnitsConversation(0));
        Context r7 = r();
        u.i(r7, "getContext(...)");
        Context applicationContext = r7.getApplicationContext();
        u.i(applicationContext, "getApplicationContext(...)");
        FeatureTagsConversation.a aVar = (FeatureTagsConversation.a) o.c(applicationContext, FeatureTagsConversation.a.class);
        E(new FeatureTagsConversation(aVar.a(), aVar.g()));
        E(new GetScreenSettingsAndSendScreensConversation());
        try {
            e a11 = e.a();
            u.i(a11, "get(...)");
            E(new SendTimeConversation(a11));
        } catch (UnsupportedCommandException unused) {
            x70.b.t(this, "Command time set is not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
        }
    }
}
