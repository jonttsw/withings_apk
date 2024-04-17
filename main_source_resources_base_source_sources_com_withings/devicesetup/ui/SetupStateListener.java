package com.withings.devicesetup.ui;

import android.content.Context;
import android.os.Parcelable;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.devicesetup.conversation.SetupConversation;
/* loaded from: classes3.dex */
public interface SetupStateListener extends Parcelable {
    default void b2(WppDeviceConversation wppDeviceConversation) {
    }

    default void e1(SetupConversation setupConversation) {
    }

    default void i0(WppDeviceConversation wppDeviceConversation) {
    }

    default void z1(SetupConversation setupConversation) {
    }

    default void U1(Context context, aj.b bVar) {
    }

    default void g0(SetupConversation setupConversation, boolean z5) {
    }

    default void P(Context context, aj.b bVar, u70.i iVar) {
    }
}
