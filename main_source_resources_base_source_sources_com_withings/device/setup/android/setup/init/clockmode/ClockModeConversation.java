package com.withings.device.setup.android.setup.init.clockmode;

import android.text.format.DateFormat;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.UserUnit;
import kotlin.Metadata;
import nj.a;
/* compiled from: ClockModeConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/device/setup/android/setup/init/clockmode/ClockModeConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ClockModeConversation extends WppDeviceConversation {
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        int i11;
        boolean is24HourFormat = DateFormat.is24HourFormat(r());
        a aVar = new a(x());
        UserUnit userUnit = new UserUnit();
        userUnit.cmd = (short) 0;
        userUnit.type = 4;
        if (is24HourFormat) {
            i11 = 26;
        } else {
            i11 = 27;
        }
        userUnit.unit = i11;
        aVar.c((short) 274, userUnit);
        aVar.j();
    }
}
