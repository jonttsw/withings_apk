package com.withings.device.setup.android.setup.init.classification;

import ah.t;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.ArgumentNotSetException;
import com.withings.comm.wpp.exception.CommandErrorException;
import com.withings.comm.wpp.exception.InvalidArgumentException;
import com.withings.comm.wpp.generated.Wpp;
import com.withings.comm.wpp.generated.object.Int32;
import java.io.IOException;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nj.a;
import x70.b;
/* compiled from: SendClassificationConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/classification/SendClassificationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SendClassificationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f37445f;

    public SendClassificationConversation(e deviceManager) {
        u.j(deviceManager, "deviceManager");
        this.f37445f = deviceManager;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException {
        Int32 h11 = t.h(this.f37445f.f(x().g()).getClassification());
        try {
            a aVar = new a(x());
            aVar.c(Wpp.CMD_CLASSIFICATION_REGION_SET, h11);
            aVar.j();
        } catch (CommandErrorException e11) {
            if (e11 instanceof InvalidArgumentException) {
                b.r(this, "Tried to set the wrong classification'", new Object[0]);
            } else if (e11 instanceof ArgumentNotSetException) {
                b.r(this, "Classification already set", new Object[0]);
            } else {
                b.r(this, e11.getMessage(), new Object[0]);
            }
        }
    }
}
